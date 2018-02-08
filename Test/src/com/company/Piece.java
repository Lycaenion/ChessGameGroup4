package com.company;

import javax.swing.*;

public abstract class Piece {
    enum ChessPiece{
        PAWN, ROOK
    }

    enum Color{
        WHITE, BLACK
    }


    int value;
    ImageIcon icon;
    Color color;
    ChessPiece piece;

    Piece(){
    }


    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    Piece(Color color){
        this.color = color;
        this.value = value;
        this.icon = icon;
        this.piece = piece;
    }

    public void setPiece(){
        this.piece = piece;
    }

}
