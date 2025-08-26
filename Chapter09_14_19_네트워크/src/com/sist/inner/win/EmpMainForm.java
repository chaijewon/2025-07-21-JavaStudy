package com.sist.inner.win;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class EmpMainForm extends JFrame{
    EmpDAO dao=EmpDAO.newInstance();
    JTable table;
    DefaultTableModel model;
    public EmpMainForm()
    {
    	String[] col={"사번","이름","직위","입사일"};
    	String[][] row=new String[0][4];
    	// 익명의 클래스 
    	model=new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		
    	};
    	table=new JTable(model);
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setRowHeight(35);
    	JScrollPane js=new JScrollPane(table);
    	add("Center",js);
    	
    	print();
    	setSize(640, 480);
        setVisible(true);   
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void print()
    {
    	ArrayList<EmpVO> list=dao.empListData();
    	for(EmpVO vo:list)
    	{
    		String[] data={
    		   String.valueOf(vo.getEmpno()),
    		   vo.getEname(),
    		   vo.getJob(),
    		   vo.getHiredate().toString()
    		};
    		model.addRow(data);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new EmpMainForm();
	}

}
