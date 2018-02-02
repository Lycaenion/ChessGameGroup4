public class Pawn extends Piece implements IPieceLogic {

    public Pawn(int xPosition, int yPosition, boolean pieceIsWhite, String pieceImageName) {
        super(xPosition, yPosition, pieceIsWhite, pieceImageName);
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
