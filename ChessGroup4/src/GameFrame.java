import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        super("Game Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Squares squares = new Squares();
        getContentPane().add(squares);
        for (int i = 0; i < 15; i++) {
            squares.addSquare(i * 10, i * 10, 100, 100);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GameFrame();
    }

}

