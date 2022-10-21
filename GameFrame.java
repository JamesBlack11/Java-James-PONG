import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame{
//game panel is the canvas we are creating the game on
    GamePanel panel;
// game frame is the frame around the painting houses panel
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //causes window to be sized to preferred size of panel, adjusts accordingly
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
