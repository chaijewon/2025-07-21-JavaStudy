import javax.swing.*;
public class 프로젝트_1 extends JFrame{
    public 프로젝트_1()
    {
    	setSize(640, 400);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception e) {}
		
        new 프로젝트_1();
	}

}
