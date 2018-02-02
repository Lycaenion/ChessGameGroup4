import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Piece implements IPieceLogic {

    ImageView whitePawn = new ImageView(new Image("/bilderchess/white_pawn.png"));
    String blackPawn = "/bilderchess/black_pawn.png";

    public Pawn(int xPosition, int yPosition, boolean pieceIsWhite) {
        super(xPosition, yPosition, pieceIsWhite);

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
