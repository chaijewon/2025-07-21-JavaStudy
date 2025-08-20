package com.sist.exception;
/*
 *   간접처리 : throws 
 *     => 예외회피 => 컴파일 통과를 위해 시스템에 알려준다 
 *        => 예외 떠맡기기 
 *           ----------
 *            처리 => 메소드 호출시에 처리 (개발자)
 *            애매한 상태 
 *            --------- 에러가 예측이 안되는 상태 
 *            --------- 메소드 처리 
 *                      => 소스량이 많다 
 *     형식)
 *          public void display() throws 예외처리클래스,예외처리클래스,예외처리클래스
 *                                       ---------------------------------
 *          public void aaa()throws Exception
 *          {
 *             display();
 *          }
 */

public class 예외처리_5 {
    // 예외 선언 
	public static void display() throws NumberFormatException,
	     ArrayIndexOutOfBoundsException,Throwable
	{
		System.out.println("display Call...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
           display();
		}catch(Throwable a) {}
	}

}
