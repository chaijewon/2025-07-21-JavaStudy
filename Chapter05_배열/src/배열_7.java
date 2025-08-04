import javax.swing.*;
import java.awt.*;
public class 배열_7 extends JFrame{
    JButton[] btns=new JButton[9];
    public 배열_7() // 변수 초기화 
    {
    	setLayout(new GridLayout(3, 3,5,5));
    	for(int i=0;i<btns.length;i++)
    	{
    		btns[i]=new JButton((i+1)+"번");
    		add(btns[i]);
    	}
    	setSize(450, 450);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 배열_7();
	}

}
