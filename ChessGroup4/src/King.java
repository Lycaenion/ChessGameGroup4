import javax.swing.*;

class King extends Piece {

    public King(boolean white) {
        this.white = white;
        this.str = (white) ? "K" : "k";

        String imgstr = "bilderchess/" + ((white) ? "white_king.png" : "black_king.png");
        this.img = new ImageIcon( getClass().getResource(imgstr) );
    }

    @Override
    boolean validMove(int xfrom, int yfrom, int xto, int yto, boolean capture) {
        // A King can move one space in either or both the x and y direction.
        return (Math.abs(xfrom - xto) <= 1 &&
                Math.abs(yfrom - yto) <= 1);
    }
}