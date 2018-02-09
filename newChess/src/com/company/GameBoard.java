package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.company.Pawn;
import com.company.Piece;
import com.company.Piece.ChessPiece;

import javax.swing.*;
import javax.swing.border.Border;
import javax.xml.stream.StreamFilter;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import static java.awt.Color.*;



public class GameBoard {


    //White pieces
    static Piece whitePawn = new Pawn(true);
    static Piece whiteRook = new Rook(true);
    static Piece whiteKing = new King(true);


   //Black pieces
    static Piece blackKing = new King(false);
    static Piece blackPawn = new Pawn(false);
    static Piece blackRook = new Rook(false);

   private static Piece emptyTile = new EmptyTile();

   private JFrame f = new JFrame("Chess!");
   private JPanel p = new JPanel(new GridLayout(9,9,2,2));
   private JPanel border = new JPanel(new BorderLayout(10,10));
   private JToolBar menu = new JToolBar();

    private final int HEIGHT = 600;
    private final int WIDTH = 600;
    private static int ROWS = 8;
    private static int COLUMNS = 8;
    private static JButton[][] squares = new JButton[ROWS][COLUMNS];

    private static Piece[][] board = new Piece[8][8];



    private void makeBoard(JFrame game){


        //Place pieces
        for (int x = 0; x < 8 ; x++) {
            for (int y = 0; y < 8; y++) {

                board[0][3] = whiteKing;
                board[1][y] = whitePawn;
                board[0][0] = whiteRook;
                board[0][7] = whiteRook;

                board[7][3] = blackKing;
                board[6][y] = blackPawn;
                board[7][0] = blackRook;
                board[7][7] = blackRook;
                if (board[x][y]==null){
                    board[x][y]=emptyTile;
                }
            }
        }

        menu.setFloatable(false);
        Action movePieces = new AbstractAction("Make a move") {
            @Override
            public void actionPerformed(ActionEvent e) {
                   //movePiece();
            }
        };
        for (int i = 0; i < 25; i++) {
            menu.addSeparator();
        }
        menu.add(movePieces);
        p.setBorder(new EmptyBorder(5,5,0,5));



        //Create the chessboard
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLUMNS; y++) {
                JButton tiles = new JButton();


               // p.setBackground(Color.WHITE);
                if ((x+y)%2==0){
                    tiles.setBackground(WHITE);
                }else {
                    tiles.setBackground(GRAY);
                }
                tiles.setEnabled(false);
                squares[x][y] = tiles;
                tiles.add(new JLabel(board[x][y].icon));
                p.add(tiles);

            }
        }

        //Add the different layers correctly
        border.add(menu, BorderLayout.PAGE_START);
        border.add(p);
        game.add(border);

    }

    public void showBoard(){
        makeBoard(f);
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(WIDTH,HEIGHT);
    }

}

