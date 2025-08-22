package com.sist.ref;

import java.lang.reflect.Field;
/*
 *   자바는 시점 
 *     = 컴파일 시점 javac  => 컴파일 
 *     = 실행 시점 java => 인터프리터 
 *   1. 리플렉션 실행시점에 클래스,메소드 , 멤버변수등의 정보를 읽거나 
 *      조작시에 사용하는 기능 
 *      => Spring , Hibernate => 동적 객체 생성 / 어노테이션 처리
 *                  ---------- JPA 
 *         메소드 호출시에 주로 사용 
 *   2. 클래스 정보를 조사해서 다루는 기능 
 *      ---------
 *      클래스 구조 
 *      class ClassName
 *      {
 *         ---------
 *          변수
 *         ---------
 *          생성자
 *         ---------
 *          메소드 
 *         ---------
 *      }
 *      
 *      -----------------------
 *      주요 클래스 및 메소드 
 *      1) Class : 클래스 자체 정보를 저장 
 *         ------
 *         변수 정보 => Field 
 *         메소드   => Method
 *         생성자   => Constructor 
 *      2) Class를 객체 얻기 
 *         Class cls=String.class
 *         
 *         String str="";
 *         Class cls=str.getClass()
 *         
 *         ***Class cls=Class.forName("java.lang.String")
 *         SQL : 표준화 
 *      ------------------------------------
 *      장점 
 *        프레임워크 개발에 주로 사용 
 *        코드 재사용성과 유연성 
 *      단점 
 *        직접 호출보다 속도가 늦다 (성능 저하)
 *        보안 문제 (private 접근 가능)
 *        코드 가독상 / 유지보수가 어렵다 
 *      ------------------------------------
 *      
 *        
 *       
 *      
 */
class Student
{
	private String name="홍길동";
}
public class 라이브러리_리플렉션_3 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
        //Class cls=Class.forName("com.sist.ref.Student");
		Student s=new Student();
		Class cls=s.getClass();
        Field f=cls.getDeclaredField("name");
        // private 변수 접근 
        f.setAccessible(true); 
        // 변수값 읽기 => get
        System.out.println("원래값:"+f.get(s));
        f.set(s, "박문수");
        // 설정 => set
        System.out.println("변경된 값:"+f.get(s));
	}

}
