package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class ControllerPanel extends JPanel{
    HomeForm hf=new HomeForm();
    ChatForm cf=new ChatForm();
    BoardList bf=new BoardList();
    CardLayout card=new CardLayout();
    public ControllerPanel()
    {
    	setLayout(card);
    	add("HF",hf);
    	add("CF",cf);
    	add("BF",bf);
    }
}
