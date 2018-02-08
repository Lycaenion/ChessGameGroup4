package com.company;

import javax.swing.*;

public class Piece {
    enum ChessPiece{
        PAWN, ROOK
    }

    //enum Color{
   //     WHITE, BLACK
   // }


    int value;
    ImageIcon icon;
    boolean color;
    ChessPiece piece;

    public void setColor(){
        this.color = color;
    }

    /*public Color getColor() {
        return color;
    }*/

    Piece(){
        this.color = color;
        this.value = value;
        this.icon = icon;
        this.piece = piece;
    }

    public void setPiece(){
        this.piece = piece;
    }

}
