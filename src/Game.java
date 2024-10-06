import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game extends JPanel{
    public Game(){
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
        }


    }
}