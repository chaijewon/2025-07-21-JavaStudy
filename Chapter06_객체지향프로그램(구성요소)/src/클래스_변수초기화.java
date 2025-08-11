/*
 *    초기화 => 변수에 값을 첨부 
 *    -----
 *     1. 명시적 초기화 
 *        class ClassName
 *        {
 *           변수 
 *           ---
 *            기본형 (int , double , boolean ...)
 *            배열 
 *            클래스 
 *        }
 *        
 *        // 기본형 
 *        int a=100;
 *        int[] arr={10,20,30,40,50}
 *        A a=new A();
 *        
 *        int a; = 0
 *        int[] arr; = null;
 *        A a; = null
 *        ------------------------- 선언만 가능 
 *        
 *     2. 초기화 블록 
 *        class ClassName
 *        {
 *           int a;
 *           static int b;
 *           = instance 블록 ===> 데이터베이스 드라이버 등록 
 *           {              ===> 네크워크 서버 연결 
 *              a=100;
 *              => static변수 초기화가 가능 
 *           }
 *           = static 블록 
 *           static =======> MyBatis 연동 , 설정 
 *           {
 *              b=200;
 *              => 인스턴스의 초기화는 불가능 
 *           }
 *           
 *           *** 상속 제외 
 *           *** 컴파일러에 의해 자동 호출 
 *           *** 크롤링 / 파일 읽기 / 데이터베이스값 채우기 
 *           
 *        }
 *        ==> 진화 => 생성자 
 *     3. 생성자 
 *     
 *     초기값 ==== 명시적인 초기화 ==== 초기화 블록 ==== 생성자 
 *                  |                              |
 *                  --------------------------------
 *                      | 한개 선택 
 *                | static = 초기화블록 
 *                | instance = 생성자 
 */
class Sawon{
	int sabun=10;
	
	{
		sabun=(int)(Math.random()*100)+1;
		comName="SIST3";
	}
	
	static String comName="SIST";
	
	static
	{
		comName="SIST2";
		
	}
}
public class 클래스_변수초기화 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s1=new Sawon();
        System.out.println(s1.sabun);
        System.out.println(s1.comName);
        
        Sawon s2=new Sawon();
        System.out.println(s2.sabun);
        System.out.println(s2.comName);
        
        Sawon s3=new Sawon();
        System.out.println(s3.sabun);
        System.out.println(s3.comName);
	}

}
