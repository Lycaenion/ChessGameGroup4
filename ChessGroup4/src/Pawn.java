import javax.swing.*;

public class Pawn extends Piece{

    public Pawn(boolean color) {
        this.value=20;
        this.piece=ChessPiece.PAWN;

        if(color) {
            String whitePawn = "white_pawn.png";
            this.icon = new ImageIcon(imageURL + whitePawn);
        }else{
            String blackPawn = "black_pawn.png";
            this.icon = new ImageIcon(imageURL + blackPawn);
        }

    }
}