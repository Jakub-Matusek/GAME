import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Window {

  static final int WINDOW_SIZE_X = 800;
  static final int WINDOW_SIZE_Y = 500;

  public static void main(String[] args) {

    startGame();

  }

  public static void startGame() {

    // window settings
    JFrame window = new JFrame();
    window.setTitle("GAME");
    window.setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);
    window.setLocationRelativeTo(null);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel camera = new JPanel();
    camera.setPreferredSize(new Dimension(WINDOW_SIZE_X, WINDOW_SIZE_Y));

    // spawn player
    Player player = new Player();
    player.spawnPlayer();
    camera.add(player);

    // final window touches
    window.add(camera);
    window.pack();
    window.setResizable(false);
    window.setVisible(true);
    

  }

}
