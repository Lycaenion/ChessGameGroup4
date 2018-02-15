package com.company;

import javax.swing.*;
import java.awt.*;

public class ChessBoard {

    private Piece piece;
    public static ChessSquare[][] squares;
    public final int ROW = 8;
    public final int COLUMN = 8;

    public static JButton[][] board = new JButton[8][8];
    private JFrame f = new JFrame("Chess");
    private JPanel p = new JPanel(new GridLayout(9,9,2,2));
    private JToolBar menu = new JToolBar();
    private JPanel border = new JPanel(new BorderLayout(10,10));


   /* ChessBoard(){
        squares = new ChessSquare[8][8];
    }*/


   public void tiles(){
       for (int x = 0; x <ROW ; x++) {
           for (int y = 0; y <COLUMN ; y++) {
               squares[x][y] = new ChessSquare();
           }
       }
   }

   public void addPieces(){
       squares[0][0].setPiece(new Pawn(true));
   }

   public void updatePieces(){
       p.removeAll();
       for (int x = 0; x < 8; x++) {
           for (int y = 0; y < 8; y++) {
            if (squares[x][y].getPiece() != null){
                Piece piece = squares[x][y].getPiece();
                JButton button = new JButton();
                button.setIcon(new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\chessjframe\\src\\com\\company\\bilder\\white_pawn.png"));
            }


           }
       }
       p.revalidate();
       p.repaint();
       f.revalidate();
       f.repaint();
   }


    public void createBoard(JFrame f){

        for (int x = 0; x < ROW; x++) {
            for (int y = 0; y < COLUMN; y++) {
                JButton squares = new JButton();
               // board[x][y] = new ChessSquare();
                if ((x+y)%2==0){
                    squares.setBackground(Color.WHITE);
                }else {
                    squares.setBackground(Color.GRAY);
                }
                board[x][y] = squares;
                squares.setEnabled(false);
                p.add(squares);

            }
        }




        border.add(menu, BorderLayout.PAGE_START);
        border.add(p);
        f.add(border);


    }

    public void showBoard(){
        createBoard(f);
        addPieces();
        tiles();
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(600,600);

    }


}
