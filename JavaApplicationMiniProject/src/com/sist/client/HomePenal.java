package com.sist.client;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.event.*;
import com.sist.commons.ImageChange;
import com.sist.dao.FoodDAO;
import com.sist.vo.*;
import java.util.List;
import java.net.*;
import javax.swing.table.*;
public class HomePenal extends JPanel
implements MouseListener,ActionListener
{
	ControlPanel cp;
	JPanel pan=new JPanel();
	// 이미지 출력 
	JButton b1,b2; // 이전 , 다음 
	JLabel la=new JLabel("0 page / 0 pages");
	JLabel[] imgs=new JLabel[12];
	
	int curpage=1;
	int totalpage=0;
	
	
	JTable table;
	DefaultTableModel model;
	TableColumn column;
	// 데이터베이스 연동 => FoodDAO 
	FoodDAO dao=FoodDAO.newInstance();
	JLabel titleLa=new JLabel("인기 맛집 Top10",JLabel.CENTER);
    public HomePenal(ControlPanel cp)
    {
    	// JPenal => FlowLayout - - -
    	titleLa.setForeground(Color.magenta);
    	setLayout(null);
    	this.cp=cp;
    	pan.setLayout(new GridLayout(3,4,5,5));
    	pan.setBounds(20, 15, 550, 500);
    	add(pan);
    	
    	b1=new JButton("이전");
    	b2=new JButton("다음");
    	JPanel p=new JPanel();
    	p.add(b1); p.add(la); p.add(b2);
    	// add => 코딩 순서로 배치
    	p.setBounds(20, 530, 550, 35);
    	add(p);
    	
    	
    	
    	String[] col={"","업체명","평점"};
    	Object[][] row=new Object[0][3];
    	model=new DefaultTableModel(row,col)
    	{

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
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setRowHeight(35);
    	JScrollPane js=new JScrollPane(table);
    	for(int i=0;i<col.length;i++)
    	{
    		column=table.getColumnModel().getColumn(i);
    		if(i==0)
    			column.setPreferredWidth(100);
    		else if(i==1)
    			column.setPreferredWidth(150);
    		else if(i==2)
    			column.setPreferredWidth(80);
    	}
    	// 20, 595, 550, 35
    	titleLa.setBounds(580, 15, 230, 45);
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,25));
    	add(titleLa);
    	js.setBounds(580,70, 230, 450);
    	add(js);
    	b1.addActionListener(this);//이전
    	b2.addActionListener(this);//다음 
    	print();
    }
    // 초기화 
    public void init()
    {
    	for(int i=0;i<imgs.length;i++)
    	{
    		imgs[i]=new JLabel("");
    	}
    	pan.removeAll();// 전체 삭제
    	pan.validate();// 재배치
    }
    // 이미지 출력 
    public void print()
    {
    	// 총페이지 읽기 
    	totalpage=dao.foodTotalPage();
    	List<FoodVO> list=dao.foodListData(curpage);
    	for(int i=0;i<list.size();i++)
    	{
    		FoodVO vo=list.get(i);
    		try
    		{
    			URL url=new URL(vo.getPoster());
    			Image image=
    				ImageChange.getImage(new ImageIcon(url), 130, 180);
    			imgs[i]=new JLabel(new ImageIcon(image));
    			imgs[i].setToolTipText(vo.getName()+"^"+vo.getFno());
    			pan.add(imgs[i]);
    			// 이벤트 등록 
    			imgs[i].addMouseListener(this);
    		}catch(Exception ex) {}
    	}
    	la.setText(curpage+" page / "+totalpage+" pages");
    	
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	
    	List<FoodVO> tList=dao.foodTop10();
    	for(FoodVO vo:tList)
    	{
    		try
    		{
    			URL url=new URL("https://www.menupan.com"+vo.getPoster());
    			Image image=ImageChange.getImage(new ImageIcon(url), 35, 35);
    			Object[] data= {
    				new ImageIcon(image),
    				vo.getName(),
    				String.valueOf(vo.getScore())
    			};
    			model.addRow(data);
    		}catch(Exception ex) {}
    	}
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				if(e.getClickCount()==2)
				{
					String fno=imgs[i].getToolTipText();
					fno=fno.substring(fno.lastIndexOf("^")+1);
					FoodVO vo=
						dao.foodDetailData(Integer.parseInt(fno));
					cp.fdp.detailPrint(1, vo);
					cp.card.show(cp, "DETAIL");
				}
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
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(new LineBorder(Color.red,3));
			}
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<imgs.length;i++)
		{
			if(e.getSource()==imgs[i])
			{
				imgs[i].setBorder(null);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)//이전
		{
			if(curpage>1)
			{
				curpage--;
				init();
				print();
			}
		}
		else if(e.getSource()==b2)// 다음
		{
			if(curpage<totalpage)
			{
				curpage++;
				init();
				print();
			}
		}
	}
}
