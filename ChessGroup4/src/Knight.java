import javax.swing.*;

public class Knight extends Piece{

    public Knight(boolean color) {
        this.value=20;
        this.piece=ChessPiece.KNIGHT;

        if(color) {
            String whiteKnight = "white_knight.png";
            this.icon = new ImageIcon(imageURL + whiteKnight);
        }else{
            String blackKnight = "black_knight.png";
            this.icon = new ImageIcon(imageURL + blackKnight);
        }

    }
}