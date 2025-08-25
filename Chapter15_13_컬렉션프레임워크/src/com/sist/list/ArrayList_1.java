package com.sist.list;
/*
 *    1. 순서를 가지고 있다 (인덱스 번호가 자동 부여) ==> 배열기반 0부터
 *    2. 저장된 데이터 중복 허용 
 *    3. CRUD(메모리 상) 주로 사용 
 *    4. 비동기화 => 데이터베이스 목록을 읽은 경우 
 *    5. 주요기능 
 *       추가 : add(Object) add(int index, Object)
 *             ----------- ----------------------
 *             마지막에 추가    원하는 위치 출력 
 *       삭제 : remove(int index)
 *       수정 : set(int index,Object)
 *       읽기 : get(int index)
 *       갯수 : size() 
 *       전체 삭제 : clear() 
 *       데이터 존재여부 : isEmpty() 
 *                     ----------
 *    6. 주로 사용처 => 오라클에서 데이터를 읽어서 => 브라우저로 전송 
 *                   쿠키를 읽어서 브라우저 전송 
 */
import java.util.*;
public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 저장 공간 생성  
		//ArrayList list=new ArrayList();
		//Vector list=new Vector();
		LinkedList list=new LinkedList();
		// 단점 => 모든 데이터형을 추가 할수 있다 => Object
		// 추가 => add()
		list.add("홍길동"); // 0
		list.add("심청이"); // 1 => 2
		list.add("박문수"); // 2 => 3
		list.add(1,"이순신"); // 1 => 속도가 느려진다 
		// 무조건 => 0부터 순차적으로 인덱스번호 부여 
		//         ---------- 반복문 사용이 편리 
		System.out.println("저장된 인원:"+list.size());
		// 출력 
		/*for(Object obj:list)
		{
			System.out.println(obj.toString());
		}*/
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			// ArrayList에 있는 모든 메소드
			// 매개변수 : Object 
			// 리턴형 : Object 
			// => 반드시 형변환을 사용한다 
			System.out.println(i+"."+name);
		}
		// 수정 => set (int,Object) 
		list.set(2, "춘향이");
		System.out.println("======= 수정 ======");
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			// ArrayList에 있는 모든 메소드
			// 매개변수 : Object 
			// 리턴형 : Object 
			// => 반드시 형변환을 사용한다 
			System.out.println(i+"."+name);
		}
		System.out.println("====== 삭제 ======");
		// remove => remove(int index)
		list.remove(1);
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			// ArrayList에 있는 모든 메소드
			// 매개변수 : Object 
			// 리턴형 : Object 
			// => 반드시 형변환을 사용한다 
			System.out.println(i+"."+name);
		}
		// 자동으로 조정 
		System.out.println("저장된 인원:"+list.size());
		System.out.println("====== 전체 삭제 ======");
		// clear() 
		list.clear();
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			// ArrayList에 있는 모든 메소드
			// 매개변수 : Object 
			// 리턴형 : Object 
			// => 반드시 형변환을 사용한다 
			System.out.println(i+"."+name);
		}
		// 자동으로 조정 
		System.out.println("저장된 인원:"+list.size());
		
		System.out.println("======== 인원 존재 여부 =======");
		// isEmpty() 
		if(list.isEmpty())
		{
			System.out.println("저장된 데이터가 없습니다");
		}
		else
		{
			System.out.println("저장된 데이터가 존재합니다");
		}
		
	}

}
