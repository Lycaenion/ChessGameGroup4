import javax.swing.*;

public class Rook extends Piece {

    public Rook(boolean white)
    {
        super(white);
        this.white = white;

        String imageString = imgPath() + ((white) ? "white_rook.png" : "black_rook.png");
        this.img = new ImageIcon( getClass().getResource(imageString));
    }
}
