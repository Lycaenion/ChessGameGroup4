package com.company;

import javax.swing.*;

public class King extends Piece{

    public King(boolean color) {
        this.value=100;
        this.piece=ChessPiece.KING;

        if(color) {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\white_king.png");
        }else{
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\untitled11\\src\\bilder\\black_king.png");
        }

    }
}
