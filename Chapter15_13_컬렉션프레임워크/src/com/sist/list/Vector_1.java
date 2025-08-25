package com.sist.list;
/*
 *   1. 사용빈도가 낮다 => 네트워크 
 *      ------------ 동기적인 프로그램 => 보완 ArrayList비동기 
 *   2. 크롤링 : 나눠서 작업 
 *             ---------- 쓰레드 
 *             목록 ===> 링크 ===> 상세보기 
 *             
 *   3. 주요 기능 : CRUD 
 *      추가 add =======> addElement
 *      수정 set =======> set
 *      삭제 remove ==> removeElementAt
 *                     removeElmenetAll
 *      읽기 get ======> elementAt()
 *      갯수 size =====> size()
 */
import java.util.*;
public class Vector_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector vec=new Vector();
        vec.addElement("홍길동"); // vec.add("홍길동")
        vec.addElement("박문수");
        vec.addElement("이순신");
        vec.add("강감찬");
        System.out.println("인원 : "+vec.size());
        //vec.forEach(name->System.out.println(name));
        for(Object obj:vec)
        {
        	System.out.println(obj);
        }
        System.out.println("===== 삭제 =====");
        vec.removeElementAt(1);
        // vec.remove(1)
        System.out.println("인원 : "+vec.size());
        for(Object obj:vec)
        {
        	System.out.println(obj);
        }
        
        System.out.println("====== 수정 =====");
        vec.setElementAt("심청이", 0);
        // vec.set(0,"심청이")
        System.out.println("인원 : "+vec.size());
        for(Object obj:vec)
        {
        	System.out.println(obj);
        }
        System.out.println("====== 전체 삭제 =====");
        vec.removeAllElements();
        // vec.clear()
        System.out.println("인원 : "+vec.size());
        for(Object obj:vec)
        {
        	System.out.println(obj);
        }
        
        System.out.println("====== 인원 여부 =====");
        if(vec.isEmpty())
        {
        	System.out.println("인원이 없습니다");
        }
        else
        {
        	System.out.println("인원이 있습니다 "+vec.size());
        }
	}

}





