import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Piece implements IPieceLogic {

    ImageView whitePawn = new ImageView(new Image("/bilderchess/white_pawn.png"));
    ImageView blackPawn = new ImageView(new Image("/bilderchess/black_pawn.png"));

    public Pawn(int xPosition, int yPosition) {
        super(xPosition, yPosition);

    }


    @Override
    public void movePiece() {

    }

    @Override
    public boolean isMovePossible() {
        return true;
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
