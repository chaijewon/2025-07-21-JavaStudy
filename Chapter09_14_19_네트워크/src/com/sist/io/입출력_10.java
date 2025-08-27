package com.sist.io;
import java.io.*;
public class 입출력_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	BufferedReader in=
        		new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("입력:");
        	String msg=in.readLine();
        	System.out.println(msg);
        	
        }catch(Exception ex) {}
	}

}
