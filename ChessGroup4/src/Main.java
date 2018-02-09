import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                new GameBoard();

            }
        };
        SwingUtilities.invokeLater(r);
    }
}

