import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;


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

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        Random r = new Random();
        Color RandomColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
        g.setColor(RandomColor);

        for(int i=0; i < 3000; i++) {
            int x = Math.abs(r.nextInt() % WIDTH);
            int y = Math.abs(r.nextInt() % HEIGHT);

            System.out.println("x: " + x + "\ty:" + y);
            g.drawLine(x, y, x, y);
        }
    }

}
