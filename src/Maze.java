import java.awt.*;

public class Maze {
    int[][]maze=new int[13][23];
    int row=0;
    int column=0;
    int rowsNumber=13;
    int columnsNumber=23;
    int blockWidth=40;
    int blockHeight=40;

    public void paint(Graphics graphic){
    }
    public int [][] getMaze(){
        return maze;
    }
}
