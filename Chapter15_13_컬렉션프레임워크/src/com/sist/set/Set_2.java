package com.sist.set;

import java.util.HashSet;
import java.util.Objects;

class Sawon
{
	int sabun;
	String name;
	public Sawon(int sabun,String name)
	{
		this.sabun=sabun;
		this.name=name;
	}
	
	public Sawon() {}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(sabun,name);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon s=(Sawon)obj;
		return this.name.equals(s.name) && this.sabun==s.sabun;
	}
	
	
}
public class Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet set=new HashSet();
        set.add(new Sawon(1,"홍길동"));
        set.add(new Sawon(1,"홍길동"));
        set.add(new Sawon(3,"박문수"));
        set.add(new Sawon(4,"이순신"));
        set.add(new Sawon(5,"강감찬"));
        for(Object obj:set)
        {
        	Sawon s=(Sawon)obj;
        	System.out.println(s.sabun+"."+s.name);
        }
	}

}
