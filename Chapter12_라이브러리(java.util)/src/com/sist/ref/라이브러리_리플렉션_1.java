package com.sist.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *   리플렉션 => 클래스명을 이용 
 *     => 메소드 제어 , 멤버변수 조회 
 *     => 메모리 할당 
 *     => private 접근 / 수정 
 *     => 메소드 호출 
 *     => 어노테이션 확인 
 *  ---------------------------- 활용 (1차 웹사이트 => Spring구조)
 *   
 *  
 *     
 */
// 클래스 정보 확인 (멤버변수 , 메소드 , 생성자)
// 객체 생성 / 멤버변수에 값 대입 / 메소드 호출 => 자동화 처리 
// => 객체지향 



































public class 라이브러리_리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 클래스 정보 : 변수 / 생성자 / 메소드 
		Class cls=String.class;
		
		// Class cls=Class.forName(클래스);
		System.out.println("클래스명:"+cls.getName());
		
		System.out.println("***** 변수 목록 *****");
		for(Field f:cls.getDeclaredFields())
		{
			System.out.println(f.getName()+","+f.getType());
		}
		System.out.println("------------------------------");
		System.out.println("***** 메소드 목록 *****");
		for(Method m:cls.getDeclaredMethods())
		{
			System.out.println(m.getName());
		}
		System.out.println("------------------------------");
		System.out.println("***** 생성자 목록 *****");
		for(Constructor c:cls.getDeclaredConstructors())
		{
			System.out.println(c);
		}
		
	}

}
