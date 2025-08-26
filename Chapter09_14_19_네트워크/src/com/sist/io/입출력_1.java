package com.sist.io;
/* 
 *   웹 
 *    = 컬렉션 / 사용자 정의 데이터형 => ~VO
 *    = 입출력 => IO
 *    = 데이터베이스 
 *    --------------------------------
 *      브라우저에 전송 => HTML (J2EE)
 *    --------------------------------
 *    
 *    자바 / IO
 *         ---- InputStream / OutputStream 
 *         1) Stream 
 *            -------
 *            = 데이터가 이동하는 통로 
 *            = 단방향 통신 
 *            = 입력스트림 => 데이터 읽기 
 *            = 출력스트림 => 데이터 쓰기 
 *            
 *             class System
 *             {
 *                static InputStream in => read
 *                static OutputStream out => print
 *             }
 *             
 *             System.in System.out
 *         2. 스트림의 종류 
 *            -----------
 *              ASC(8bit)           Unicode(16bit)
 *            바이트 스트림           문자스트림
 *            -----------         ----------
 *            InputStream          Reader
 *            OutputStream         Writer
 *            ------------- 
 *            
 *            = FileInputStream    FileReader
 *            = FileOutputStream   FileWriter
 *            
 *            
 *            바이트스트림 :  이미지 , 동영상 , zip 파일 처리  
 *            문자스트림 : 텍스트 파일 (txt)
 *            
 *    = 콘솔 입출력 
 *      메모리 입출력 
 *      입력 : Scanner / BufferedReader 
 *      출력 : System.out.println()
 *    = 파일 입출력 
 *       입력 : FileInputStream    FileReader
 *       출력 : FileOutputStream   FileWriter
 *       보조 스트림 : BufferedReader / BufferedWriter
 *    = 객체 입출력 
 *       ObjectInputStream / ObjectOutputStream
 *       
 *    = 네트워크 입출력 
 *      OutputStream : 송신 
 *      BufferedReader : 수신 
 *      
 *    파일 
 *    스트림
 *    ------ 송신/수신 
 *    파일복사(업로드,다운로드)  
 *        
 */
import java.io.*; // 반드시 예외처리 
public class 입출력_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fis=
        			new FileReader("C:\\Users\\sist\\git\\java-study\\Chapter09_14_19_네트워크\\src\\com\\sist\\inner\\내부클래스_1.java");
        	int i=0;
        	while((i=fis.read())!=-1)
        	{
        		System.out.print((char)i);
        	}
        	fis.close();
        }catch(Exception ex) {}
	}

}
