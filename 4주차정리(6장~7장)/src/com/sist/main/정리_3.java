package com.sist.main;
/*
 *   상속 / 오버라이딩 / 형변환 
 *                   자동 형변환 / 강제 형변환
 *                   *** 자바라이브러리 클래스 리턴 => Object
 *   *** 클래스는 크기 비교 
 *       -------------- 상속관계 / 포함관계
 *                      ------
 *                      논리적 => 상속 내리는 클래스 > 상속 받는 클래스
 *                      포함하고 있는 클래스가 크다 
 *   상속 
 *    정의 : 이미 만들어진 클래스의 변수/메소드를 받아서 새로운 클래스를 만들어서 사용
 *                     ----------------
 *                     예외) static / 생성자 / 초기화 블록 
 *                     ** private은 상속은 가능 => 접근 불가
 *                        => getter/setter
 *    => 형식 
 *       class Parent
 *       {
 *           int a=10;
 *           int b=20;
 *           public void aaa(){}
 *       }
 *       class Child extends Parent
 *       {           --------
 *           int c=30;
 *           int d=40;
 *           public void bbb(){}
 *       }            class => class   extends 
 *                    interface => class implements
 *                    
 *       Parent p=new Parent() 
 *              p=> a,b,aaa()
 *       Child c=new Child()
 *             c=> a,b,aaa(),c,d,bbb()
 *       Parent p2=new Child()
 *             p2=> a,b,Child:aaa()
 *       ---------
 *          Parent p=new Child()
 *                   주소가 변경 => 메소드의 주소를 변경 
 *          -------- -----------
 *                    | Parent가 가지고 메소드 호출 => 메소드의 주소 변경
 *                      Child가 오버라이딩 메소드 호출 
 *          | Parent가 가지고 있는 변수
 *       상속의 목적 
 *         = *** 코드 재사용 
 *         = 유지보수 효율성 => 기능을 미리 알고 있다  => 현재에 맞게 변경 
 *         = 소스가 간결하다 
 *         = 반복 제거 
 *         *** 가독성 , 재사용 , 수정용이 , 최적화 
 *         
 *    => 특징 
 *        = 단일 상속만 가능 
 *          ------- 인터페이스는 다중 상속이 가능 
 *        = 모든 클래스는 Object클래스가 최상위 클래스다 
 *                     Object상속을 받고 있다 
 *        = private은 직접 접근이 불가능 => getter/setter
 *        = 상위 클래스는 공통적으로 가지고 있는 변수/메소드 
 *          하위클래스는 메소드를 필요시에 변경해서 사용 (오버라이딩)
 *             | 
 *    => ***메소드 재정의 (오버라이딩) => 프로그램에 맞게 구현 
 *       조건)
 *            상속 =====> 익명의 클래스 
 *            메소드명이 동일
 *            리턴형이 동일 
 *            매개변수가 동일 
 *            접근지정어 확장이 가능 
 *            -----------------
 *            private < default < protected < public 
 *            => 모든 메소드 public로 만든다 
 *            
 *            interface A
 *            {
 *               (public abstract) void display();
 *            }
 *            class B implements A
 *            {
 *               void display(){ => 오류 
 *                   
 *               }
 *            }
 *    => ***형변환 
 *       1. 자동형변환 
 *          클래스는 크기 결정 : 상속 / 포함 
 *       2. 강제형변환 
 *   
 *       class A 
 *       class B => 오류 발생 
 *       
 *       class A extends Object 
 *       
 *       A < Object
 *       
 *       ===========> 객체 크기 비교 
 *                  객체명 instanceof 클래스명 
 *                  
 *       Object obj
 *       String str
 *       StringBuffer sb
 *       
 *       str instanceof Object
 *       sb instance Object
 *       
 *       obj instanceof String 
 *       str instanceof StringBuffer
 *       
 *          Object
 *            |
 *        ---------
 *        |        |
 *       String StringBuffer
 *                  
 *       1. 자동 형변환 
 *           class A
 *           class B extends A
 *           
 *           A > B
 *           
 *           A a=new A();
 *           double
 *           B b=new B();
 *           int 
 *           
 *           A c=b;  double d=10
 *           
 *           B d=(B)a;  int i=(int)10.5
 *           
 *           사용자 정의 데이터형 / 기본형 
 *           --------------- 메모리 크기 제작 
 *           12byte  => 8byte , 4byte
 *           -------
 *           class A
 *           {
 *              String a;
 *              double d;
 *           }
 *           
 *           // request.setAttribute("키",vo)
 */


class Parent
{
	int a=10;
	int b=20;
	// 메소드는 주소 => aaa => 변경 
	public void aaa() {
		System.out.println("Parent:aaa() Call...");
	}
}
class Child extends Parent
{
	/*
	 *   int a=10;
	     int b=20;
	     public void aaa() {
		   System.out.println("Parent:aaa() Call...");
	     }
	 */
	int c=30;
	int d=40;
	public void bbb()
	{
		System.out.println("Child:bbb() Call");
	}
	public void aaa() {
		System.out.println("Parent:aaa() Call... 변경");
	}
}
public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p=new Parent();// a,b , aaa()
        // 사용빈도가 없다 
        Child c=new Child();// c,d,bbb() , a,b,aaa()
        // 거의 대부분 사용 
        Parent pp=new Child();// a,b , aaa()
        
        Child cc=(Child)pp; // int a=(int)10.5
        // 강제 형변환 
        // 관련된 클래스를 모아서 관리 => 추상클래스 / 인터페이스
        // 자동 형변환 
        // Parent => double Child => int 
        // 변수는 Parent가 가지고 있는 변수호출 
        // 메소드는 Child가 가지고 있는 오버라이딩된 메소드 호출 
        //pp.aaa();
        //System.out.println(pp.a);
        
        Object obj=new Object();
        String str="";
        StringBuffer sb=new StringBuffer();
        
        if(str instanceof Object)
        	System.out.println("True");
        if(sb instanceof Object)
        	System.out.println("True");
        if(obj instanceof String)
        	System.out.println("True");
        else
        	System.out.println("False");
        
        
	}

}
