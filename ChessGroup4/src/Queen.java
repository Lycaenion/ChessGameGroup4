import javax.swing.*;

public class Queen extends Piece{
    public Queen(boolean color) {
        this.value=20;
        this.piece=ChessPiece.QUEEN;

        if(color) {
            String whiteQueen = "white_queen.png";
            this.icon = new ImageIcon(imageURL + whiteQueen);
        }else{
            String blackQueen = "black_queen.png";
            this.icon = new ImageIcon(imageURL + blackQueen);
        }

    }
}