package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class MenuForm extends JPanel{
   JButton b1=new JButton("Home");
   JButton b2=new JButton("회원가입");
   JButton b3=new JButton("맛집검색");
   JButton b4=new JButton("빠른 예약");
   JButton b5=new JButton("실시간 채팅");
   JButton b6=new JButton("게시판");
   JButton b7=new JButton("실시간 동영상");
   
   public MenuForm()
   {
	   setLayout(new GridLayout(1,7,5,5));
	   add(b1);add(b2);add(b3);
	   add(b4);add(b5);add(b6);add(b7);
   }
   
}
