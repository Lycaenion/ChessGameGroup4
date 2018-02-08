import javax.swing.*;

public class Game {
    Game()
    {
        GameBoard board = new GameBoard();

        JFrame f = new JFrame("Chess Game");
        f.add(board.getGui());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.pack();
        f.setMinimumSize(f.getSize());
        f.setVisible(true);

    }
}
