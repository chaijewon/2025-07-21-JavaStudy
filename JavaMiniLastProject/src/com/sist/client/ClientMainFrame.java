package com.sist.client;
import javax.swing.*;
import java.awt.*; // 배치 => 레이아웃 
import java.awt.event.*; // 이벤트 처리 
public class ClientMainFrame extends JFrame
implements ActionListener
{
	MenuForm menu=new MenuForm();
	ControllerPanel cp=new ControllerPanel();
	// has-a => 포함 클래스 
    public ClientMainFrame()
    {
    	setLayout(null);
    	menu.setBounds(200, 15,750 , 50);
    	cp.setBounds(10, 75,990, 580);
    	add(menu);
    	add(cp);
    	setSize(1024, 700);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	menu.b1.addActionListener(this);
    	menu.b5.addActionListener(this);
    	menu.b6.addActionListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//                                         hifi  HiFiLook~
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception e) {}
        new ClientMainFrame();// 생성자 호출 
        // ClientMainFrame c=new ClientMainFrame();
        
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==menu.b1)
		{
			cp.card.show(cp, "HF");
		}
		else if(e.getSource()==menu.b5)
		{
			cp.card.show(cp, "CF");
		}
		else if(e.getSource()==menu.b6)
		{
			cp.card.show(cp, "BF");
		}
	}

}
