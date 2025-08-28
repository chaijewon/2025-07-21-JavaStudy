package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import com.sist.dao.*;
// login ==> "100|id|pwd\m" => String => login.jsp?id=aaa&pwd=1234
public class ClientMainForm extends JFrame
implements ActionListener,MouseListener
{
    CardLayout card=new CardLayout();
    // LOGIN / JOIN / WAIT / ROOM
    Login login=new Login();
    JoinForm join=new JoinForm();
    PostFindForm post=new PostFindForm();
    public ClientMainForm()
    {
    	setLayout(card);
    	add("login",login);
    	add("join",join);
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	login.b1.addActionListener(this);
    	login.b2.addActionListener(this);
    	login.b3.addActionListener(this);
    	
    	join.b1.addActionListener(this);
    	join.b2.addActionListener(this);
    	join.b3.addActionListener(this);
    	join.b4.addActionListener(this);
    	
    	post.b1.addActionListener(this);
    	post.b2.addActionListener(this);
    	post.tf.addActionListener(this);
    	post.table.addMouseListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//                                         hifi  HiFiLook~
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception e) {}
        new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b3)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			
		}
		else if(e.getSource()==login.b2)
		{
			card.show(getContentPane(), "join");
		}
		else if(e.getSource()==join.b2)
		{
			post.tf.setText("");
			for(int i=post.model.getRowCount()-1;i>=0;i--)
			{
				post.model.removeRow(i);
			}
			post.setVisible(true);
		}
		else if(e.getSource()==post.b1 || e.getSource()==post.tf)
		{
			String dong=post.tf.getText();
			if(dong.length()<1)
			{
				JOptionPane.showMessageDialog(this, "동/읍/면을 입력하세요");
				post.tf.requestFocus();
				return;
			}
			// 입력시 
			MemberDAO dao=MemberDAO.newInstance();
			java.util.List<ZipcodeVO> list=dao.postFind(dong);
			if(list.size()>0)
			{
				for(int i=post.model.getRowCount()-1;i>=0;i--)
				{
					post.model.removeRow(i);
				}
				
				for(ZipcodeVO vo:list)
				{
					String[] data= {
						vo.getZipcode(),
						vo.getAddress()
					};
					post.model.addRow(data);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "검색 결과가 없습니다");
				post.tf.setText("");
				post.tf.requestFocus();
			}
		}
		else if(e.getSource()==post.b2)
		{
			post.setVisible(false);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==post.table)
		{
			if(e.getClickCount()==2)
			{
				int row=post.table.getSelectedRow();
				String zip=post.model.getValueAt(row, 0).toString();
				String addr=post.model.getValueAt(row, 1).toString();
				join.tf3.setText(zip);
				join.tf4.setText(addr);
				post.setVisible(false);
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
