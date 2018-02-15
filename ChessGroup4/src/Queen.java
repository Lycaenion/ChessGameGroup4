import javax.swing.*;

class Queen extends Piece {

    public Queen(boolean white) {
        this.white = white;
        this.str = (white) ? "Q" : "q";

        String imgstr = "bilderchess/" + ((white) ? "white_queen.png" : "black_queen.png");
        this.img = new ImageIcon( getClass().getResource(imgstr) );
    }

    @Override
    boolean validMove(int xfrom, int yfrom, int xto, int yto, boolean capture) {
        // A Queen can move any number of spaces vertically, horizontally,
        // diagonally, in any direction.
        return (isDiagonal(xfrom, yfrom, xto, yto) ||
                isUpDownLeftRight(xfrom, yfrom, xto, yto));
    }
}