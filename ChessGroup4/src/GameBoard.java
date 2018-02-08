import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;


public class GameBoard {

    private final int rows = 8;
    private final int columns = 8;
    private JButton[][] tiles = new JButton[rows][columns];

    private final JLabel message = new JLabel("Chess!");
    private static final String columnText = "ABCDEFGH";
    private JPanel chessBoard;

    private JPanel gui = new JPanel(new BorderLayout(3,3));

    GameBoard(){
        createGui();
    }


    public void createGui(){
        gui.setBorder(new EmptyBorder(5,5,5,5));
        JToolBar tools = new JToolBar();
        tools.setFloatable(false);
        gui.add(tools, BorderLayout.PAGE_START);
        tools.add(message);

        chessBoard = new JPanel(new GridLayout(0,9));
        chessBoard.setBorder(new LineBorder(Color.BLACK));
        gui.add(chessBoard);



        Insets buttonMargin = new Insets(0,0,0,0);
        for (int x = 0; x < tiles.length ; x++) {
            for (int y = 0; y < tiles.length; y++) {
                JButton square = new JButton();
                square.setMargin(buttonMargin);

                ImageIcon icon = new ImageIcon(
                        new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));

                square.setIcon(icon);
                if ((x+y)%2==0){
                    square.setBackground(Color.ORANGE);
                }else{
                    square.setBackground(Color.WHITE);
                }
                tiles[x][y] = square;
            }
        }
        chessBoard.add(new JLabel(""));
        chessBoard.setBackground(Color.LIGHT_GRAY);

        for (int x = 0; x < 8; x++){
            chessBoard.add(
                    new JLabel(columnText.substring(x,x+1),
                            SwingConstants.CENTER));
        }

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                switch (y){
                    case 0:
                        chessBoard.add(new JLabel(""+(x+1),
                                SwingConstants.CENTER));
                    default:
                        chessBoard.add(tiles[x][y]);
                }
            }
        }
    }

    public JComponent getChessBoard(){
        return chessBoard;
    }

    public JComponent getGui(){
        return gui;
    }


}