package com.sist.main;
/*
 *   1. 모든 클래스는 Object로부터 상속을 받는다
 *      Object => 최상위 클래스
 *   2. 상속을 받는 경우에는 
 *        => 메모리를 통으로 가지고 온다 
 *        => 상속받은 모든 클래스 => 상속내린 클래스로 제어 
 *                동물 
 *                 |
 *             -----------
 *             |    |    | ...
 *            개    소    말 
 *        => 관련된 여러개의 클래스를 한개 객체로 제어 
 *        
 */
import java.util.*;
class 동물
{
	public void run() {
		System.out.println("달린다");
	}
}
class 개 extends 동물
{
	public void run() {
		System.out.println("개가 달린다");
	}
}
class 소 extends 동물
{
	public void run() {
		System.out.println("소가 달린다");
	}
}
class 말 extends 동물
{
	public void run() {
		System.out.println("말이 달린다");
	}
}
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("동물이름:");
        String name=scan.next();
        동물 ani=null;
        switch(name)
        {
        case "개":
        	ani=new 개();// 동적바인딩 => new => 메소드 주소 변경
        	ani.run();
        	break;
        case "소":
        	ani=new 소();
        	ani.run();
        	break;
        case "말":
        	ani=new 말();
        	ani.run();
        	break;
        }
	}

}
