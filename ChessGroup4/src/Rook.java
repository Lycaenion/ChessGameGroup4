import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rook extends Piece implements IPieceLogic {

    ImageView whiteRook = new ImageView(new Image("/bilderchess/white_rook.png"));
    ImageView blackRook = new ImageView(new Image("/bilderchess/black_rook.png"));

    public Rook(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    @Override
    public void movePiece() {

    }

    @Override
    public boolean isMovePossible() {
        return false;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
