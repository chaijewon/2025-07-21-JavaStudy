package com.sist.io;
import java.io.*;
import java.util.*;
// 웹 => HttpSession 
public class 입출력_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=
        			new FileInputStream("c:\\upload\\sawon1.txt");
        	ObjectInputStream ois=
        			new ObjectInputStream(fis);
        	List<Sawon> list=(List<Sawon>)ois.readObject();
        	
        	ois.close();
        	fis.close();
        	
        	for(Sawon s:list)
        	{
        		System.out.println(s.getSabun()+" "
        				+s.getName()+" "
        				+s.getDept()+" "
        				+s.getJob()+" "
        				+s.getLoc()+" "
        				+s.getPay());
        	}
        	
        }catch(Exception ex) {}
	}

}
