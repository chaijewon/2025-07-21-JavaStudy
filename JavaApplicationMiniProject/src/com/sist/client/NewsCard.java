package com.sist.client;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class NewsCard extends JPanel{
    JLabel titleLa;
    JTextPane contentTp;
    JLabel dateLa;
    public NewsCard()
    {
    	setLayout(null);
    	titleLa=new JLabel("");
    	contentTp=new JTextPane();
    	JScrollPane js=new JScrollPane(contentTp);
    	contentTp.setEditable(false);
    	contentTp.setContentType("text/html");
    	// html출력이 가능 
    	dateLa=new JLabel("");
    	
    	titleLa.setBounds(10,10, 450, 35);
    	js.setBounds(10, 50, 750, 100);
    	dateLa.setBounds(470, 10, 200, 35);
    	
    	add(titleLa);
    	add(js);
    	add(dateLa);
    	
    }
}
