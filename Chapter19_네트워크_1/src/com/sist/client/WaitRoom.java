package com.sist.client;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel{
   JButton b1,b2,b3,b4,b5,b6;
   JTextPane pane;
   JTextField tf;
   JTable table1,table2;
   DefaultTableModel model1,model2;
   JComboBox<String> box=new JComboBox<String>();
   JScrollBar bar;
   public WaitRoom()
   {
	   String[] col={"방이름","인원","상태"};
	   String[][] row=new String[0][3];
	   model1=new DefaultTableModel(row,col) {
		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}
	   };
	   table1=new JTable(model1);
	   JScrollPane js1=new JScrollPane(table1);
	   
	   String[] col1={"아이디","이름","위치"};
	   String[][] row1=new String[0][3];
	   model2=new DefaultTableModel(row1,col1) {
		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}
	   };
	   table2=new JTable(model2);
	   JScrollPane js2=new JScrollPane(table2);
	   
	   setLayout(null);
	   
	   js1.setBounds(10, 15, 400, 330);
	   add(js1);
	   js2.setBounds(10, 350, 400, 200);
	   add(js2);
	   
	   pane=new JTextPane();
	   JScrollPane js3=new JScrollPane(pane);
	   bar=js3.getVerticalScrollBar();
	   js3.setBounds(420, 15, 360, 350);
	   add(js3);
	   pane.setEditable(false);
	   
	   tf=new JTextField();
	   tf.setBounds(420,370, 250, 30);
	   add(tf);
	   
	   box.addItem("black");
	   box.addItem("green");
	   box.addItem("blue");
	   box.addItem("yellow");
	   box.addItem("pink");
	   box.addItem("magenta");
	   box.addItem("cyan");
	   
	   box.setBounds(675, 370, 105, 30);
	   add(box);
	   
	   b1=new JButton("방만들기");
	   b2=new JButton("방입장");
	   b3=new JButton("쪽지전송");
	   b4=new JButton("1:1채팅");
	   b5=new JButton("정보보기");
	   b6=new JButton("나가기");
	   
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(3,2,5,5));
	   p.add(b1);p.add(b2);
	   p.add(b3);p.add(b4);
	   p.add(b5);p.add(b6);
	   // 420, 15, 360, 350
	   p.setBounds(420, 410, 360, 130);
	   add(p);
	   
   }
}
