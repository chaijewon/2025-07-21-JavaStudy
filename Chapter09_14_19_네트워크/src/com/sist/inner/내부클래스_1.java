package com.sist.inner;
/*
 *   클래스 두개에서 공동으로 사용 변수 , 메소드가 있는 경우에 사용 
 *        -----------------------------
 *        1. 윈도우 
 *        2. 쓰레드 
 *        3. 네트워크 
 *   장점 : 다른 클래스 연결하기 쉽다 
 *         코드의 복잡성을 줄일 수 있다 
 *   단점 : 객체 생성이 어렵다 
 *   ---------------------------- 빅데이터 (데이터 분석)
 *   
 *   내부클래스 종류
 *   1) 멤버 클래스 
 *      class A
 *      {
 *      }
 *      class B
 *      {
 *         A a=new A(); // has-a (포함클래스)
 *         A클래스가 가지고 있는 모든 내용 사용 (변수,메소드)
 *         => 메소드 변경이 불가능 (오버라이딩)
 *         => 있는 그대로 사용 
 *      }
 *      
 *      -----------------
 *      class B(Server)
 *      {
 *         // 접속시에 정보 저장 
 *         class A(통신) => Thread => 웹  
 *         {
 *            저장된 정보를 이용해서 => 통신 
 *         }
 *      }
 *      ---------------------> static 
 *      
 *   2) 익명의 클래스 : 상속없이 오버라이딩이 가능 
 *      ------------ 상속사용금지(스프링) 
 *      class A extends JFrame
 *      {
 *          JButton btn=new JButton(){
 *             기능해서 사용 , 추가 
 *          }
 *          
 *      }
 *      class A 
 *      {
 *         B b=new B(){
 *           public void display(){}
 *         }
 *      }
 *      class B
 *      {
 *         public void display(){}
 *      }
 *   3) 지역 클래스  : 사용빈도는 거의 없다 => 메소드안에 클래스 생성
 *      class A
 *      {
 *         public void display()
 *         {
 *             class B
 *             {
 *                public void print(){}
 *             }
 *             
 *             B b=new B();
 *             b.print()
 *         }
 *      }
 *   
 *     => 익명의 클래스 => 상속없이 처리 => POJO 
 *     => 웹 : 지능형 웹 (AI) => 광고 
 *     
 */
class Outer2{
	Inner2 in=new Inner2() {
		public void print() {
			System.out.println("Outer2:Inner2:print() Call...");
		}
	};
}
class Inner2{
	public void print()
	{
		System.out.println("Inner2:print() Call...");
	}
}
class Outer{
	private String name="홍길동";
	class Inner{
		int a=10;
		public void print()
		{
			System.out.println("이름:"+name);
		}
	}
	public void display()
	{
		Inner i=new Inner();
		System.out.println(i.a);
		i.print();
	}
}
public class 내부클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer o=new Outer();
        //Outer.Inner c=o.new Inner();
        //System.out.println(c.a);
        //c.print();
        o.display();
        
        Inner2 i=new Inner2();
        i.print();
        
        Outer2 o2=new Outer2();
        o2.in.print();
	}

}
