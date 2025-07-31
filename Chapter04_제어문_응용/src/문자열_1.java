/*
 *   문자열 
 *   ----- 자바 
 *   String => 데이터형 / 클래스형 (기능=>메소드)
 *   => 사용법 
 *      String 변수명="문자"
 *                   ----- 제한이 없다 
 *      예) 회원 정보 
 *          ------- id,pwd,name,email,address,phone,post
 *                  content ..... birthday ...
 *         게시판 정보 
 *           no name subject content pwd regdate hit
 *      --> 제공하는 기능 
 *          메소드 
 *      변환 
 *       toUpperCase() : 대문자 변환 
 *       toLowerCase() : 소문자 변환 
 *       ****** valueOf() : 모든 데이터형을 문자열로 변환 
 *              웹 / 윈도우 => 모든 데이터형 String
 *              valueOf(10) => "10"
 *       -------------------------(사용빈도가 없다) 한글중심 
 *      비교 
 *       equals() => 실제 문자열 비교 
 *       contains() => 포함 문자열 
 *       startsWith() => 시작문자열 
 *       endsWith() => 끝문자열 => 확장 
 *      검색 
 *       Hello Java!!
 *       0123456789
 *       int indexOf("a") => 7
 *       int indexOf("Java") => 6
 *       => 앞
 *       lastIndexOf("a") => 9
 *       => 뒤  
 *       
 *       [{},{},{},{},....]
 *      제어 
 *       substring(1,5) : 문자를 자르기
 *                  end-1
 *       split() => 문자별 자르기 
 *       trim() => 공백문자 제거 
 *       
 *    --------------------------------
 *    
 *     
 */
// substring 
import java.io.*;
import java.util.*;
public class 문자열_1{
    
	public static void main(String[] args) throws Exception{
		String msg="Hello Java";
		//1. 문자의 갯수 => " " => 문자
		// => length() -> int
		int leng=msg.length();
		System.out.println("문자 갯수:"+leng);
		//2. 자르기 
		String s=msg.substring(6);
		System.out.println(s);
		s=msg.substring(1, 5);
		// substring(beingIndex, endIndex)
		//                       --------- endIndex-1
		System.out.println(s);
		String name="문자열_1.java";
		//           0 12345
		String ext=name.substring(name.indexOf(".")+1);
		
		/*File dir=new File("c:\\javaDev");
		File[] lists=dir.listFiles();
		// ./  ..
		for(File f:lists)
		{
			if(f.isDirectory())//isFile
			{
				String ss=f.getName();
				System.out.println(ss);
				//System.out.println(ss.substring(ss.lastIndexOf(".")+1));
			}
		}*/
		
		String msg1="                Hello Java!! ";
		System.out.println(msg1.length());
		String ss=msg1.trim();
		System.out.println(ss.length());
		// trim() => 공백문자 제거 => 좌우
		// trim() => 어디서 => 검색 / 로그인 / 아이디중복체크 
		// 액션 | ㅁㅁㅁ | ㅁㅁㅁㅁ
		// 서울시 마포구 서교동
		// => 지역 확인 -021111-1111
		String msg2="Java Oracle HTML CSS JavaScript "
				   +"JSP JQuery Ajax SpringFramework VueJS "
				   +"SpringBoot Git GitAction Docker Docker-Compose "
				   +"Jenkins React Next TypeScript MSA Chatting NodeJS";
		String[] datas=msg2.split(" ");
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력:");
		String d=scan.next();
		for(String data:datas)
		{
			//System.out.println(data);\
			// data.startsWith(d)
			// data.endsWith(d)
			//data.contains(d)
			// data.equals(d) ===> 대소문자 구분
			if(data.equalsIgnoreCase(d))
			{
				System.out.println(data);
			}
		}
	}

}






