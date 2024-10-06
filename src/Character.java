import java.awt.*;
import java.awt.event.KeyEvent;

public class Character {
    Maze maze=new Maze();
    int x=40;
    int y=40;
    int width=40;
    int height=40;
    int motion=40;

    public void paint(Graphics graphic){
        graphic.setColor(Color.red);
        graphic.fillOval(x, y, width, height);
        graphic.setColor(Color.black);
        graphic.drawOval(x,y, width, height);

        //eyes

    }

    public void keyPressed(KeyEvent event){

    }
}
