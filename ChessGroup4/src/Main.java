import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        try{
            launch(args);
            System.exit(0);
        }catch (Exception error){
            error.printStackTrace();
            System.exit(0);
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        GameBoard gameBoard = new GameBoard();
        gameBoard.createBoard(primaryStage);
    }
}
