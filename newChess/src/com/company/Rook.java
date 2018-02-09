package com.company;


import javax.swing.*;

public class Rook extends Piece{

    public Rook(boolean color) {
        this.value=20;
        this.piece=ChessPiece.ROOK;

        if(color) {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\white_rook.png");
        }else{
                this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\black_rook.png");
        }

    }
}
