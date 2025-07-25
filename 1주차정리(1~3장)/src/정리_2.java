/*
 *   변수 : 한개의 데이터값을 저장할 수 있는 메모리 공간의 이름 
 *                                  ---------------
 *                                  메모리는 주소/번지 
 *                                         -------
 *                                         | 별칭 
 *   1) 임시로 데이터값을 컴퓨터에 인식 => 재사용 
 *      변수 : 한개의 값 
 *      배열 : 같은 것 여러개 => 사과박스 , 배박스 
 *      클래스 : 다른 것 여러개 => 종합과일셋트 
 *      ----------------------------------- 메모리에 저장 
 *      File 
 *      ***RDBMS(오라클)
 *      ----------------------------------- 영구적으로 저장이 가능
 *      =>  프로그램은 저장 (데이터 관리) => CRUD
 *          C(Create) R(Read) U(Update) D(Delete)
 *            저장       출력      수정      삭제 
 *    2) 변수 => 읽기 / 쓰기(저장,수정) 
 *              ------------------
 *              | 기능 : setter / getter
 *    3) 메모리 크기 (데이터형) 
 *        정수 
 *          byte (1byte) 채팅 => byte , 파일업로드/파일 다운로드
 *          ------------------
 *          int  (4byte) = 일반 정수 => 가장 사용되는 데이터형 
 *          long  (8byte) = 통계 , 확률 , 빅데이터 
 *          ------------------ l(L)
 *        실수 
 *          double (8byte) => 15자리(정밀도)
 *        문자
 *          char (2byte) => 0~65535
 *        논리
 *          boolean (1byte) => true/false만 저장이 가능
 *    4) 변수 선언 
 *        데이터형 변수명; => 메모리 저장 공간 확보 
 *                | 
 *              = 알파벳 , 한글로 시작
 *                (대소문자 구분) 
 *              = 숫자는 사용이 가능 (앞에 사용금지)
 *              = 키워드는 사용금지 (int , long...)
 *              = 특수문자 => (_ , $) 
 *              = 공백없이 사용 
 *              = 문자길이 => 제한 (3~7) 
 *                ------------------- 가독성 (리팩토링) 
 *                => 코드리뷰 / 디자인 패턴 / 공통 모듈 
 *                            | 8개 
 *                => 테스트
 *    5) 초기값 부여 
 *       => 변수선언 => 초기값이 없는 경우에는 사용이 불가능 
 *          byte => 0
 *          int => 0
 *          long => 0L
 *          char => '\0' => ' '
 *          boolean => false 
 *          double => 0.0 
 *          String => ""
 *          ====> 변수 => 필요시마다 변경해서 사용 
 *          
 *       => 명시적 초기화  => int a=10;
 *       => 사용자 입력값 : Scanner / JOptionPane ...
 *       => 임의로 데이터 추출 => random
 *      
 */
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b1=Byte.MIN_VALUE;
        byte b2=Byte.MAX_VALUE;
        
        int i1=Integer.MIN_VALUE;
        int i2=Integer.MAX_VALUE;
        
        long l1=Long.MIN_VALUE;
        long l2=Long.MAX_VALUE;
        
        double d1=Double.MIN_VALUE;
        double d2=Double.MAX_VALUE;
        
        char c1=Character.MIN_VALUE;
        char c2=Character.MAX_VALUE;
        
        System.out.println("byte:"+b1+"~"+b2);
        System.out.println("int:"+i1+"~"+i2);
        System.out.println("long:"+l1+"~"+l2);
        System.out.println("double:"+d1+"~"+d2);
        System.out.println("char:"+0+"~"+65535);
	}

}
