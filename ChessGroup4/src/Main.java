import javafx.application.Application;
        import javafx.geometry.HPos;
        import javafx.geometry.VPos;
        import javafx.scene.Scene;
        import javafx.scene.control.Control;
        import javafx.scene.layout.ColumnConstraints;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.Priority;
        import javafx.scene.layout.RowConstraints;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    //Window settings
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chess Showdown");
        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 550, 650));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
