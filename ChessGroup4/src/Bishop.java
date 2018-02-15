import javax.swing.*;

class Bishop extends Piece {

    public Bishop(boolean white) {
        this.white = white;
        this.str = (white) ? "B" : "b";

        String imgstr = "bilderchess/" + ((white) ? "white_bishop.png" : "black_bishop.png");
        this.img = new ImageIcon( Piece.class.getResource(imgstr) );
    }

    @Override
    boolean validMove(int xfrom, int yfrom, int xto, int yto, boolean capture) {
        return isDiagonal(xfrom, yfrom, xto, yto);
    }
}