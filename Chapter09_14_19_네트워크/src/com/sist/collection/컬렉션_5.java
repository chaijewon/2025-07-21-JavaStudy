package com.sist.collection;
import java.util.*;
public class 컬렉션_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list=
        		new ArrayList<Integer>();
        for(int i=1;i<=5;i++)
        {
        	list.add(i);
        }
        
        // 양방향으로 데이터 접근이 가능 
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()) // 위 = 아래
        {
        	System.out.print(it.next()+" ");
        }
        System.out.println("\n");
        while(it.hasPrevious()) // 아래 = 위
        {
        	System.out.print(it.previous()+" ");
        }
        // 데이터를 한번에 묶어서 제어 
	}

}
