package com.sist.main;
/*
 *   패키지를 만드는 방법 
 *   com(org).업체명.요약 
 *   java.util.*  : 유용하게 사용되는 라이브러리 
 *   java.io.* :  입출력 
 *   java.net.* : 네트워크 
 *   javax.swing : 윈도우 => 경량 => 1.2 
 *   java.awt. : 윈도우 => 1.0
 *   --------------------------
 *   client  com.sist.client
 *           --------------- 화면 UI
 *           com.sist.commons 
 *           ----------------- 서버와 공통 사용 
 *           com.sist.server 
 *           com.sist.board 
 *           => 소문자만 사용 
 *           => 키워드는 사용금지 
 *           => 공백은 사용할 수 없다 
 *   => 관련된 클래스를 모아서 관리 => 폴더 
 *   => 재사용 
 *   => 잘 만든 클래스 => .jar
 *   => 클래스 => 여러 묶는다 => 패키지 => 패키지 여러개 => 프로젝트
 *      ------------------
 *      변수 => 배열 / 클래스 
 *      메소드 => 명령문      ------
 *      ------------------ 클래스
 *                         ------ 패키지 
 *                                ----- 라이브러리 
 *   => 클래스가 다른 폴더(패키지)에 존재 
 *      => 반드시 import를 이용해서 클래스를 가지고 온다 
 *      => 클래스가 public이 아니면 사용이 불가능 
 *      => 메소드 / 생성자 => public이 아니면 사용이 불가능 
 *      => 변수 => 캡슐화 private 
 *                ------------- 기능 : 읽기/ 쓰기 
 *                
 *   접근 범위 (클래스 / 메소드 / 변수)
 *   ----------------------------
 *   접근 지정어 
 *   private : 자신의 클래스에서만 사용이 가능 
 *             인스턴스 변수  
 *   default : 같은 패키지에서만 접근이 가능 
 *   protected : 같은 패키지에서만 접근이 가능 , 상속시에 상속받은 클래스
 *   public : 패키지 상관없이 모든 클래스에서 접근이 가능 
 *   
 *   -----------------------------------------------
 *   상수 ===> public static final 
 *   변수 ===> private 
 *            => 지역변수는 final만  사용이 가능 
 *   메소드 ===> 다른 클래스와 연결 : public  
 *   생성자 ===> 메소드 / 변수 사용시 메모리 저장 
 *         => 다른 클래스에서 사용이 가능 : public  
 *           
 *   클래스 ===> 다른 클래스서 사용이 가능 : public 
 *   
 *   this ==> 객체
 *   this()==> 생성자 
 *   ------------------ static메소드에서는 사용이 불가능 
 *                      ------ 공동 사용 
 */
class Sawon{
	private int sabun;
	protected String name;
	String job;
	public String address;
	// 변수에 대한 초기화 
	public Sawon(int sabun,String name,String job,String address)
	{
		// 지역변수 우선순위 (지역변수,매개변수)
		this.sabun=sabun;
		this.name=name;
		this.job=job;
		this.address=address;
		System.out.println("this:"+this);
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
		
	}
	
}
public class 접근지정어 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Sawon hong=new Sawon(1, "홍길동", "대리", "서울");
        System.out.println("hong:"+hong);
        /*
         *   this : 클래스 자신의 객체 
         *   ---- hong 객체와 동일 
         *   
         *   1. 생성 
         *      Sawon hong=new Sawon()
         *   2. JVM 
         *      this=hong
         *      
         *   => this는 인스턴스 메소드나 생성자 사용이 가능 
         *      static에는 존재하지 않는다 
         */
        System.out.println("===== 정보 =====");
        System.out.println("사번:"+hong.getSabun());// 출력이 불가능 
        System.out.println("이름:"+hong.name);// null
        System.out.println("직위:"+hong.job);// null
        System.out.println("주소:"+hong.address);// null
        
        Sawon shim=new Sawon(2, "심청이", "대리", "서울");
        System.out.println("shim="+shim);
	}

}
