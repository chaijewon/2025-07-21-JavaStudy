package com.sist.io;
/*
 *    성능 향상 스트림 / 보조 스트림 
 *    Buffered~
 *    ---------
 *    바이트 스트림
 *     => BufferedInputStream / BufferedOutputStream 
 *     => 이미지 / 동영상 ... 다운로드 / 업로드  
 *    문자 스트림 
 *     => BufferedReader / BufferedWriter 
 *     => 텍스트와 관련 (파일 데이터 입출력) 
 *     => 네트워크 입출력 
 *     => 웹 데이터 읽기 (HTML)
 *                                   버퍼에 데이터가 찼거나 
 *                                   \n이 있는 경우에 한번에 전송 
 *    자바프로그램 ========== 메모리 버퍼 ======== 하드디스트 
 *                고속 복사 
 */
import java.io.*;
public class 입출력_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 다운로드 
        	File file=new File("c:\\javaDev\\lombok-1.18.38.jar");
        	FileInputStream fis=
        			  new FileInputStream(file);
        	FileOutputStream fos=
        			  new FileOutputStream("c:\\upload\\lombox.jar");
        	
        	BufferedInputStream bis=new BufferedInputStream(fis);
        	BufferedOutputStream bos=new BufferedOutputStream(fos);
        	int i=0; //byte수 
        	byte[] buffer=new byte[1024];
        	long start=System.currentTimeMillis();
        	while((i=bis.read(buffer, 0, 1024))!=-1)
        	{
        		bos.write(buffer, 0, i);
        	}
        	//fis.close();
        	//fos.close();
        	bis.close();
        	bos.close();
        	long end=System.currentTimeMillis();
        	System.out.println("파일 복사 완료!!");
        	System.out.println("걸린 시간:"+(end-start)+"MS");
        }catch(Exception ex){ex.printStackTrace();}
	}

}
