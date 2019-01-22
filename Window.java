import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Window {

  public static void main(String[] args) {

    startGame();

  }

  public static void startGame() {

    // window settings
    JFrame window = new JFrame();
    window.setTitle("GAME");
    window.setSize(800, 500);
    window.setLocationRelativeTo(null);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel camera = new JPanel();
    camera.setPreferredSize(new Dimension(800,500));

    // final window touches
    window.add(camera);
    window.pack();
    window.setResizable(false);
    window.setVisible(true);
    

  }

}
