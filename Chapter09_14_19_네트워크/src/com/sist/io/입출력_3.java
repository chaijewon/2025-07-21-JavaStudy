package com.sist.io;
// 파일 생성 / 삭제 => createNewFile / delete
// => 폴더 생성 
import java.io.*;
public class 입출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir=new File("c:\\upload");
        // 1. 확인 
        if(!dir.exists())
        {
        	dir.mkdir();
        }
        
        File file=new File("c:\\upload\\student.txt");
        try
        {
        	
        	if(!file.exists())
        	{
        	  file.createNewFile();
        	  System.out.println("파일 생성 완료");
        	}
        }catch(Exception ex) {}
        
        // 삭제 
        try
        {
        	file.delete();
        	dir.delete(); // rm -rf 폴더명 
        	System.out.println("폴더 삭제 완료");
        }catch(Exception ex) {}
	}

}
