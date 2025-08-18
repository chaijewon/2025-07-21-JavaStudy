package com.sist.main;
/*
 *   프로그램 구현 
 *   ----------
 *    1. 공통점 => 추상화 => 클래스 설계 
 *                 | 메모리에 저장 => 객체 (구체화)
 *                 |
 *               추상클래스 
 *                 | => 저장을 할 수 없다 
 *                   => 상속을 내려서 구현후에 사용 
 *    2. 내용이 프로그램마다 다른 경우 
 *       ----------------------
 *       뮤직  => 공통점 
 *        멜론
 *        지니뮤직 
 *        
 *       영화 => 공통점 
 *         CGV 
 *         롯데시네마 
 *         메가박스 
 *      ------------------- 요구사항분석 
 *      
 *      추상 클래스 
 *       => 선언만 된 메소드를 한개이상 가지고 있는 클래스
 *          ------------
 *          순위 / 목록 / 검색 / 동영상 ...
 *          포인트 
         
        => 관련된 모든 클래스를 모아서 관리 
 */
abstract class 도형
{
	public abstract void draw();
	public void setColor()
	{
		System.out.println("검정색 선택");
	}
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 사각형 extends 도형
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
}
class 삼각형 extends 도형
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*원 a=new 원();
        a.draw();
        
        사각형 b=new 사각형();
        b.draw();
        
        삼각형 c=new 삼각형();
        c.draw();*/
		
		도형 a=new 원();
		a.draw();
		
		a=new 사각형();
		a.draw();
		
		a=new 삼각형();
		a.draw();
        
        
	}

}
