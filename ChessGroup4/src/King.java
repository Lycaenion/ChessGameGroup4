import javax.swing.*;

public class King extends Piece{

    public King(boolean color) {
        this.value=20;
        this.piece=ChessPiece.KING;

        if(color) {
            String whiteKing = "white_king.png";
            this.icon = new ImageIcon(imageURL + whiteKing);
        }else{
            String blackKing = "black_king.png";
            this.icon = new ImageIcon(imageURL + blackKing);
        }

    }
}