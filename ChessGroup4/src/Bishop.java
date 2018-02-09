import javax.swing.*;

public class Bishop extends Piece{

    public Bishop(boolean color) {
        this.value=20;
        this.piece=ChessPiece.BISHOP;

        if(color) {
            String whiteBishop = "white_bishop.png";
            this.icon = new ImageIcon(imageURL + whiteBishop);
        }else{
            String blackBishop = "black_bishop.png";
            this.icon = new ImageIcon(imageURL + blackBishop);
        }

    }
}