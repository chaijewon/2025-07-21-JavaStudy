package com.sist.collection;
/*
 *    라이브러리 
 *      Object
 *        clone / hashCode / equals / finalize / toString  
 *      String 
 *        length / equals / startsWith / endsWith / contains
 *        indexOf / lastIndexOf / trim / valueOf 
 *        substring / split
 *      StringBuffer 
 *        append 
 *      Math 
 *        random / ceil 
 *      System 
 *        System.out.println()
 *     ----------------------------- java.lang 
 *      java.text 
 *        SimpleDateFormat 
 *        MessageFormat 
 *        DecimalFormat 
 *     ---------------------  format()
 *      java.util 
 *        StringTokenizer 
 *          hasMoreTokens / countToken / nextToken 
 *        Random 
 *          nextInt(int bound)
 *        Collection 
 *          List => ArrayList
 *          Map => HashMap
 *          Set => HashSet 
 *      ------------------------------
 *        정규식 / 리플렉션 / 어노테이션 
 *      ------------------------------
 *       기본 자바 => 데이터베이스 자바 => 웹 자바 => 스프링 자바
 *               J2SE                   J2EE
 *      -----------------------------------------------
 *       
 *      제네릭 
 *      ----- 컬렉션 => List<필요한데이터형>
 *                         ----------- 자바 클래스 
 *                         ----------- 사용자 정의 
 *                    List<EmpVO>
 *      제네릭을 지정 => 데이터형의 한계 
 *      List<String> : 무조건 String만 저장이 가능 
 *      add(String a) add(Object obj)
 *      ------------- String[] 
 */
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<>();
        // List<String> list=new ArrayList<String>();
        // List<String> list=new ArrayList<>()
        list.add("사과");
        list.add("배");
        list.add("수박");
        
        for(String f:list)
        {
        	System.out.println(f);
        }
        
        // 정수 => Integer  <클랫스형> : Wrapper
        // 형변환 (X) , 지정값만 저장 => 리턴형도 지정된 값만 사용 
        // 사용자 정의도 사용이 가능 
	}

}
