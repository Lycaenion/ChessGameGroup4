import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                BoardComponent gameBoard = new BoardComponent();
                Renderer renderer = new Renderer();

                renderer.updatePieces();



            }
        };
        SwingUtilities.invokeLater(runnable);
    }
}
