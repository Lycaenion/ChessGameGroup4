import javax.swing.*;

public class Main2 {

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                GameBoard2 board = new GameBoard2();

                JFrame f = new JFrame("Chess Game");
                f.add(board.getGui());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);
                f.pack();
                f.setMinimumSize(f.getSize());
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}