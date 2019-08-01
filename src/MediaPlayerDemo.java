import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.media.*;

public class MediaPlayerDemo extends JFrame {
  public static void main(String args[]) throws IOException, NoPlayerException {
    Player player;

    File file = new File("C:\\Users\\mazhar\\Desktop\\rhymes\\Baa Baa Black Sheep - The Joy of Sharing!.mp4");

    player = Manager.createPlayer(file.toURI().toURL());
//    player.addControllerListener(new EventHandler());
    player.start(); // start player
    
    player.close();

    Component visual = player.getVisualComponent();
    Component control = player.getControlPanelComponent();

  }
}
