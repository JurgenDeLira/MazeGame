import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game extends JPanel{
    Maze labyrinth = new Maze();
    Character character = new Character();
    public static int level=1;

    public Game(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                character.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
            setFocusable(true);
    }

    public void paint(Graphics graphic){
        labyrinth.paint(graphic);
        character.paint(graphic);
    }

    public static int changeLevel(){
        return level++;
    }

    public static int getLevel(){
        return level;
    }


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¿Are you ready?");
        JFrame myWindow= new JFrame("Maze Game");
        Game game = new Game();
        myWindow.add(game);
        myWindow.setSize(920,540);
        myWindow.setLocation(300,200);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
            game.repaint();

            if(getLevel()>3){
                JOptionPane.showMessageDialog(null, "Bye Bye");
                System.exit(0);
            }
        }
    }
}