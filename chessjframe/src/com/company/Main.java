package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Runnable r = new Runnable() {
            @Override
            public void run() {
                ChessBoard board = new ChessBoard();
                board.showBoard();

            }
        };
        SwingUtilities.invokeLater(r);
    }
}