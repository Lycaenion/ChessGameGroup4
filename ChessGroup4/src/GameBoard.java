import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import static java.awt.Color.*;

public class GameBoard {

    private JFrame f = new JFrame("Chess!");
    private JPanel p = new JPanel(new GridLayout(9,9,2,2));
    private JPanel border = new JPanel(new BorderLayout(10,10));
    private JToolBar menu = new JToolBar();
    private static int ROWS = 8;
    private static int COLUMNS = 8;
    private static Piece emptyTile = new EmptyTile();
    private static JButton[][] squares = new JButton[ROWS][COLUMNS];
    private static Piece[][] board = new Piece[8][8];


    GameBoard() { showBoard(); }

    private void addMoveButton()
    {
        menu.setFloatable(false);
        Action movePieces = new AbstractAction("Make a move") {
            @Override
            public void actionPerformed(ActionEvent e) { /*movePiece(); */ }};

        for (int i = 0; i < 25; i++) { menu.addSeparator(); }
        menu.add(movePieces);
        p.setBorder(new EmptyBorder(5,5,0,5));
    }

    private void createBoard(JFrame game)
    {
        //Create the chessboard
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLUMNS; y++) {
                JButton tiles = new JButton();

                //setBackgroundColor
                if ((x+y)%2==0){
                    tiles.setBackground(WHITE);
                }else {
                    tiles.setBackground(GRAY);
                }
                tiles.setEnabled(false);
                squares[x][y] = tiles;
                if (board[x][y]==null){
                    board[x][y]=emptyTile;
                }
                tiles.add(new JLabel(board[x][y].icon));
                p.add(tiles);
            }
        }
        //Add the different layers correctly
        border.add(menu, BorderLayout.PAGE_START);
        border.add(p);
        game.add(border);
    }


    private void showBoard()
    {
        int HEIGHT = 600;
        int WIDTH = 600;
        placeAllPiecesOnBoard();
        createBoard(f);
        addMoveButton();
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(WIDTH, HEIGHT);
    }


    // Places all pieces on the board
    private void placeAllPiecesOnBoard() {
        // Rows 0 and 1 will contain white pieces,
        // and rows 6 and 7 will contain black pieces.

        // Place pawns in rows 1 and 6
        for (int i = 0; i < board.length; i++) {
            board[1][i] = new Pawn(true);
            board[6][i] = new Pawn(false);
        }

        // Place white and black row pieces.
        placeBackRowPieces(true, 0);
        placeBackRowPieces(false, 7);
    }

    //Creates all pieces behind the pawns
    private void placeBackRowPieces(boolean white, int row) {
        // Place rooks on the outside
        board[row][0] = new Rook(white);
        board[row][7] = new Rook(white);

        // Place knights inside of rooks
        board[row][1] = new Knight(white);
        board[row][6] = new Knight(white);

        // Place bishops inside of knights
        board[row][2] = new Bishop(white);
        board[row][5] = new Bishop(white);

        // Place king and queen
        board[row][3] = new Queen(white);
        board[row][4] = new King(white);
    }

}