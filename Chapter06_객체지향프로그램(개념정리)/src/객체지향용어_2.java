/*
 *    클래스 제작 
 *    => 기능 (동작 => 메소드) => 액션 클래스 
 *                            ---------
 *                             ~DAO, ~Model
 *                                   => 브라우저 연동 
 *                             => 오라클 연동  
 *       : 생성자 , 변수가 필요 없다 
 *    => 데이터형을 제작 => 데이터형 클래스 
 *       : 변수 
 *       => 생성자 / 메소드 
 *       => ~VO , ~DTO => 데이터를 모아서 전송할 목적 
 *       => 캡슐화
 *    ---------------------------------------------
 *    메소드 : 기능 
 *      = 종류 
 *        ****1) 인스턴스 메소드 => 객체마다 따로 동작 
 *        2) 정적 메소드 => static 
 *           클래스명.메소드()
 *           Math.random()
 *           String.valueOf()
 *           => 디자인 패턴 => 싱글턴 패턴 
 *                          ---------
 *                        데이터베이스 연동 
 *        3) 종단 메소드 => 상속에서 => 오버라이딩이 안되는 메소드
 *           final 
 *        4) 선언만 하는 메소드 : 인터페이스 
 *           abstract 
 *           버튼클릭
 *           마우스클릭 
 *      ------------------------------------------------  
 *      메소드 : 특정 기능을 수행하는 명령문의 집합 
 *             -------- 목록 / 삭제 / 추가 / 상세보기...
 *             => 구조적인 프로그램 
 *                단락 => 가독성이 좋다 
 *             => 다른 클래스와 통신을 할때 사용 : 메세지 
 *             => 재사용 
 *             => 한가지 기능만 수행 
 *             => 분업이 가능 
 *             => 일반 사이트 : MVC => Spring 
 *                           ---- Front / Back
 *             --------------------------------
 *             벤치마킹 : 메소드 찾기 
 *             ------------------
 *    1. 형식 
 *       변수형식 
 *       [접근지정어][제어어] 데이터형 변수명
 *       생성자 
 *       [접근지정어] 클래스명(){}
 *       메소드형식
 *       [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 *       {
 *       }
 *       
 *    2. 접근지정어
 *         => 변수 / 메소드 / 클래스 / 생성자 
 *         => 접근 권한을 지정해서 사용 
 *         => 접근 범위에 따라 순서 
 *            private < default < protected < public 
 *            | 인스턴스 변수 (데이터 보호)         | 다른 통신이 가능 
 *                                            | 클래스 / 생성자 / 메소드
 *       private 
 *         : 같은 클래스 내부에서만 접근이 가능 => 자신 클래스안에서만 사용이 가능
 *         : 인스턴스 변수 => 은닉화 => 캡슐화 
 *       default : 같은 폴더까지만 접근이 가능 
 *       protected : 같은 폴더까지만 접근이 가능 , 다른 폴더인 경우에 상속이 있어야 접근 가능
 *       public : 모든 클래스에 접근이 가능 
 *       
 *       ----------------------------------------------
 *               자신의 클래스  같은 폴더   상속받은 경우 모든 클래스 
 *       ----------------------------------------------
 *       private     O
 *       ----------------------------------------------
 *       default     O           O
 *       ----------------------------------------------
 *       protected   O           O         O
 *       ----------------------------------------------
 *       public      O           O         O          O
 *       ----------------------------------------------
 *       private int age;
 *       private String name;
 *       --------------------
 *       public 클래스명(){}
 *       --------------------
 *       public int add(){}
 *       
 *    2-1. 제어어 
 *       fianl : 종단 => 종단 클래스 => public final class String
 *                                  public final class Math
 *       static : 정적 => 공유 / 공통으로 사용 
 *       public static int a;
 *       public static void display(){}
 *       abstract : 클래스 종류 => 추상클래스 / 인터페이스 
 *       기능은 동일 => 구현이 다른 경우 
 *       class/method 
 *       public abstract class ClassName
 *       {
 *          public abstract void display();
 *       } 
 *    3. 패키지 제작 
 *    
 *    => 객체마다 따라 동작 => 인스턴스 메소드 
 *    [접근지정어] 리턴형 메소드명(매개변수..)
 *    {
 *       
 *        return 값 ==> 생략 void => 생략이 되면 자동으로 컴파일러가 추가
 *    }      |
 *        메소드 종료
 *        1. import java.lang.* => String,System,Math..
 *        2. 기본 생성자 
 *        3. 메소드 void일 경우 => return
 *        ---------------------------------------------
 *        4. extends Object
 *           => 모든 클래스는 Object 상속 
 *        5. try~catch
 *           => CheckException / UnCheckException     
 *    
 */
class Sawon
{
	public Sawon()
	{
		System.out.println("객체 생성");
	}
	public void print()
	{
		System.out.println("객체 활용");
	}
	// 소멸자 함수 => A() , ~A()
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	
}
/*
 *    => 요구사항 분석
 *       1. 기능 목록 작성 
 *       2. 시나리오 작성 
 *       예) 회원가입 , 로그인 , 맛집 출력 , 예약 ...
 *          => 상중하 
 *    => 객체 도출 
 *       1. 명사 => 클래스 후보 , 변수 후보 
 *       예) Food => 출력 , 예약 
 *           Member => 로그인 , 가입 , 탈퇴...
 *    => 역할 분담 
 */
public class 객체지향용어_2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon s=new Sawon();
        s.print();
        s=null;
        System.gc();
	}

}
