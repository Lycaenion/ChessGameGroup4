
public class BoardComponent {

    public static Piece[][] myPieces = new Piece[8][8];


    BoardComponent()
    {
        addPieces();
    }

    private void addPieces()
    {
        myPieces[0][0] = new Rook(true);
        myPieces[0][7] = new Rook(true);
    }

}