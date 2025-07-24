/*
 *   웹 개발 
 *   ------
 *   연산자 ===========> 오라클 / 자바스크립트 
 *     ***1. 산술연산자 
 *     2. 비교연산자 
 *     ***3. 증감연산자 
 *     ***4. 형변환연산자 
 *     5. 논리연산자 
 *     ***6. 부정연산자 
 *     7. 대입연산자 
 *     -------------
 *     
 *     자바 => JSP / SpringFramework / Spring-Boot 
 *            ------------------------------------ 웹 라이브러리
 *     자바스크립트 => VueJS / ReactJS / NextJS 
 *     오라클 => MySQL / MariaDB 
 *     --------------- CI/CD => 리눅스 명령어 
 *                              ----------
 *                              1. AWS => 우분투 
 *                              
 *     ---------------------------------------------
 *     비교연산자 : 결과값 true/false 
 *     --------
 *          1) 정수 
 *          2) 실수 
 *          3) 문자 
 *          4) 논리(boolean) 제한 => ==, !=
 *          ===> 문자열 / 날짜 => 비교가 불가능 
 *       1. == (같다) 
 *       2. != (같지 않다)
 *       3. < 작다
 *       4. > 크기  ====> 왼쪽  a>10 a<10
 *       5. <= 작거나 같다 
 *          ---  < == => 둘중 하나가 true면 true가 된다 
 *          6<=6  6<6 6==6
 *       6. >= 크거나 같다 
 *          ---   > ==
 *          
 *       사용처 : 조건문 / 반복문 
 *              if(비교연산자|논리연산자|부정연산자)
 *                 ------------------------ true/false 
 *              while(비교연산자|논리연산자|부정연산자)
 *              {
 *                 
 *              }
 *                 
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=10;
        int num2=10;
        boolean result1=(num1==num2); // true
        boolean result2=(num1!=num2); // false
        boolean result3=(num1<=num2); // true 
        // num1<num2 num1==num2
        char c1='A';
        char c2='B';
        boolean result4=(c1<c2); // true 
        // *** char 데이터형은 모든 연산이 수행되면 정수로 변환 
        //   65 < 66
        double f=10.5; 
        double d=10.5;
        boolean result5=(f==d);
        System.out.println(result5);
        
        boolean b1=true;
        boolean b2=false;
        boolean result6=(b1==b2); // true
        boolean result7=(b1!=b2); // false
        // String 참조 => 실제메모리에는 주소값 저장 
        String s1=new String("Hello");
        // 새로운 메모리에 Hello를 저장 
        String s2="Hello";
        String s3="Hello";
        
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        
        boolean result8=(s1==s2); // false
        boolean result9=(s1!=s2); // true 
        boolean result10=(s2==s3); // true
        boolean result11=(s2!=s3); // false
        boolean result12=(s1.equals(s2));
        //                   ------- 실제 저장된 문자열만 비교
        
        System.out.println("result1:"+result1);
        System.out.println("result2:"+result2);
        System.out.println("result3:"+result3);
        System.out.println("result4:"+result4);
        System.out.println("result5:"+result5);
        
        System.out.println("result6:"+result6);
        System.out.println("result7:"+result7);
        System.out.println("result8:"+result8);
        System.out.println("result9:"+result9);
        System.out.println("result10:"+result10);
        
        System.out.println("result11:"+result11);
        System.out.println("result12:"+result12);
        
        String ss1="Hello";
        String ss2="hello";
        
        boolean result13=(ss1.equals(ss2));
        // 로그인처리 => id찾기 / 비밀번호 찾기 
        // id중복체크 
        // 대소문자 구분 => 비교 
        boolean result14=(!ss1.equals(ss2));
        boolean result15=(ss1.equalsIgnoreCase(ss2));
        // true => 대소문자 구분하지 않고 비교 
        // 검색 => AWS 
        System.out.println("result13:"+result13);
        
        System.out.println("result14:"+result14);
        System.out.println("result15:"+result15);
        
        // 비교연산자 => 숫자 (정수,실수), 문자 , boolean 
        // 문자열은 자체 라이브러리를 이용한다 
        /*
         *   String => 클래스 (기능=>메소드) => 표준화 
         *   
         *   contains() => 단어 포함 => 검색 
         *   --------------
         *   startsWith() => 시작문자열 같은 경우 
         *   endsWith() => 파일 확장자 .jpg
         *   -------------- 서제스트 
         *   
         *   System / String / Math .....
         */
	}

}
