package com.sist.io;
/*
 *   I(Input)/O(Output) => 데이터를 읽기 쓰기 기능을 제공하는 라이브러리
 *   웹 => JSON / XML 
 *        ----------- 외부 라이브러리 
 *        다운로드 / 업로드 / 웹파일 
 *   => 파일 , 네트워크 , 메모리 => 입출력할 경우에 사용 
 *   자바에서 지원하는 IO 
 *   ----------------
 *       ASC (1byte) / Unicode (2byte)
 *                     | 0~65535 (각국의 언어 사용)
 *        | 0~256(숫자 , 알파벳)  
 *          => 브라우저는 1byte(ASC) ==> Unicode로 변경 
 *                                    -------------
 *                                    UTF-8(웹에서 핵심)
 *    1. 바이트 기반 스트림 (스트림 : 데이터 이동 통로)
 *       1byte단위로 데이터 처리 
 *       상위 클래스 : InputStream / OutputStream 
 *       주요 클래스 
 *         = ***FileInputStream / FileOutputStream 
 *         = ***BufferedInputStream / ***BufferedOutputStream
 *         = 파일 복사 / 다로운드 / 업로드 
 *         = 이미지 , zip , ppt ...
 *         = .txt아닌 파일을 제어 
 *    2. 문자 기반 스트림 
 *       2byte(Unicode) 단위 데이터 처리 
 *       상위 클래스 : Reader / Writer
 *       주요 클래스 
 *         = ***FileReader / FileWriter
 *         = ***BufferedReader / BufferedWriter
 *       사용처 : 텍스트 파일 처리 
 *    3. 보조 스트림 => 속도 최적화 (Buffered~) 
 *         = 자바프로그램 => JVM => 운영체제 => 하드디스크 
 *         = 자바프로그램 => JVM => 메모리 (임시 저장 공간:Buffer) 
 *           ------------------------
 *         = BufferedInputStream / BufferedOutputStream
 *         = BufferedReader / BufferedWriter
 *         = 사용처 : 네트워크 / 웹 
 *    4. 객체 기반 스트림 => 시리얼라이즈 
 *         = 객체자체를 저장 
 *         = ObjectInputStream / ObjectOutputStream 
 *         = 네트워크 기반 / 파일제어 프로그램 
 *         = 객체의 주소값을 저장 
 *         = 실무 : 데이터관리 => 데이터를 저장 
 *                 ---------------------
 *                 파일 / 데이터베이스 (JOIN , SUBQUERY)
 *                 --- 보안이 취약 , 구분이 없다 
 *                 id|pwd|name|sex|email|addr|phone
 *                                   | 없는 사람
 *                 id|pwd|name|sex| |addr|phone
 *                 id|pwd|name|sex|email|addr|phone
 *                 예약 id
 *           = 로그파일 , 채팅문자열 
 *           = 데이터베이스 : 단점 => 대용량이 아니다
 *           = 비정형화 => 분석 => 정형화 
 *             --------------------- 빅데이터 
 *                                   ------
 *                                    시각화 / 예측 
 *                                    ----------- 머신러닝 
 *                                                ------
 *                                                 학습 : 딥러닝 
 *           = 데이터 수집 
 *    5. File 객체 => File / Directory 제어 
 *                   ----------------
 *       = 파일/폴더 정보 읽기
 *       = 생성자 
 *         new File("c:\\javaDev\\a.txt")
 *           => 파일 정보 
 *         new File("c:\\javaDev") 
 *           => 폴더 정보
 *       = 주요 메소드 
 *         ***1. getName() : 파일명 
 *         ***2. getPath() : 경로명+파일명
 *         3. getParent(): 경로명 
 *         4. canRead() : 읽기여부 
 *         5. canWrite() : 쓰기여부 
 *         6. isHidden() : 숨긴파일
 *         ***7. lastModified() : 최종 수정일 
 *         ***8. length() : 파일 크기 
 *         ***9. isFile() / isDirectory()
 *         ***10. exists() : 존재여부 
 *         ***11. mkdir() : 폴더 생성
 *         ***12. createNewFile() : 파일 생성
 *         ***13. delete(): 파일 삭제 
 *         ***14. listFiles() : 폴더안에 있는 모든 정보 
 *         
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 파일 정보 읽기 
		try
		{
			File file=new File("c:\\javaDev\\m1.jpg");
			System.out.println("1.파일명:"+file.getName());
			System.out.println("2.파일경로+파일명:"+file.getPath());
			System.out.println("3.경로명:"+file.getParent());
			System.out.println("4.숨김파일:"+file.isHidden());
			System.out.println("5.쓰기기능:"+file.canWrite());
			System.out.println("6.읽기기능:"+file.canRead());
			Date date=new Date(file.lastModified());
			// 시간 
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("7.마지막 수정일:"+sdf.format(date));
			int len=(int)file.length()/1024;
			String s=len==0?file.length()+"Bytes":len+"KB";
			System.out.println("8.파일 크기:"+s);
			System.out.println("9.절대경로:"+file.getAbsolutePath());
		}catch(Exception ex) {} 
	}

}
