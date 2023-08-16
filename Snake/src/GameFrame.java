import javax.swing.JFrame;

public class GameFrame extends JFrame {

    // Creates the frame
    GameFrame() {

        GamePanel panel = new GamePanel();

        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
