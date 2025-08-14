package com.sist.main;
// 7장 => 캡슐화 / 상속 / 다형성 / this / super / this() /super()
/*
 *   키워드 
 *    => this : 자신의 객체
 *       class A => 설계
 *       {
 *          this를 사용하는 위치 
 *          => 생성자 
 *          => 인스턴스 메소드에서만 사용이 가능 
 *          => static 메소드에서는 사용할 수 없다 
 *          => 클래스 자신이 가지고 있는 것 
 *             ----------------------
 *             인스턴스 변수 / 인스턴스 메소드 / 생성자 
 *          public void aaa(A this)
 *          {    
 *            this.           ------- 생략
 *            ------ 생략이 가능 
 *            ------ 지역변수/ 매개변수 가 인스턴스 변수가 동일 할때
 *                   구분 
 *          } 
 *          public A(A this)
 *                  -------- 생략 
 *          {
 *          } 
 *          
 *          int a;
 *          public void bbb(int aa)
 *          {
 *             a=aa
 *          }
 *          =>  지역변수 우선순위 
 *              ------------- 지역변수가 없는 경우 인스턴스 변수
 *                            정적 변수 찾기
 *       }
 *       A a=new A() => 사용법 
 *       ----------- 
 *       JVM 
 *       ---- 1) this 저장 
 *               this=a
 *       => 웹 : this가 아니고 page
 *       => 구분자 : 없는 경우는 생략이 된 것이다 
 *    => this() : 자신의 생성자를 호출 할 경우에 사용 
 *    => super : 상위 클래스 객체 
 *    => super() : 상위 클래스의 생성자 호출
 *       ------- 상속 받는 경우에는 무조건 호출 => 없는 경우에는 자동 추가
 *       
 *    => 접근 지정어 (사용자 정의가 없다) 
 *       public : 모든 클래스에 접근이 가능 
 *       protected : 같은 패키지 + 상속 내린 클래스 (패키지가 다른 경우)
 *       default : 같은 패키지 
 *       private : 같은 클래스 
 *       
 *       => 다른 클래스와 연결 
 *          1. 클래스
 *          2. 메소드 
 *          3. 생성자 
 *          -------------- public 
 *          4. 멤버변수(인스턴스 변수) => private : 데이터 보호
 *       final : 상수 
 *       
 *       static , 접근지정어 , final
 *       ------------------------- 인스턴스변수, 정적변수
 *       지역변수는 final만 사용이 가능 
 *   ------------------------------------------------
 */
//class A
//{
//	int a;
//	public void display(int aa)
//	{
//		a=aa;
//	}
//}
/*
 *    --- 상속 내린 클래스 = 상속 받은 클래스 
 *          |-------------- 사용 
 *          
 *    class A
 *    {
 *       int a=100;
 *       String name="홍길동"
 *    }
 *    class B extends A
 *    {
 *       int b=200;
 *       //int a=100;
 *       //String name="홍길동"
 *    }
 */
class A
{
	int a=100;
	public A(String name,int a)
	{
		System.out.println("상위 클래스 생성자 호출!!");
	}
}
class B extends A
{
	int a=200;// 변수 오버라이딩 
	public B()
	{
		super("홍길동",10);
		System.out.println("this.a="+this.a);
		System.out.println("super.a="+super.a);
	}
}
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        
	}

}
