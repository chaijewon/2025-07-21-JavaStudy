package com.sist.client;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class PostFindForm extends JFrame{
    JTextField tf;
    JButton b1,b2;
    JTable table;
    DefaultTableModel model;
    JScrollPane js;
    public PostFindForm()
    {
    	tf=new JTextField(13);
    	b1=new JButton("검색");
    	b2=new JButton("취소");
    	String[] col={"우편번호","주소"};
    	String[][] row=new String[0][2];
    	model=new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		
    	};
    	table=new JTable(model);
    	js=new JScrollPane(table);
    	
    	JPanel p=new JPanel();
    	p.add(tf);p.add(b1);p.add(b2);
    	
    	add("North",p);
    	add("Center",js);
    	setSize(450, 350);
    	//js.setVisible(false);
    	//setVisible(true);
    }
//    public static void main(String[] args) {
//		new PostFindForm();
//	}
}
