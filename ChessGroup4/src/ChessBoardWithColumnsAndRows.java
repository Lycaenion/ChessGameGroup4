import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

public class ChessBoardWithColumnsAndRows {
    private float[] hotPink = new float[]{0.92f};

    private final JPanel gui = new JPanel(new BorderLayout(3, 3));
    private Squares[][] chessBoardSquares = new Squares[8][8];
    private JPanel chessBoard;
    private final JLabel message = new JLabel(
            "Chess Champ is ready to play!");
    private static final String COLS = "ABCDEFGH";

    ChessBoardWithColumnsAndRows() {
        initializeGui();
    }

    public final void initializeGui() {
        // set up the main GUI
        gui.setBorder(new EmptyBorder(5, 5, 5, 5));
        JToolBar tools = new JToolBar();
        tools.setFloatable(false);
        gui.add(tools, BorderLayout.PAGE_START);
        chessBoard = new JPanel(new GridLayout(0, 9));
        chessBoard.setBorder(new LineBorder(Color.BLACK));
        gui.add(chessBoard);

        // create the chess board squares
        Insets buttonMargin = new Insets(0,0,0,0);
        for (int columns = 0; columns < chessBoardSquares.length; columns++) {
            for (int rows = 0; rows < chessBoardSquares[columns].length; rows++) {
                Squares b = new Squares();
                b.getPreferredSize();
                // our chess pieces are 64x64 px in size, so we'll
                // 'fill this in' using a transparent icon..
                if ((rows % 2 == 1 && columns % 2 == 1)
                        //) {
                        || (rows % 2 == 0 && columns % 2 == 0)) {
                    b.setBackground(Color.getHSBColor(	330, 58.8f, 100));
                } else {
                    b.setBackground(Color.BLACK);
                }
                chessBoardSquares[rows][columns] = b;
            }
        }

        //fill the chess board
        chessBoard.add(new JLabel(""));
        // fill the top row
        for (int ii = 0; ii < 8; ii++) {
            chessBoard.add(
                    new JLabel(COLS.substring(ii, ii + 1),
                            SwingConstants.CENTER));
        }
        // fill the black non-pawn piece row
        for (int ii = 0; ii < 8; ii++) {
            for (int jj = 0; jj < 8; jj++) {
                switch (jj) {
                    case 0:
                        chessBoard.add(new JLabel("" + (ii + 1),
                                SwingConstants.CENTER));
                    default:
                        chessBoard.add(chessBoardSquares[jj][ii]);
                }
            }
        }
    }

    public final JComponent getChessBoard() {
        return chessBoard;
    }

    public final JComponent getGui() {
        return gui;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                ChessBoardWithColumnsAndRows cb =
                        new ChessBoardWithColumnsAndRows();

                JFrame f = new JFrame("ChessChamp");
                f.add(cb.getGui());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);

                // ensures the frame is the minimum size it needs to be
                // in order display the components within it
                f.pack();
                // ensures the minimum size is enforced.
                f.setMinimumSize(f.getSize());
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}

class Squares extends JPanel {
    private static final int PREF_W = 45;
    private static final int PREF_H = PREF_W;
    private List<Rectangle> squares = new ArrayList<Rectangle>();

    public void addSquare(int x, int y, int width, int height) {
        Rectangle rect = new Rectangle(x, y, width, height);
        squares.add(rect);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(PREF_W, PREF_H);
    }
}

