/*
 *    선택문 : 웹에서는 거의 사용빈도가 없다 
 *    ------------------------------
 *      Back-End / Front-End / DBA 
 *     => switch(state) ==> XML
 *        {
 *          case  MEMBER_LIST:
 *                 sql="SELECT * FROM member"
 *                 break;
 *          case  MEMBER_DETAIL:
 *                 ...
 *                 ...
 *        }
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 정리_5 extends JFrame implements ItemListener{
    JComboBox box=new JComboBox();
    JLabel la=new JLabel();
    
    public 정리_5()
    {
    	box.addItem("1번 그림");
    	box.addItem("2번 그림");
    	box.addItem("3번 그림");
    	la.setIcon(new ImageIcon("c:\\javaDev\\m1.jpg"));
    	
    	add("North",box);
    	add("Center",la);
    	setSize(500, 500);
    	setVisible(true);
    	box.addItemListener(this);// 콤보에서 선택이 변경된 경우 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 정리_5();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			switch(box.getSelectedIndex())
			{
			case 0:
				la.setIcon(new ImageIcon("c:\\javaDev\\m1.jpg"));
				break;
			case 1:
				la.setIcon(new ImageIcon("c:\\javaDev\\m2.jpg"));
				break;
			case 2:
				la.setIcon(new ImageIcon("c:\\javaDev\\m3.jpg"));
				
			}
		}
	}

}
