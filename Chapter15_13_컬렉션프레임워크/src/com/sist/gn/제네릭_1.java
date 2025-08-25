package com.sist.gn;

import java.util.ArrayList;
import java.util.Map;

/*
 *   제네릭 
 *    1) 정의 
 *        클래스나 메소드를 정의 할때 사용할 데이터형을 표준화해서 사용 
 *        => 재사용성 / 데이터형의 안정성 
 *        => 데이터형을 통일화 시키는 방법 
 *        => 형변환을 하지 않는다 
 *        => 소스가 간결하고 가독성이 뛰어나다 
 *    2) 사용법 
 *       클래스<반드시 클래스형만 사용>
 *           -------------------- int => Integer
 *           <int> => 오류 <Integer> 
 *    3) 전체 데이터형이 변경 
 *    
 *       class Box<T> => Type : 실제 존재
 *       {
 *          T t;
 *          public void setT(T t)
 *          {
 *             this.t=t;
 *          }
 *          public T getT()
 *          {
 *             return t;
 *          }
 *       }
 *       
 *       Box box=new Box()  => T (Object)
 *       Box<String> box=new Box<String>() 
 *          T => String으로 변환
 *          -- 변경 : 매개변수/리턴형이 변경 
 *        
 *       T => type
 *       E => element 
 *       K => key
 *       V => value => Map<K,V>
 */
//class Box<T>
//{
//    private T t;
//    public void setT(T t)
//    {
//    	this.t=t;
//    }
//    public T getT()
//    {
//    	return t;
//    }
//}
class Sawon
{
	public Sawon getSawon() {
		return new Sawon();
	}
	public void setSawon(Sawon s) {}
	
}
public class 제네릭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<?> list=
        		  new ArrayList();
        
	}

}
