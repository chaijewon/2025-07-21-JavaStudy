/*
 *    ** for-each : 화면 출력 
 *       
 *       for(데이터 받는 변수:배열,컬렉션) 
 *           ------------ 배열의 실제된 값 받기 
 *           1. 기본형 
 *           2. 사용자 정의 데이터형 : class
 *       {
 *           바로 출력이 가능 
 *       }
 *    ** while(true) => 서버 / 데이터베이스 
 *    
 *    ----------------------------------------
 *     기능 분리 
 *     ------- 메소드 : 기능 구현 
 *             ** 기능 구현 
 *             ** 반복 제거 
 *             ** 가독성 
 *             ** 에러를 빨리 잡기 위한 방법 
 *     형식) 
 *          리턴형 메소드명(매개변수...)
 *          -----
 *          {
 *              return 값; => 메소드 종료
 *                    ---- 클래스 / 배열 / 기본형
 *                    => 기본형 : int / boolean 
 *          }
 *          
 *          매개변수 : 사용자 요청 값 
 *                   -----------
 *                   목록 => 페이지
 *                   사원의 상세보기 => 사번
 *                   -------------------
 *                   사원 등록 => 사원 객체 
 *                   -------------------
 *                   여러개 / 한개 / 없는 경우 / 알수 없는 경우
 *          리턴형 : 결과값 (화면출력내용) 
 *                 ----------------- 서버에서 처리 
 *          메소드 => 식별자 
 *          
 *          => 가변형 매개변수
 *             int... a
 *             char... b
 *             boolean... c
 *             -------------
 *             Object... obj => 가장 큰 데이터형 
 *             
 *             Object o=10
 *             o=10.0
 *             o=new Sawon()
 *             o='A'
 *             o=true        
 */
class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	int pay;
	// 배열 , 클래스
	public Sawon(){}
	public Sawon(int sabun, String name, String dept, String job, String loc, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.loc = loc;
		this.pay = pay;
	}
	
}
public class 메소드_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sawon[] sawons=new Sawon[5];
        Sawon s1=new Sawon(1, "홍길동", "개발부", "대리", "서울", 4000);
        Sawon s2=new Sawon(2, "심청이", "영어부", "사원", "부산", 3000);
        Sawon s3=new Sawon(3, "이순신", "총무부", "과장", "대전", 5000);
        Sawon s4=new Sawon(4, "박문수", "기획부", "사원", "강원", 3000);
        Sawon s5=new Sawon(5, "강감찬", "자재부", "부장", "제주", 6000);
        
        sawons[0]=s1;
        sawons[1]=s2;
        sawons[2]=s3;
        sawons[3]=s4;
        sawons[4]=s5;
        
        // 출력 
        for(Sawon s:sawons)
        {
        	System.out.printf("%3d%7s%7s%5s%5s%7d\n",
        			s.sabun,s.name,s.dept,s.job,s.loc,s.pay);
        }
        
        System.out.printf("%d\n",10);
        System.out.printf("%d%d%d\n",10,20,30);
        
	}

}
