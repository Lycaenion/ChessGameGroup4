import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameBoard {

    public void createBoard(Stage primaryStage) {
        primaryStage.setTitle("Chess Showdown");
        BorderPane root = new BorderPane();
        Scene primaryScene = new Scene(root, 500, 400);
        primaryStage.setScene(primaryScene);
        GridPane grid = new GridPane();
        root.setCenter(grid);

        //White Pieces
        Pawn WHITEPAWN = new Pawn(0,1);
        Rook WHITEROOK = new Rook(0,0);

        //Black Pieces
        Pawn BLACKPAWN = new Pawn(7,6);
        Rook BLACKROOK = new Rook(7,7);


        //creates chess board
        for (int column = 0; column < 8; column++) {
            for (int row = 0; row < 8; row++) {
                Rectangle rect = new Rectangle();
                rect.setHeight(50);
                rect.setWidth(50);
                if ((column + row) % 2 == 0) {
                    rect.setFill(Color.GREY);
                } else {
                    rect.setFill(Color.HOTPINK);
                }
                GridPane.setColumnIndex(rect, column);
                GridPane.setRowIndex(rect, row);
                grid.getChildren().addAll(rect);

            }
        }

        // Adds pawn and rook pieces to the grid
        grid.add(WHITEPAWN.whitePawn,WHITEPAWN.getxPosition(),WHITEPAWN.getyPosition());
        grid.add(WHITEROOK.whiteRook,WHITEROOK.getxPosition(),WHITEROOK.getyPosition());

        grid.add(BLACKROOK.blackRook,BLACKROOK.getxPosition(),BLACKROOK.getyPosition());
        grid.add(BLACKPAWN.blackPawn,BLACKPAWN.getxPosition(),BLACKPAWN.getyPosition());
        primaryStage.show();
    }

}

