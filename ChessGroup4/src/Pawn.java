public class Pawn extends Piece{

    public Pawn(boolean color, String type, String imageURL) {
        super(color, type, imageURL);
        this.type = "pawn";
        this.imageURL = imageURL();
    }

    public String imageURL(){
        if (color){
            return "C:\\Users\\Jonas\\Desktop\\ChessProjekt\\ChessGameGroup4\\ChessGroup4\\src\\bilderchess\\white_pawn.png";
        }else {
            return "C:\\Users\\Jonas\\Desktop\\ChessProjekt\\ChessGameGroup4\\ChessGroup4\\src\\bilderchess\\black_pawn.png";
        }

    }


}
