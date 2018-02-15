import javax.swing.*;

class Knight extends Piece {

    public Knight(boolean white) {
        this.white = white;
        this.str = (white) ? "N" : "n";

        String imgstr = "bilderchess/" + ((white) ? "white_knight.png" : "black_knight.png");
        this.img = new ImageIcon( Piece.class.getResource(imgstr) );
    }

    @Override
    boolean validMove(int xfrom, int yfrom, int xto, int yto, boolean capture) {
        return ((Math.abs(xfrom - xto) == 1 && Math.abs(yfrom - yto) == 2) ||
                (Math.abs(yfrom - yto) == 1 && Math.abs(xfrom - xto) == 2));
    }
}