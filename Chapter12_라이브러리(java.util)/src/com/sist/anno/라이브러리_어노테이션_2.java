package com.sist.anno;
import java.lang.reflect.Method;
/*
 *    1. 특별한 형태의 인터페이스
 *    2. 어노테이션의 종류 
 *       표준 어노테이션 : 자바에서 제공 
 *       라이브러리 어노테이션 : lombok , spring 
 *       메타 어노테이션 : 어노테이션을 만드는 경우 
 *       ------------ @Retention
 *                       사용 범위 
 *                       컴파일시에만 사용
 *                         CLASS / SOURCE 
 *                       런타임까지 사용 
 *                         RUNTIME ==> 프로그램 종료시까지 
 *                    @Target  
 *                       TYPE : 클래스 구분
 *                       METHOD : 메소드 구분
 *                       FIELD  : 변수 구분 
 *      사용자 정의 : 개발자가 만든다 
 *                 ------------ 스프링 (필수)
 *                 => 어노테이션명은 
 */
import java.util.*;
class Service
{
	//@MyAnno("login")
	public void login()
	{
		System.out.println("로그인 요청");
	}
	//@MyAnno("join")
	public void join()
	{
		System.out.println("회원가입 요청");
	}
	//@MyAnno("logout")
	public void logout()
	{
		System.out.println("로그아웃 요청");
	}
	
	public void list()
	{
		System.out.println("목록 출력");
	}
	
	public void detail()
	{
		System.out.println("상세보기 출력");
	}
}
public class 라이브러리_어노테이션_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("입력(login,join,logout):");
        String cmd=scan.next();
        
        Class cls=Class.forName("com.sist.anno.Service");
        // 클래스의 모든 정보 수집 
        Object obj=cls.getDeclaredConstructor().newInstance();
        // 동적 객체 생성 => Service s=new Service()
        // 메소드 제어 
        Method[] methods=cls.getDeclaredMethods();
        for(Method m:methods)
        {
        	String name=m.getName();
        	//System.out.println(name);
        	if(name.equals(cmd))
        	{
        		m.invoke(obj, null);
        		break;
        	}
        	//System.out.println(m.getName());
//        	MyAnno my=m.getAnnotation(MyAnno.class);
//        	if(my.value().equals(cmd))
//        	{
//        		m.invoke(obj, null);
//        		break;
//        	}
        }
        
	}

}
