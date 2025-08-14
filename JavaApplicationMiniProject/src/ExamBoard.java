import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.*;
public class ExamBoard extends JFrame{
  JTable table;
  DefaultTableModel model;
  TableColumn column;
  public ExamBoard()
  {
	  String[] col={"번호","제목","이름","작성일","조회수"};
	  Object[][] row=new Object[0][5];
	  
	  model=new DefaultTableModel(row,col) {

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			// TODO Auto-generated method stub
			return getValueAt(0, columnIndex).getClass();
		}
		  
	  };
	  table=new JTable(model);
	  JScrollPane js=new JScrollPane(table);
	  
	  table.setShowVerticalLines(false);
	  table.setRowHeight(30);
	  for(int i=0;i<col.length;i++)
  	  {
  		column=table.getColumnModel().getColumn(i);
  		DefaultTableCellRenderer rend=new DefaultTableCellRenderer();
  		if(i==0)
  		{
  			column.setPreferredWidth(50);
  			rend.setHorizontalAlignment(JLabel.CENTER);
  		}
  		else if(i==1)
  		{
  			column.setPreferredWidth(320);
  		}
  		else if(i==2)
  		{
  			column.setPreferredWidth(120);
  			rend.setHorizontalAlignment(JLabel.CENTER);
  		}
  		else if(i==3)
  		{
  			column.setPreferredWidth(150);
  			rend.setHorizontalAlignment(JLabel.CENTER);
  		}
  		else if(i==4)
  		{
  			column.setPreferredWidth(50);
  			rend.setHorizontalAlignment(JLabel.CENTER);
  		}
  		column.setCellRenderer(rend);
  	  }
	  
	  Object[] data= {
		 2,"묻고답하기 연습","홍길동","2025-01-17",1  
	  };
	  model.addRow(data);
	  String s="";
	  for(int i=0;i<2;i++)
	  {
		  s+="&nbsp;&nbsp;";
	  }
	  Object[] data1= {
		 
	     1,"<html><body><font color=blue>"+s+"☞</font> 묻고답하기 연습&nbsp;<sup><font color=red>new</font></sup></body></html>","홍길동","2025-01-17",1	  
	  };
	  model.addRow(data1);
	  s="";
	  for(int i=0;i<3;i++)
	  {
		  s+="&nbsp;&nbsp;";
	  }
	  Object[] data2= {
		 3,"<html><body><font color=blue>"+s+"☞</font> 묻고답하기 연습&nbsp;<sup><font color=red>new</font></sup></body></html>","홍길동","2025-01-17",1	  
	  };
	  model.addRow(data2);
	  add("Center",js);
	  setSize(640, 480);
	  setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
	  new ExamBoard();
  }
}
