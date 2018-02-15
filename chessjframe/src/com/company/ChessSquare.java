package com.company;

public class ChessSquare {

    private Piece piece;


    public ChessSquare(){

    }


    public ChessSquare(Piece piece){
        this.piece = piece;
    }

    public Piece getPiece(){
        return this.piece;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public void removePiece(){
        this.piece = null;
    }



}
