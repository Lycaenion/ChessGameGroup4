
public class Piece {
    private int xPosition;
    private int yPosition;
    private final int pieceImageHeight;
    private final int pieceImageWidth;



    public Piece(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.pieceImageHeight = 50;
        this.pieceImageWidth = 50;



    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getPieceImageHeight() {
        return pieceImageHeight;
    }


    public int getPieceImageWidth() {
        return pieceImageWidth;
    }


}
