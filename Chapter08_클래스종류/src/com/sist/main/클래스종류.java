package com.sist.main;
/*
 *   자바 지원하는 클래스의 종류 
 *   ***1) 추상클래스 
 *         => 미완성된 클래스 (구현되지 않은 메소드가  존재)
 *            => new 이용해서 메모리 할당이 안된다 
 *            => 상속을 받아서 하위 클래스에서 메소드를 구현한 후에 사용
 *            => 많이 사용하지 않는다 => 확장 개념 (인터페이스)
 *            => 추상 : 공통점을 모아서 관리 
 *            => 예)
 *                   뮤직
 *                    = 지니뮤직 
 *                    = 멜론 
 *                    = Mnet 
 *                    ------------ 공통점을 뽑아서 
 *                                 프로그램에 맞게 구현 
 *            => 설계 => 요구사항 
 *         => 형식)
 *            [접근지정어] abstract class ClassName
 *            {
 *               
 *            }
 *            => 상위단 (아키텍쳐) 
 *                   |
 *                  PM
 *                   |
 *                  PL
 *                   |
 *                 개발자  
 *            -------------------
 *            단점) 단일 상속 / 프로그램 제약이 많이 존재 => 다중 상속 : 인터페이스 
 *                           ----------
 *                            지정된 메소드만 사용 
 *            장점) **서로 다른 클래스를 모아서 한개의 객체명으로 접근이 가능
 *                 -------------------------------------
 *                 **결합성이 낮은 프로그램 
 *                 
 *                      DriverManager 
 *                          |
 *                 --------------------------
 *                 |     |     |      |     |
 *               Oracle MySQL MSSQL  SQLite MariaDB 
 *               
 *               => 기능을 설정 / 문제 => 프로그램에 맞게 구현 
 *               => 모아서 관리 : 한개 이름으로 처리 
 *                  -------- 객체 지향 프로그램 
 *                           : 재사용 
 *                           : 관리 
 *                   | 데이터를 관리 
 *                       = 배열 / 클래스
 *                   | 클래스 관리 
 *                       = 추상 클래스 / 인터페이스 
 *                       ----------------------
 *                         메모리 할당 => new : new가 사용하지 않고 메모리 할당
 *                       Calendar cal=Calendar.newInstance()
 *                       Scanner scan=new Scanner() 
 *                       ** 스프링은 클래스 관리자 => 한개로 묶어서 사용 
 *                                               인터페이스 
 *                          => 결합성이 낮은 프로그램 
 *                 ---------------------------------------------
 *                 => 오버라이딩 기법 
 *                    ------------
 *                    상속을 내리는 클래스 Super
 *                         |
 *                    상속을 받는 클래스 Sub
 *                       class Super
 *                       {
 *                          public void display(){}
 *                       }
 *                    => class Sub extends Super
 *                       {
 *                           => 오버라이딩 
 *                           => 기존의 메소드를 상속을 받아서 
 *                              다른 내용으로 변경후 사용 
 *                           => 상속받은 메소드와 동일 
 *                           => 접근지정어만 확장 
 *                              --------
 *                              private < default < protected < public 
 *                              모르는 경우 => public 
 *                                          ------
 *                                          | 다른 클래스와 통신 
 *                           public void display()
 *                           {
 *                           }
 *                       }
 *                       
 *                       Super s=new Sub(); 
 *                       ------- ---------> 구현된 메소드를 호출 목적
 *                        관련된 클래스를 모아주는 역할 
 *                       => 인터페이스 / 추상 클래스 => 
 *                       
 *                       Super s=new Super() diplay() : 100
 *                       Sub ss=new Sub();  display() : 200
 *                       Super sss=new Sub(); : disaplay() : 200
 *                       ----
 *                        s
 *                       ----     ----super------------
 *                                   ----display()----
 *                                     메모리 주소 200
 *                                   -----------------
 *                       
 *                                ----this-------------
 *                                   ---- display()---
 *                                     메모리 주소 200
 *                                   -----------------
 *                                ---------------------
 *                    상위클래스 객체명=new 하위클래스()
 *                    ------------- -------------
 *                    | 멤버변수       | 메소드 
 *                   ---------------------------- new 메모리 할당 
 *                                      => 제어 : 메소드 
 *                       
 *                 
 *   ***2) 인터페이스 
 *         = 추상 클래스의 일종 
 *         = 추상 클래스를 보완 (다중 상속) 
 *         = 인터페이스도 클래스다 
 *         = 프로그램에 맞게 구현해서 사용 
 *           => 선언만 메소드 
 *           => 설계만 되어 있다 
 *              뮤직 / 영화 / 쇼핑 === 구현해야되는 기능 설계 
 *         ***= 서로 다른 클래스를 연결해서 사용 
 *         = 독립적으로 사용이 가능 
 *         = 표준화가 가능 
 *         = 데이터베이스 프로그램 
 *           --------- SQL
 *           네크워크 : 거의 동일시 
 *         = 추상 클래스 
 *           => 일반 메소드 + 추상메소드 
 *         = 인터페이스 
 *           => 추상 메소드 : 모든 메소드를 구현
 *              => 구현 메소드 추가 :default 메소드 
 *           => 데이터베이스 / IO / 웹 
 *                              ----
 *                              브라우저에서 요청값
 *                               HttpServletRequest 
 *                              브라우저로 응답  
 *                               HttpServletResponse 
 *                              Session / Cookie
 *           형식)
 *                [접근지정어] interface interface명
 *                {
 *                    *** 모든 내용 => only public 
 *                    --------------------
 *                      변수
 *                      => 상수형 변수
 *                      (public static final) int a=10
 *                      ---------------------
 *                        생략시에는 자동 추가 
 *                             ---- 반드시 선언과 동시에 값을 부여
 *                    --------------------
 *                      선언된 메소드
 *                      (public abstract) void display();
 *                        생략시에 자동 추가 
 *                    --------------------
 *                      구현된 메소드 => 개발자의 요구
 *                       (public) default void aaa()
 *                       {
 *                          
 *                       }
 *                    --------------------
 *                      static => 구현이 가능 
 *                    --------------------
 *                }
 *   3) 내부클래스 : 윈도우 / 네트워크 => 웹에서는 많이 사용되지 않는다
 *        = 멤버클래스 : 클래스 여러개가 한개의 변수를 공유 
 *          class Server
 *          {
 *             접속자목록 => Server 
 *             class Client
 *             {
 *                Server가 가지고 있는 접속자 목록을 사용 
 *             }
 *          } 
 *        = 익명의 클래스 : 상속없이 오버라이딩을 할 경우
 *          => 윈도우 , 쓰레드 , 람다식 
 *          => 빅데이터 
 *          => 웹에서는 거의 없다  
 *          class A
 *          {
 *              B b=new B(){
 *                public void disp(){}
 *              }
 *          }
 *          class B
 *          {
 *            public void disp(){}
 *          }
 *          
 *          웹에서 주로 사용 
 *          ------------ 변수 / 연산자 / 제어문 
 *          => 클래스(95) / 배열(5) => 모아서 한번에 전송 
 *             ----------- 
 *          => 인터페이스 
 *          => 데이터베이스 
 *          => IO 
 *          -------------------- J2SE
 *          => 웹 관련 라이브러리 
 *          -------------------- J2EE
 *        
 *   4) 종단클래스 : 사용자 정의는 거의 없다 / 라이브러리 많이 존재 
 *      => final : 상속 안되는 클래스 
 *                 String , Math , System , Scanner
 *                 있는 그대로 사용 => 표준 
 */
//interface A
//{
//	void aaa();
//	default void bbb() {}
//}
//class B implements A
//{
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//class C implements A
//{
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 클래스종류 extends JFrame implements MouseListener{
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
