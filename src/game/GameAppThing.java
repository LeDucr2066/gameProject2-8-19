import javax.swing.*;
import java.awt.*;

public class GameAppThing extends JApplet {
    private GameScreen gameScreen;

    public void init(){
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        gameScreen = new GameScreen();
        pane.add(gameScreen);
        this.setSize(GameScreen.WIDTH, GameScreen.HEIGHT);



    }
}
