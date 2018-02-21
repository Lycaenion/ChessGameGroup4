public class EmptyTile extends Piece {


    public EmptyTile() {
        this.img = null;

    }

    @Override
    boolean validMove(int xfrom, int yfrom, int xto, int yto, boolean capture) {
        return false;
    }
}