package com.company;


import javax.swing.*;

public class Piece {


    enum ChessPiece{
        PAWN
    }


    ImageIcon icon;
    boolean color;
    int value;
   // ChessPiece type;


    public Piece(boolean color) {
        this.icon = icon;
        this.color = color;
        this.value = value;
        if (color){
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\chessjframe\\src\\com\\company\\bilder\\white_pawn.png");
        }else {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\chessjframe\\src\\com\\company\\bilder\\black_pawn.png");
        }

    }
}
