package com.sist.list;
/*
 *   List 
 *    => CRUD기능 (add,remove,set,get,size)
 *    => containsAll() : 두개의 list에서 중복된 데이터를 모아서 관리
 *                       오라클 : JOIN
 *    => retainAll() : 중복데이터 찾기 (부분 집합) 
 *    => addAll() : 데이터 전체 
 *    => subList() : 부분적 데이터 복사 => 중복구매 
 *    ----------------- 뮤직 (지니,멜론) 
 */
import java.util.*;
public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(3); // 0
        list.add(4); // 1
        list.add(7); // 2
        list.add(9); // 3
        list.add(6); // 4
        
        list.add(1); // 5
        list.add(8); // 6
        list.add(2); // 7
        list.add(5); // 8
        
        System.out.println("====== 데이터 출력 ======");
        for(Object obj:list)
        {
        	System.out.println(obj);
        }
        // 일부만 추출 (subList)
        System.out.println("====== 일부 추출 (subList) =====");
        ArrayList list2=new ArrayList(list.subList(1, 4));
        //    start , end => end-1 => 1 2 3 => index번호 추출 
        list2.add(10);
        list2.add(11);
        list2.add(12);
        
        for(Object obj:list2)
        {
        	System.out.println(obj);
        }
        
        System.out.println("======= 정렬 =======");
        // sort => Collections
        Collections.sort(list);
        
        for(Object obj:list)
        {
        	System.out.println(obj);
        }
        
        // subList ,retainAll , addAll 
        // => 원본이 변경 
        System.out.println("======= 같은 데이터 추출 ======");
        System.out.println(list.retainAll(list2));
        // 교집합 
        for(Object obj:list)
        {
        	System.out.println(obj);
        }
        System.out.println("======= 전체 데이터 복사 ======");
        // addAll
        ArrayList list3=new ArrayList();
        list3.addAll(list);
        for(Object obj:list3)
        {
        	System.out.println(obj);
        }
        
        /*
         *    subList(int start,int end) 
         *            start부터 end-1까지 추출 
         *    => 페이징 
         *    addAll() => list가지고  있는 모든 데이터를 복사 
         *    retainAll() => 두개의 ArrayList에 있는 교집합 
         *    Collectons.sort() => 정렬 
         */
	}

}
