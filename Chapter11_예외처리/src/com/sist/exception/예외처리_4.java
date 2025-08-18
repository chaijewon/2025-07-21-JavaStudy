package com.sist.exception;

public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 연결 
        	for(int i=1;i<=10;i++)
        	{
            	try
            	{
            		//  데이터 읽기
        		  int a=(int)(Math.random()*3);
        		  System.out.println(i+","+(i/a));
            	}catch(Exception e) {}
        	}
        }catch(Exception ex){
        	System.out.println("에러 발생");
        }
	}

}
