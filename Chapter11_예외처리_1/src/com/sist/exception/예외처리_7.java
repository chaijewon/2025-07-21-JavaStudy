package com.sist.exception;
// 예외회피 / 예외복구 
public class 예외처리_7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        /*try
        {
        	System.out.println("연산처리");
        	System.out.println(10/0);
        }catch(Exception ex){}
        System.out.println("프로그램 종료");*/
		System.out.println("연산처리");
    	System.out.println(10/0);
    	System.out.println("프로그램 종료");
	}

}
