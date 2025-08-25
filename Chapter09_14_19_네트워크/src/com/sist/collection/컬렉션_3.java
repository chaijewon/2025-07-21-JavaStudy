package com.sist.collection;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
}
/*
 *   List<T> => String
 *   {
 *      T => 매개변수 , 리턴형 
 *   }
 */
public class 컬렉션_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Sawon> list=
        		new ArrayList<Sawon>();
        list.add(new Sawon(1,"홍길동","개발부","대리",3700));
        list.add(new Sawon(2,"박문수","자재부","과장",4500));
        list.add(new Sawon(3,"이순신","총무부","사원",3500));
        list.add(new Sawon(4,"강감찬","영업부","부장",6000));
        list.add(new Sawon(5,"심청이","기획부","사원",3700));
        
        // 사원 목록 출력 
        System.out.println("====== 사원 목록 =======");
        System.out.println("사원 수:"+list.size());
        for(Sawon sa:list)
        {
        	System.out.println(sa.getSabun()+" "
        			+sa.getName()+" "
        			+sa.getDept()+" "
        			+sa.getJob()+" "
        			+sa.getPay());
        }
        
        Sawon sa1=new Sawon(6,"춘향이","기획부","부장",6000);
        list.add(sa1);
        System.out.println("====== 사원 목록 =======");
        System.out.println("사원 수:"+list.size());
        for(Sawon sa:list)
        {
        	System.out.println(sa.getSabun()+" "
        			+sa.getName()+" "
        			+sa.getDept()+" "
        			+sa.getJob()+" "
        			+sa.getPay());
        }
        
        
        
	}

}
