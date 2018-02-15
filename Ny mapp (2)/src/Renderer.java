
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.*;
import javax.swing.border.Border;


public class Renderer extends JFrame {
    final static int WIDTH = 8;
    final static int HEIGHT = 8;
    JFrame frame;
    Board panel = new Board();
    JButton nextMove = new JButton("Move");

    public Renderer() {
        gui();
        System.out.println("BOARD CREATED");
    }


    public void updatePieces() {
        panel.removeAll();
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (BoardComponent.myPieces[y][x] != null) {
                    Piece piece = BoardComponent.myPieces[y][x];
                    JButton button = new JButton();
                    button.setIcon(piece.getImg());
                    button.setBounds(x * 75, y * 75, 75, 75);
                    button.setOpaque(false);
                    button.setContentAreaFilled(false);
                    button.setBorderPainted(false);
                    panel.add(button);
                }
            }
        }
        panel.revalidate();
        panel.repaint();
        frame.revalidate();
        frame.repaint();
    }


    public void gui() {
        frame = new JFrame("CHESS");
        frame.setSize(700, 650);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        panel.setLayout(null);
        frame.add(panel);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(nextMove);
        frame.add(buttonPanel, BorderLayout.EAST);

    }



}
