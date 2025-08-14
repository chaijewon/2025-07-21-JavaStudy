package com.sist.test;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 편성 extends JFrame implements ActionListener{
    JButton[] btns=new JButton[19];
    String[] names={"김요한","박준현","유지수","김나린","김준수","방다혜","김채연","전현빈",
    		"오승준","배병우","김준홍","김기현","박현수","정주희","권혁준","김진용","문종호","양현욱","허정운"};
    JButton b1,b2;
    public 편성()
    {
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(5,4,5,5));
    	for(int i=0;i<btns.length;i++)
    	{
    		btns[i]=new JButton(names[i]);
    		p.add(btns[i]);
    		btns[i].addActionListener(this);
    	}
    	
    	b1=new JButton("초기화");
    	b2=new JButton("종료");
    	JPanel p2=new JPanel();
    	p2.add(b1);
    	p2.add(b2);
    	
    	add("Center",p);
    	add("South",p2);
    	setSize(450, 450);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 편성();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
