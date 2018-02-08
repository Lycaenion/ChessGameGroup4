package com.company;

import javax.swing.*;


public class Pawn extends Piece {

    public Pawn(){

    }

    public Pawn(boolean color) {
        this.value = 1;
        this.piece = ChessPiece.PAWN;

        if (color) {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\white_pawn.png");
        } else {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\black_pawn.png");
        }
    }

}
