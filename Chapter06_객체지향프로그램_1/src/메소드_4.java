/*
 *         | 한개만 존재 => 배열 / 클래스 
 *       리턴형 메소드명(매개변수...) => 선언부 
 *       {           ---------  데이터묶음 (매개변수 3개이상)
 *           구현부                |배열 / 클래스 
 *       } 
 *       
 *       메소드를 가지고 있으면 클래스 
 *       => 일반 데이터형 / 클래스 형 (String)
 *          
 *          메소드명
 *       ------------
 *   요청값    
 *   ===>  매개변수 
 *         ------
 *         처리 ======> 결과값 / 자체처리 
 *       ------------            |
 *                              void
 *        먹는다()
 *        달린다()
 *        ...                   
 *   --------------------------------------
 *    int disp(int a,int b)
 *    {
 *       
 *    }// 메모리에 저장 
 *    int a=10
 *    int b=20
 *    int c=30
 *    
 *    LIFO  / FIFO
 *            ----- Hello  olleH
 *            
 *    메소드 
 *     ---- Call Stack
 *     void main()
 *     {
 *        aaa()
 *     }
 *     void aaa()
 *     {
 *         bbb()
 *     }
 *     void bbb()
 *     {
 *         ccc()
 *     }
 *     void ccc()
 *     {
 *        ddd()
 *     }
 *     void ddd()
 *     {
 *     }
 */

import java.lang.reflect.Method;

class A
{
	void aaa()
	{
		
	}
	void bbb()
	{
		
	}
	void ccc()
	{
		
	}
	void ddd()
	{
		
	}
}
public class 메소드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Class clsName=Class.forName("A");
        	Object obj=clsName.getDeclaredConstructor().newInstance();
        	Method[] methods=clsName.getDeclaredMethods();
        	for(Method m:methods)
        	{
        		System.out.println(m.getName());
        	}
        }catch(Exception ex) {}
	}

}
