public class Piece {
    private int xPosition;
    private int yPosition;
    private final int pieceImageHeight;
    private final int pieceImageWidth;
    private boolean pieceIsWhite;
    private String pieceImageName;

    public Piece(int xPosition, int yPosition, boolean pieceIsWhite, String pieceImageName) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.pieceImageHeight = 50;
        this.pieceImageWidth = 50;
        this.pieceIsWhite = pieceIsWhite;
        this.pieceImageName = pieceImageName;
    }

    public String getPieceImageName() {
        return pieceImageName;
    }

    public void setPieceImageName(String pieceImageName) {
        this.pieceImageName = pieceImageName;
    }

    public boolean isPieceIsWhite() {
        return pieceIsWhite;
    }

    public void setPieceIsWhite(boolean pieceIsWhite) {
        this.pieceIsWhite = pieceIsWhite;
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
