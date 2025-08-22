package com.sist.lang;
// 수학 클래스 => Math
/*
 *   Math => 모든 메소드가 static으로 되어 있다 
 *        => new를 이용해서 메모리 할당을 하지 않는다 
 *        => Math.메소드명()
 *        => random() : public static double random()
 *           => 0.0~0.99
 *              ---------
 *        => public static int ceil(double d)
 *           => 올림메소드 
 *              10.3  => 11 10.1 => 11
 *           => 총페이지  
 */
public class 라이브러리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=45;
        int totalpage=count/10;
        int res=count%10;
        if(res>0)
        	totalpage++;
        
        System.out.println("총페이지:"+totalpage);
        
        totalpage=(int)(Math.ceil(count/10.0));
        System.out.println("총페이지:"+totalpage);
        
        // => CEIL => 오라클 
        
	}

}
