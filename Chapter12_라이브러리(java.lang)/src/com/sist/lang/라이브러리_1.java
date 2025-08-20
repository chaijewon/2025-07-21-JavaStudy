package com.sist.lang;
/*
 *   1. 라이브러리 => 자바에서 지원하는 클래스의 집합 
 *      = java.lang : import 생략 가능 
 *        ***= Object 
 *        ***= String 
 *        = StringBuffer
 *        = Math
 *        = System 
 *        = Wrapper
 *           ***= Integer => int
 *           ***= Double  => double 
 *           = Byte , Short 
 *           = Boolean => boolean
 *           = Float  = float
 *      = java.util 
 *        = StringTokenized
 *        = ***Date / Calendar 
 *        = Collection
 *          ***List / Set / Map 
 *      = java.io
 *        = 파일입출력 
 *          FileInputStrem / FileReader
 *          FileOutputStream / FileWriter
 *          BufferedReader / BufferedWriter
 *      = java.net 
 *        = URLEncoder 
 *        = URL 
 *        = Socket
 *      = java.sql 
 *        = Connection 
 *        = PreparedStatement
 *        = ResultSet
 *      = java.text
 *        = MessageFormat
 *        = DecimalFormat
 *        = ChoiceFormat 
 *        
 *      -------------------------
 *      ***= 어노테이션
 *      **= 람다식 
 *      **= 리플렉션 
 *      *= 정규식 
 *      -------------------------
 *      Collection *X1000000000000000000000000000000000
 *      -------------------------
 *      Thread / 네트워크 / 데이터베이스  
 *      ----------------
 *      
 *   Object : 모든 클래스의 상위 클래스 
 *                       ---------
 *                       라이브러리 / 사용자 정의 => Object로부터 상속을 받는다 
 *   1) 주요 기능 
 *      ***= finalize() : 소멸자 함수 
 *      ***= clone() : 복제 
 *        -------------
 *        git clone repository주소
 *      ***= equals : 객체 비교 
 *      = getClass() : 클래스의 정보 / 객체 생성 
 *      ***= toString() : 문자열 변환 
 *      **= hashCode()
 *      -------------------- 모든 클래스에 사용이 가능하게 내장 
 *    2) 모든 클래스의 상위 클래스
 *       --------- 클래스를 리턴하는 메소드가 있는 경우 (Object)
 *       --------- 형변환 
 *       
 *       class A
 *       {
 *          O X
 *       }
 *       class B extends A
 *       {
 *          // O X
 *          P H K M N 
 *       }
 *       
 *       A a=new A(); ==> O X
 *       B b=new B(); ==> O X P H K M N
 *       A c=new B(); ==> O X
 *       
 */
// 복제 
class Sawon implements Cloneable
{
	String name;
	String sex;
	public Sawon()
	{
		name="홍길동";
		sex="남자";
	}
	
	public void print()
	{
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	
	@Override
	// ===> 메소드 호출시에 예외처리를 한 후에 사용 
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
class Member
{
	int mno=10;
}
public class 라이브러리_1 /*extends Object*/{
    public static void getMno(Member m)
    {
    	// m=mm
    	m.mno=100;// 배열 (주소) => 예외 : String (Call By Value)
    }
	public static void main(String[] args) {
		Sawon hong=new Sawon();
		hong.print();
		hong.name="박문수";
		hong.sex="남자";
		try
		{
		  Sawon shim=(Sawon)hong.clone();// 초기값이 같은 메모리 => 복제 => 새로운 메모리 생성 
		  // prototype
		  shim.print();
		  shim.name="심청이";
		  shim.sex="여자";
		  Sawon kim=shim;// Call by Reference : 주소 참조 
		  // 별칭 => 같은 주소 제어 
		  kim.name="김두한";
		  kim.sex="남자";
		  shim.name="심청이";
		  shim.sex="여자";
		  kim.print();
		}catch(Exception ex){}
		
		Member mm=new Member();
		getMno(mm);// m=mm => 같은 메모리 제어 
		System.out.println(mm.mno);
	}

}
