import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GameBoard{
    // Environment variables
    public static Piece[][] board;
    public static BoardComponent boardComponent;
    public static final int PIECE_XY = 75;
    public static final int WIDTH = PIECE_XY*8, HEIGHT = PIECE_XY*8 ;

    // Game mechanic variables
    private static boolean whiteTurn;
    private static boolean testing;

    // AI - AI plays as the black army, player moves first
    public static boolean AI = true;

    public static void main(String[] args) {
        // Construct chess board
        board = new Piece[8][8];
        buildBoard(board);
        whiteTurn = true;

        // Initialize the frame
        JFrame window = new JFrame();
        window.setSize(WIDTH, HEIGHT);
        window.setTitle("Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the component, add mouse listener
        boardComponent = new BoardComponent();



        // LAST
        window.setVisible(true);
    }




    private static void buildBoard(Piece[][] board) {
        // Rows 0 and 1 will contain white pieces,
        // and rows 6 and 7 will contain black pieces.

        // Place pawns in rows 1 and 6
        for (int i = 0; i < board.length; i++) {
            board[1][i] = new Pawn(true);
            board[6][i] = new Pawn(false);
        }

        // Place white and black row pieces.
        placeBackRow(board, true, 0);
        placeBackRow(board, false, 7);
    }

    private static void placeBackRow(Piece[][] board, boolean white, int row) {
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
