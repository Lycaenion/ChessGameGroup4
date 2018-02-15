import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Piece {

    public boolean white;
    protected ImageIcon img;

    public Piece(boolean white) {
        this.white = white;
    }

    public String imgPath()
    {
        return "bilderchess/";
    }

    public boolean isWhite() {
        return white;
    }

    public ImageIcon getImg() {
        return img;
    }
}
