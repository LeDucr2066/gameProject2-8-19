import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.JPanel;

public class GameScreen extends JPanel {
    //window Dimensions
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int CENTERX = WIDTH/2;
    public static final int CENTERY = HEIGHT/2;

    public GameScreen(){
        super(); //I dont know what this does but I was told to put it here
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
        init();
    }

    BufferedImage img = null;
    private void init(){
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/Pictures/workplease.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (img != null){
            g.drawImage(img, 0, 0, null);
        }
    }

}
