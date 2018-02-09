import javax.swing.*;

public class Rook extends Piece{

    public Rook(boolean color) {
        this.value=20;
        this.piece=ChessPiece.ROOK;

        if(color) {
            String whiteRook = "white_rook.png";
            this.icon = new ImageIcon(imageURL + whiteRook);
        }else{
            String blackRook = "black_rook.png";
            this.icon = new ImageIcon(imageURL + blackRook);
        }
    }
}