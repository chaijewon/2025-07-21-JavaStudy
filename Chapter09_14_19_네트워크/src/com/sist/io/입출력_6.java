package com.sist.io;
// FileReader / FileWriter
import java.util.*;
import java.io.*;
public class 입출력_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 파일 저장 
		Scanner scan=new Scanner(System.in);
		System.out.print("이름:");
		String name=scan.next();
		System.out.print("성별(남자,여자):");
		String sex=scan.next();
		System.out.print("나이:");
		int age=scan.nextInt();
		
		String msg=name+"|"+sex+"|"+age+"\r\n";
		
		try
		{
			File file=new File("c:\\upload\\sawon.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			// 데이터를 출력 
			FileWriter fw=new FileWriter(file,true);
			// =======> w(create) : 덮어쓴다 , a => 추가  
			// =======> log 파일 , 임시 저장 데이터 ..
			fw.write(msg);
			fw.close();
			System.out.println("데이터 저장 완료!!");
		}catch(Exception ex) {}
		
	}

}
