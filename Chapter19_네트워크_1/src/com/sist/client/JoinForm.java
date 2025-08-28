package com.sist.client;
// SELECT (Login) , LIKE => INSERT 

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinForm extends JPanel{
  JLabel la1,la2,la3,la4,la5,la6,la7;
  JTextField tf1,tf2,tf3,tf4,tf5;
  JPasswordField pf;
  JButton b1,b2,b3,b4;
  
  public JoinForm()
  {
	  setLayout(null);
	  la1=new JLabel("회원 가입",JLabel.CENTER);
	  la1.setFont(new Font("맑은 고딕",Font.BOLD,35));
	  la1.setBounds(10, 50, 770, 50);
	  add(la1);
	  
	  la2=new JLabel("ID",JLabel.CENTER);
	  tf1=new JTextField();
	  tf1.setEnabled(false);
	  b1=new JButton("중복체크");
	  
	  la2.setBounds(110, 110, 60, 30);
	  tf1.setBounds(175, 110, 120, 30);
	  b1.setBounds(300, 110, 120, 30);
	  add(la2);add(tf1);add(b1);
	  
	  la3=new JLabel("비밀번호",JLabel.CENTER);
	  pf=new JPasswordField();
	  la3.setBounds(110, 145, 60, 30);
	  pf.setBounds(175, 145, 120, 30);
	  add(la3);add(pf);
	  
	  la4=new JLabel("이름",JLabel.CENTER);
	  tf2=new JTextField();
	  la4.setBounds(110, 180, 60, 30);
	  tf2.setBounds(175, 180, 120, 30);
	  add(la4);add(tf2);
	  
	  la5=new JLabel("우편번호",JLabel.CENTER);
	  tf3=new JTextField();
	  b2=new JButton("우편번호검색");
	  la5.setBounds(110, 215, 60, 30);
	  tf3.setBounds(175, 215, 120, 30);
	  b2.setBounds(300, 215, 130, 30);
	  add(la5);add(tf3);add(b2);
	  
	  la6=new JLabel("주소",JLabel.CENTER);
	  tf4=new JTextField();
	  la6.setBounds(110, 250, 60, 30);
	  tf4.setBounds(175, 250, 300, 30);
	  add(la6);add(tf4);
	  
	  la7=new JLabel("상세주소",JLabel.CENTER);
	  tf5=new JTextField();
	  la7.setBounds(110, 285, 60, 30);
	  tf5.setBounds(175, 285, 300, 30);
	  add(la7);add(tf5);
	  
	  b3=new JButton("회원가입");
	  b4=new JButton("취소");
	  JPanel p=new JPanel();
	  p.add(b3);p.add(b4);
	  
	  p.setBounds(110, 320, 365, 35);
	  add(p);
	  
  }
  
}
