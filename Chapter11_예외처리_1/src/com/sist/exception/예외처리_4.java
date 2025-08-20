package com.sist.exception;
// finally 없이 자동 닫기 => 파일에서만 가능 
import java.io.*;
// import java.net java.io java.sql => CheckException
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_3.java"))
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
