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
import com.company.Piece.Color;


public class GameBoard {

    static Piece whitePawn = new Pawn(Color.BLACK);

    JFrame f = new JFrame("Chess!");
    JPanel p = new JPanel(new GridLayout(9,9,2,2));
    JPanel border = new JPanel(new BorderLayout(0,0));
    JToolBar menu = new JToolBar();

    private final int HEIGHT = 600;
    private final int WIDTH = 600;
    private final int ROWS = 8;
    private final int COLUMNS = 8;
    private JButton[][] squares = new JButton[ROWS][COLUMNS];

    public static Piece[][] board =
            new Piece[][]{
                    new Piece[]{
                            whitePawn, whitePawn, whitePawn, whitePawn, whitePawn,
                            whitePawn, whitePawn, whitePawn},
                    new Piece[]{
                            whitePawn, whitePawn, whitePawn, whitePawn, whitePawn,
                            whitePawn, whitePawn, whitePawn},
                    new Piece[]{whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn},
                    new Piece[]{whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn},
                    new Piece[]{whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn},
                    new Piece[]{whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn, whitePawn},
                    new Piece[]{
                            whitePawn, whitePawn, whitePawn, whitePawn, whitePawn,
                            whitePawn, whitePawn, whitePawn},
                    new Piece[]{
                            whitePawn, whitePawn, whitePawn, whitePawn, whitePawn,
                            whitePawn, whitePawn, whitePawn},
            };

    public void makeBoard(JFrame game){

        menu.setFloatable(false);
        Action movePieces = new AbstractAction("Make a move") {
            @Override
            public void actionPerformed(ActionEvent e) {
                //   movePiece();
            }
        };
        for (int i = 0; i < 25; i++) {
            menu.addSeparator();
        }
        menu.add(movePieces);
        p.setBorder(new EmptyBorder(5,5,0,5));

        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLUMNS; y++) {
                JButton tiles = new JButton();


                if ((x+y)%2==0){
                    tiles.setBackground(WHITE);
                }else {
                    tiles.setBackground(RED);
                }
                tiles.add(new JLabel(board[x][y].icon));
                tiles.setEnabled(false);
                squares[x][y] = tiles;
                p.add(tiles);

            }
        }

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

    /*public void movePiece(){
        ImageIcon icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\ChessTest2\\src\\bilderchess\\black_knight.png");
        squares[0][0].setIcon(icon);
    }*/
}

