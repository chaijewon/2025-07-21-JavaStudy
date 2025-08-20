package com.sist.exception;
/*
 *     예외처리 (Exception)
 *       = 일반 예외 (CheckException)
 *         => 컴파일러가 예외처리 코드가 있는 지 확인 
 *         => 반드시 예외처리 한다 
 *         => java.io => 입출력 
 *                       -----
 *                       1) 메모리 입출력 
 *                          System.in/System.out
 *                       2) 파일 입출력 
 *                       3) 네트워크 입출력 
 *         => java.net => URL / Socket 
 *         => java.sql => 오라클 연동 
 *         => 웹 
 *         => 개발자 실수 
 *       = 실행시 예외 (UnCheckException) 
 *         = 컴파일러가 예외처리 코드를 확인하지 않는다 
 *         = 사용자 입력 
 *     ------------------------------------------
 *      예외처리 => 상속도 : 466참조 
 *        어떤 클래스가 큰지 여부 (위로 올라 갈수록 크다)
 *     ------------------------------------------
 *     
 *     예외처리 코드 
 *     -----------
 *     try
 *     {
 *         예외=> 예외2----- 자동으로 해당 catch를 찾는다
 *               ----- NullPointerException
 *     }catch(예외처리1 => 배열){} |
 *      catch(예외처리2 => 숫자변환){}-|
 *      catch(예외처리3 => NULL){}
 *      catch(예외처리4 => 0으로 나눈 경우){}
 *      catch(예외처리5 => 클래스 형변환){}
 *     finally
 *     {
 *       무조건 수행 
 *       => 반드시 닫기를 해야되는 경우 
 *          --------
 *          서버연결 
 *          데이터베이스 연결 
 *          파일 연결 
 *     }
 *     
 *     throws 
 *      = 메소드 , 생성자 
 *        초기화블록에서는 사용할 수 없다
 *      = 선언 => 처리하는 부분이 아니다 
 *        --- 예측만 한다 
 *      = 시스템에 알려만 주는 상태 
 *       
 */
class A
{
	
}
class B extends A
{
	
}
public class 예외처리_6 {
    // UnCheck
	public static void aaa(int a,int b)
	{
	  // if => 실행시 예외 
	  try
	  {
		System.out.println(a/b);
	  }catch(ArithmeticException ex)
	  {
		  System.out.println("0으로 나눌수 없다.");
	  }
	}
	public static void bbb(String data)
	{
	   try
	   {
		System.out.println(data.length());
	   }catch(NullPointerException ex)
	   {
		   System.out.println(ex.getMessage());
	   }
	}
	public static void ccc(String num)
	{
		try
		{
		  int a=Integer.parseInt(num);
		  System.out.println(a);
		}catch (NumberFormatException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}
	}
	public static void ddd()
	{
	 try
	 {
		int[] arr=new int[2];
		arr[0]=100;
		arr[2]=200;
		System.out.println(arr[1]);
	 }catch(ArrayIndexOutOfBoundsException ex)
	 {
		 System.out.println("배열의 범위를 초과했습니다");
	 }
	}
	public static void eee()
	{
		try
		{
		  A a=new A();
		  B b=(B)a;
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        aaa(10,0);
        bbb(null);
        ccc(" 20");
        ddd();
        eee();
	}

}
