package com.sist.client;
// 상세 보기 
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.net.URL;

import javax.swing.*;

import com.sist.commons.ImageChange;
import com.sist.dao.*;
import com.sist.vo.*;
/*
 *  NAME    NOT NULL VARCHAR2(500)  
	TYPE    NOT NULL VARCHAR2(100)  
	PHONE   NOT NULL VARCHAR2(20)   
	ADDRESS NOT NULL VARCHAR2(700)  
	SCORE            NUMBER(2,1)    
	THEME   NOT NULL CLOB           
	POSTER  NOT NULL VARCHAR2(300)  
	IMAGES           VARCHAR2(4000) 
	TIME    NOT NULL VARCHAR2(100)  
	PARKING          VARCHAR2(200)  
	CONTENT NOT NULL CLOB           
	HIT              NUMBER         
	PRICE            VARCHAR2(30)
 */
public class FoodDetailPenal extends JPanel
implements ActionListener
{
     JLabel poster;
     JLabel nameLa,typeLa,phoneLa,addressLa,scoreLa,
            timeLa,parkingLa,priceLa;
     JLabel name,type,phone,address,score,
            time,parking,price;
     JLabel themeLa;
     JLabel[] images=new JLabel[6];
     JTextPane themeTa,contentTa;
     JButton b1,b2,b3;
     int mode=0;
     ControlPanel cp;
     String[] link={"","HOME","FOOD","FIND"};
     public FoodDetailPenal(ControlPanel cp)
     {
    	 this.cp=cp;
    	 setLayout(null);
    	 
    	 poster=new JLabel("");
    	 poster.setBounds(20, 20, 300, 500);
    	 add(poster);
    	 
    	 nameLa=new JLabel("업체명");
    	 name=new JLabel();
    	 
    	 nameLa.setBounds(330, 20, 80, 30);
    	 name.setBounds(415, 20, 250, 30);
    	 add(nameLa);add(name);
    	 
    	 typeLa=new JLabel("음식종류");
    	 type=new JLabel();
    	 typeLa.setBounds(330, 55, 80, 30);
    	 type.setBounds(415, 55, 250, 30);
    	 add(typeLa);add(type);
    	 
    	 addressLa=new JLabel("주소");
    	 address=new JLabel();
    	 
    	 addressLa.setBounds(330, 90, 80, 30);
    	 address.setBounds(415, 90, 350, 30);
    	 add(addressLa);add(address);
    	 
    	 phoneLa=new JLabel("전화");
    	 phone=new JLabel();
    	 
    	 phoneLa.setBounds(330, 125, 80, 30);
    	 phone.setBounds(415, 125, 250, 30);
    	 add(phoneLa);add(phone);
    	 
    	 timeLa=new JLabel("영업시간");
    	 time=new JLabel();
    	 
    	 timeLa.setBounds(330, 160, 80, 30);
    	 time.setBounds(415, 160, 250, 30);
    	 add(timeLa);add(time);
    	 
    	 
    	 parkingLa=new JLabel("주차");
    	 parking=new JLabel();
    	 
    	 parkingLa.setBounds(330, 195, 80, 30);
    	 parking.setBounds(415, 195, 250, 30);
    	 add(parkingLa);add(parking);
    	 
    	 priceLa=new JLabel("가격대");
    	 price=new JLabel();
    	 
    	 priceLa.setBounds(330, 230, 80, 30);
    	 price.setBounds(415, 230, 250, 30);
    	 add(priceLa);add(price);
    	 
    	 
    	 scoreLa=new JLabel("평점");
    	 score=new JLabel();
    	 
    	 scoreLa.setBounds(330, 265, 80, 30);
    	 score.setBounds(415, 265, 250, 30);
    	 add(scoreLa);add(score);
    	 
    	 themeLa=new JLabel("테마");
    	 themeTa=new JTextPane();
    	 
    	 themeLa.setBounds(330, 300, 80, 30);
    	 themeTa.setBounds(415, 300, 350, 90);
    	 add(themeLa);add(themeTa);
    	 themeTa.setEnabled(false);
    	 
    	 contentTa=new JTextPane();
    	 JScrollPane js=new JScrollPane(contentTa);
    	 js.setBounds(330, 400, 435, 120);
    	 add(js);
    	 contentTa.setEnabled(false);
    	 
    	 b1=new JButton("찜하기");
    	 b2=new JButton("예약하기");
    	 b3=new JButton("목록");
    	 
    	 JPanel p=new JPanel();
    	 p.add(b1);p.add(b2);p.add(b3);
    	 p.setBounds(330, 525, 435, 35);
    	 add(p);
    	 
    	 b3.addActionListener(this);
    	 
     }
     public void detailPrint(int mode,FoodVO vo)
     {
    	 this.mode=mode;
    	 try
    	 {
    		 URL url=new URL(vo.getPoster());
    		 Image img=
    			ImageChange.getImage(new ImageIcon(url), 300, 500);
    		 poster.setIcon(new ImageIcon(img));
    		 
    		 name.setText(vo.getName());
    		 type.setText(vo.getType());
    		 address.setText(vo.getAddress());
    		 phone.setText(vo.getPhone());
    		 price.setText(vo.getPrice());
    		 parking.setText(vo.getParking());
    		 score.setText(String.valueOf(vo.getScore()));
    		 time.setText(vo.getTime());
    		 themeTa.setText(vo.getTheme());
    		 contentTa.setText(vo.getContent());
    	 }catch(Exception ex) {}
    	 
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b3)
		{
			cp.card.show(cp, link[mode]);
			// history.back()
		}
	}
     
     
}
