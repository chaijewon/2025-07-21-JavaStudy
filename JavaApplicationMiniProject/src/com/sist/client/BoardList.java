package com.sist.client;
import java.awt.*;// List
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import com.sist.dao.*;
import com.sist.vo.*;
import java.util.List;
public class BoardList extends JPanel
implements ActionListener,MouseListener
{
    JButton inBtn,prevBtn,nextBtn;
    JLabel pageLa,titleLa;
    JTable table;
    DefaultTableModel model;
    TableColumn column;
    ControlPanel cp;
    // 데이터베이스 연동 
    ReplyBoardDAO dao=ReplyBoardDAO.newInstance();
    int curpage=1; // 현재 페이지 (보여주는 페이지)
    int totalpage=0;// 총페이지 
    public BoardList(ControlPanel cp)
    {
    	this.cp=cp; // 자체 화면 이동 
    	inBtn=new JButton("새글");//<input type=button value="새글">
    	prevBtn=new JButton("이전");
    	nextBtn=new JButton("다음");
    	pageLa=new JLabel("0 page / 0 pages"); //<label>0 page / 0 pages</label>
    	titleLa=new JLabel("게시판",JLabel.CENTER);// <table>
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30)); //<h3></h3>
    	
    	String[] col={"번호","","제목","이름","작성일","조회수"};//<tr><th></th>....</tr>
    	String[][] row=new String[0][6];
    	// 한줄에 5개 데이터를 첨부 
    	model=new DefaultTableModel(row,col) // 데이터 관리
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		 // 익명의 클래스 => 포함 클래스 => 상속없이 오버라이딩 => 클릭 => 편집기 => 편집방지 
    		 
    	};
    	table=new JTable(model); // 테이블 모양 관리 
    	JScrollPane js=new JScrollPane(table);
    	for(int i=0;i<col.length;i++)
    	{
    		column=table.getColumnModel().getColumn(i);
    		if(i==0)
    		{
    			column.setPreferredWidth(50);
    		}
    		
    		else if(i==2)
    		{
    			column.setPreferredWidth(350);
    		}
    		else if(i==3)
    		{
    			column.setPreferredWidth(100);
    		}
    		else if(i==4)
    		{
    			column.setPreferredWidth(150);
    		}
    		else if(i==5)
    		{
    			column.setPreferredWidth(50);
    		}
    	}
    	
    	table.getColumnModel().removeColumn(
    			table.getColumnModel().getColumn(1));
    	
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setShowVerticalLines(false);
    	table.setRowHeight(30);
    	table.getTableHeader().setBackground(Color.pink);
    	
    	// 배치 
    	setLayout(null);
    	titleLa.setBounds(10, 15, 830, 50);
    	add(titleLa);
    	inBtn.setBounds(100, 70, 100, 30);
    	add(inBtn);
    	js.setBounds(100, 110,600, 330);
    	add(js);
    	
    	JPanel p=new JPanel();
    	p.add(prevBtn);
    	p.add(pageLa);
    	p.add(nextBtn);
    	
    	p.setBounds(100, 450, 600, 35);
    	add(p);
    	
    	print();
    	
    	inBtn.addActionListener(this); // 새글 
    	prevBtn.addActionListener(this); // 이전
    	nextBtn.addActionListener(this); // 다음 
    	
    	// 상세보기 
    	table.addMouseListener(this);
    }
    public void print()
    {
    	// 테이블은 반드시 한번 지우기 
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	// 데이터 받기 
    	List<ReplyBoardVO> list=dao.boardListData(curpage);
    	int count=dao.boardRowCount();
    	totalpage=(int)(Math.ceil(count/10.0));
    	count=count-((curpage*10)-10);
    	// 번호를 순차적 출력 0 -10 -20 -30
    	// 50~ 40 30 20 10 
    	// 16 => 6
    	// 출력 => 테이블 
    	for(ReplyBoardVO vo:list)
    	{
    		if(vo.getGroup_tab()>0) // 답변인 경우
    		{
    			String s="";
    			for(int i=0;i<vo.getGroup_tab();i++)
    			{
    				s+="&nbsp;&nbsp;";
    				// &nbsp; => " "
    			}
    			String subject="<html><body>"+s+"<font color=red>☞</font>"+vo.getSubject()+"</body></html>";
    			String[] data= {
    				String.valueOf(count),
    				String.valueOf(vo.getNo()),
    				subject,
    				vo.getName(),
    				vo.getDbday(),
    				String.valueOf(vo.getHit())
    			};
    			model.addRow(data);
    			
    		}
    		else // 답변이 아닌 경우 => 새글 
    		{
    			String[] data= {
        				String.valueOf(count),
        				String.valueOf(vo.getNo()),
        				vo.getSubject(),
        				vo.getName(),
        				vo.getDbday(),
        				String.valueOf(vo.getHit())
        			};
    			model.addRow(data);
    		}
    		count--;
    	}
    	pageLa.setText(curpage+" page / "+totalpage+" pages");
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==inBtn)// 새글
		{
			// 초기화 
			cp.bInsert.nameTf.setText("");
			cp.bInsert.subTf.setText("");
			cp.bInsert.ta.setText("");
			cp.bInsert.pwdPf.setText("");
			cp.card.show(cp, "BINSERT");
			cp.bInsert.nameTf.requestFocus();
		}
		else if(e.getSource()==prevBtn)//이전
		{
			if(curpage>1)
			{
				curpage--;
				print();
			}
		}
		else if(e.getSource()==nextBtn)// 다음 
		{
			if(curpage<totalpage)
			{
				curpage++;
				print();
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				// 클릭 위치 => 게시물 번호 읽기
				String no=model.getValueAt(row, 1).toString();
				
				// 윈도우 / 웹 => 정수(X) , 문자열 => 문자열=>정수형으로 변경 
				cp.card.show(cp,"BDETAIL");
				// Database연동 
				cp.bDetail.print(1,Integer.parseInt(no));
				// 조회수 증가 
				
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
