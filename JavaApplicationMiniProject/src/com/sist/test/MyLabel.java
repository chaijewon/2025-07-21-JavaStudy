package com.sist.test;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
public class MyLabel extends JFrame{
    JLabel[] la=new JLabel[20];
    JPanel pan;
    JScrollPane pane;
    JTextPane jp;
    public MyLabel()
    {
    	/*pan=new JPanel();
    	pan.setLayout(new GridLayout(20,1,5,5));
    	String html="<html><body><div style='color:orange'>경주 여행, 신라의 숨결을 따라가는 문화유산 탐방</div>"
    			   +"<div>전통과 현대가 공존하는 분위기 속에서 산책과 맛집 탐방을 즐길 수 있다. 경주는 이외에도 대릉원, 경주국립박물관, 문무대왕릉 등 다양한 역사적 명소들이 가득하다. 신라의 천년 역사를 느끼며 고대와 현대가 어우러진</div>"
    			   +"<div style='text-align:right'>투어코리아뉴스6분 전</div>"
    			   +"</body></html>";
    	for(int i=0;i<20;i++)
    	{
    		la[i]=new JLabel(html);
    		pan.add(la[i]);
    		//la[i].setText(html);
    	}
    	pan.setPreferredSize(new Dimension(750,2000));
 	    pane=new JScrollPane(pan);
 	    pane.setPreferredSize(new Dimension(720,650));
 	    pane.setBounds(10, 55, 720, 650);
    	add("Center",pane);*/
    	jp=new JTextPane();
    	jp.setEditable(false);
		jp.setContentType("text/html");
        add("Center",jp);
    	jp.setText("<html><body>애기봉 주변 <b style='color:red'>맛집</b> 코스 개발과 관광객 유입을 통한 지역 경제 활성화 방안을 제시하며, 지역 특화 메뉴 개발과 주민 운영 사업 지원을 통해 지역의 정체성을 강화하겠다는 계획을 밝혔다. 이날 신년인사회 이후 김병수... </body></html>");
    	setSize(650, 730);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MyLabel();
	}

}
