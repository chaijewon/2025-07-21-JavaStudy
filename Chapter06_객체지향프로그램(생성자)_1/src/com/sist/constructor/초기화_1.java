package com.sist.constructor;
/*
 *    class ClassName
 *    {
 *        int age;  ==> 0
 *        String name; ==> null
 *        
 *        메모리에 저장 
 *        ----age-----
 *             0
 *        ----name----
 *            null
 *        ------------
 *        
 *        1. 초기값 ==> 명시적인 초기화
 *        int age=30;
 *        String name="홍길동"
 *        
 *        메모리에 저장 
 *        ----age-----
 *             30
 *        ----name----
 *           홍길동
 *        ------------
 *        
 *        2. 초기화 블록 
 *        int age;
 *        String name;
 *        int[] arr=new int[5];
 *        A a=new A()
 *        
 *        
 *        {
 *           age=20;
 *           name="심청이";
 *           -------------- 명시적으로 처리
 *           
 *           => 명시적으로 초기화가 불가능한 부분 
 *           => 데이터베이스 값을 읽기 
 *           => 크롤링 
 *           => 파일 읽기 
 *           => 윈도우 폼 
 *        }
 *        
 *        메모리에 저장 
 *        ----age-----
 *             20
 *        ----name----
 *           심청이
 *        ------------
 *        
 *        => 문제점 
 *           항상 같은 데이터만 저장 
 *        => 다른 값을 저장 
 *           생성자 => 매개변수 
 *           ---------------
 *           {
 *              // 매개변수를 이용할 수 없다 
 *           }
 *           static 
 *           {
 *              // 매개변수를 이용할 수 없다 
 *           }
 *           
 *           
 *           생성자 
 *           -----
 *            여러개를 만들 수 있다
 *            ----------------- 매개변수가 다른 경우 (오버로딩)
 *            
 *            // 특별한 경우가 아니면 변수에 대한 초기화를 하지 않는다
 *            // 서버 연결 , 데이터베이스 
 *            
 *            
 *            class ClassName
 *            {
 *               ----------
 *                변수 => 은닉화 / 캡슐화 
 *                       getter/setter => lombok
 *                       데이터 보호 
 *                       접근 지정어 
 *               ----------
 *                생성자 => 서버연결 : 필요시에만 사용  
 *               ----------
 *                메소드 => 구현 => 수정 / 추가 => 상속 
 *               ---------- 필요시에만 
 *            }
 *            
 *            ***데이터형 클래스 : 변수만 모아서 저장 
 *            ***액션 클래스 : 기능 => 메소드 
 *            혼합형 : 변수+메소드
 *            ----------------
 *              브라우저 전송 : 조립 
 *            
 *    }
 */
// => 데이터형 => 숨겨진 데이터 
class Music{
	int rank;
	String poster;
	String title;
	String singer;
	String album;
	String state; // 유지 , 상승 , 하강 
	int idcrement; // 단계 
}
/*
 *     클래스의 구성요소 
 *     class ClassName
 *     {
 *        -------------
 *         변수 
 *          = 데이터를 따로 저장 => new 를 이용해서 메모리 공간을 만든다
 *                              데이터를 저장 
 *                              인스턴스 변수 
 *                              *** new를 이용하면 메모리가 따라 생성 
 *                              *** new를 사용시에는 반드시 생성자를 동반한다
 *                              형식 => new 생성자()
 *                                     ----------
 *                                     new => 클래스 크기 확인 
 *                                            메모리를 만든다 
 *                                            메모리 주소를 리턴 
 *                                     생성자 => 메모리에 값을 대입
 *                                     int malloc(클래스) => new 연산자로 변경
 *                                     *** 메모리 주소는 int를 넘어가지 않는다 
 *                                     A a=new A()
 *                             class A
 *                             {
 *                                int a,b,c,d; ----
 *                                static int e;    | => 멤버변수 
 *                                String name; ----
 *                             }
 *                             
 *          = 데이터를 한개 저장 : 메모리 공간이 한개만 생성 
 *                             공유변수 
 *                             static int a;
 *        -------------
 *         초기화 => 프로그램에서 필요시에 처음 대입 값
 *         
 *         일반 값을 대입 : 명시적 초기화 
 *         *** 클래스블록 : 구현 => 외부데이터 읽기 대입(X)
 *         -------------------------
 *         초기화 블록 : 자동 호출  
 *         
 *          
 *         생성자 => 주로 사용 직접 호출
 *         
 *         => 상속예외 , 리턴형이 없다 
 *         => 클래스명과 동일 
 *            class A
 *            {
 *               ***A(){}
 *               ----------------
 *               void A(){}    객체명.A()
 *               int A(int a){} 객체명.A(10)
 *               ---------------- 일반 메소드
 *               ***A(int a,int b){} => A(int,int)
 *               ***A(double d){}    => A(double)
 *            }
 *         => 오버로딩 : 한개의 메소드명으로 여러개의 새로운 기능을 만든다 
 *            => 초기화 
 *            => 사용자로부터 값을 받아서 초기화 
 *               매개변수를 가지고 있는 생성자
 *            => 오버로딩 
 *               1) 메소드명 동일 
 *               2) 매개변수가 다르다 
 *                  -------------
 *                  = 갯수가 다른 경우 
 *                    substring(int begin)
 *                    substring(int begin , int end)
 *                    
 *                    print(String s)
 *                    print(int i)
 *                    print(char c)
 *                    
 *                    버스() 버스(고속엔진)
 *                    버스(마을) 버스(좌석)
 *                    => 중복 메소드 정의 
 *                  = 데이터형이 다른 경우 
 *            ===> 값을 입력받아서 처리 
 *            ===> 네트워크 / 데이터베이스 => 미리 연결 
 *            ===> 시작과 동시에 처리해야 할 내용이 있는 경우 
 *            ===> 화면 UI 
 *            ===> 반드시 한개이상은 존재 
 *                 : 없는 경우에 자동 생성이 된다 
 *                 : 매개변수가 없는 생성자 
 *                   => 디폴트 생성자 
 *        --------------------------
 *        
 *        -------------
 *     }
 */
class GenieMusic
{
	Music[] music=new Music[50];
	// 코딩이 불가능 
	{
		// 크롤링 
	}
	
}
class 학생
{
	String name;
	int hakbun;
	
	/*{
		name="심청이";
		hakbun=2;
	}*/
//	학생(int h,String n)
//	{
//		hakbun=h;
//		name=n;
//	}
}
public class 초기화_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		학생 a=new 학생();
        //System.out.println("Hello");
//		학생 a=new 학생(1,"홍길동");
//		System.out.println(a.name);
//		System.out.println(a.hakbun);
//		
//		학생 b=new 학생(2,"심청이");
//		System.out.println(b.name);
//		System.out.println(b.hakbun);
	}

}
