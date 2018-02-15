package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Piece {
    enum ChessPiece{
        PAWN, ROOK, KING
    }

    //enum Color{
   //     WHITE, BLACK
   // }

    List<Piece> pieces = new ArrayList<>();
    Pawn pawn = new Pawn(true);



    int value;
    ImageIcon icon;
    boolean color;
    ChessPiece piece;

    public void setColor(){
        this.color = color;
    }

    public void addPiecesToList() {
        pieces.add(pawn);
    }

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
