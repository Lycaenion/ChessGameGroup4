package com.company;

import javax.swing.*;


public class Pawn extends Piece {

    public Pawn(){

    }

    public Pawn(Color color) {
        super(color);
        this.value = 1;
        this.piece = ChessPiece.PAWN;

        if (color == color.WHITE) {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\white_pawn.png");
        } else {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\white_pawn.png");
        }
    }

}
