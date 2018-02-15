import javax.swing.*;

class Rook extends Piece {

    public Rook(boolean white) {
        this.white = white;
        this.str = (white) ? "R" : "r";

        String imgstr = "bilderchess/" + ((white) ? "white_rook.png" : "black_rook.png");
        this.img = new ImageIcon( getClass().getResource(imgstr) );
    }

    @Override
    boolean validMove(int xfrom, int yfrom, int xto, int yto, boolean capture) {
        return isUpDownLeftRight(xfrom, yfrom, xto, yto);
    }
}