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
        graphic.setColor(Color.white);
        graphic.fillOval(x+7, y+8, 13, 13);
        graphic.fillOval(x+21,y+8,13,13);
        graphic.setColor(Color.black);
        graphic.fillOval(x+11,y+12,5,5);
        graphic.fillOval(x+25, y+12, 5, 5);

        //mouth
        graphic.setColor(Color.black);
        graphic.fillOval(x+7, y+24, 27, 7);

    }

    public void keyPressed(KeyEvent event){
        int[][]labyrinth=maze.getMaze();

        if(event.getKeyCode()==37){//LEFT
            if(labyrinth[y/40][(x/40)-1]!=1){
                x=x-motion;
            }
        }
        if(event.getKeyCode()==39){//RIGHT
            if(labyrinth[y/40][(x/40)+1]!=1){
                x=x+motion;
            }
        }
        if(event.getKeyCode()==40){//DOWN
            if(labyrinth[(y/40)+1][x/40]!=1){
                y=y+motion;
            }
        }
        if(event.getKeyCode()==38){//UP
            if(labyrinth[(y/40)-1][x/40]!=1){
                y=y-motion;
            }
        }

        //If top the end
        if(x==840 && y==440){
            Game.changeLevel();
            x=40;
            y=40;
        }
    }
}
