package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Runnable r = new Runnable() {
            @Override
            public void run() {
                GameBoard board = new GameBoard();
                board.showBoard();

            }
        };
        SwingUtilities.invokeLater(r);
    }
}
