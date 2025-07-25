import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame{
    GameView gv=new GameView();
    public MainFrame()
    {
    	add("Center",gv);
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainFrame();
	}

}
