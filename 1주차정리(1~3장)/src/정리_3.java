// 변수 / 연산자 / 제어문 
// 묶기 
/*
 *    변수 => 데이터를 저장 => 연산 처리 
 *    ---                  -------
 *                            |
 *                           응용 : 제어문 
 *    변수+연산자+제어문 
 *    -------------- 메소드 
 *    메소드 여러개 묶음 
 *    -------------- 클래스
 *    클래스 여러개 묶음 
 *    -------------- 패키지 => .jar
 *    
 *    연산자 
 *      = 단항연산자 
 *        증감연산자 (++,--)
 *          전치연산자 : 먼저 증가  ==> ++a
 *          후치연산자 : 나중에 증가 ==> a++
 *          ---------------------------- 공통점 : 1증가,1감소
 *          int a=10;
 *          int b = ++a; 증가후에 증가된 값을 대입 
 *                  ---
 *                  a=a+1
 *              ----
 *              b = a
 *          int a=10;
 *          int b = a++ : 대입을 먼저 수행 나중에 a값을 증가 
 *              -----
 *               b=a
 *                   ---
 *                   a=a+1
 *          => 출력시에도 적용 
 *             int a=10;
 *             System.out.println(a++); 출력 => 증가 
 *             System.out.println(++a); 증가 => 출력 
 *          
 *        부정연산자 (!) : 부정 
 *                      boolean에서 사용이 가능 
 *                      true => false , false => true 
 *                      => 조건문 
 *                         ----- 1) 삼항연산자 
 *                               2) if ..
 *        형변환연산자 (데이터형)
 *      = 이항연산자 
 *        산술연산자 (+,-,*,/,%)
 *         => 자동형변환 
 *            => 큰데이터형으로 변경후 연산 
 *               -------------------- # 연산은 같은 데이터형끼리만 연산
 *               예)
 *                   double + int 
 *                            ---- double로 변경 
 *                   --------------- 연산 
 *                   10.5+10 
 *                        --- 자동으로 10.0으로 변경
 *                   char + int 
 *                   -----
 *                     int 
 *                   ------------- 연산 
 *                   'A'+1
 *                   ---
 *                    65 + 1 => 66
 *            => int이하는 연산시에 결과값이 int
 *               ------ char / byte 
 *               char + char = int => int보다 큰 데이터형으로 받을 수 있다
 *                                    --- long / float / double
 *               byte + byte = int 
 *               byte + char = int
 *               
 *            연산자 종류 
 *            + : plus / 문자열 결합 
 *                6+7=13 ---------
 *                        "Hello" + "Java" => "HelloJava"
 *                연산방향 
 *                  ===> 왼쪽에서 오른쪽 
 *                  6+7+9
 *                  ---
 *                    --- 
 *                *** +,- 보다 * , / , %가 우선 순위
 *                3+5*10
 *                  ----
 *                   50 + 3 => 53
 *                ---
 *            - : minus 
 *            * : gop
 *            ---------------
 *            / : 0으로 나누면 오류발생 => Infinity
 *                정수/정수=정수 => 정수/실수=실수
 *            ---------------
 *            % : 나머지는 반드시 왼쪽 부호
 *                (-) -
 *                (+) +
 *                배수 / 숫자 자르는 경우 => 화페매수 구하기 
 *                => 윤년 구하기 
 *            ---------------
 *        비교연산자 (==, != , < , > , <= , >=)
 *          => 숫자만 비교가 가능 (실수,정수,문자(숫자취급))
 *          => 예외 (boolean == , !=)
 *          => 조건문 / 반복문에서 주로 사용 
 *             ----- 삼항연산자 
 *             <=  < || == 6<=6  => 6==6 6<6
 *             >=  > || == 6>=6  => 6==6 6>6
 *          => 결과값은 boolean (true/false)
 *          => 문자열비교 
 *             => equals 사용하다 
 *        논리연산자 ( && , || )
 *          (조건) && (조건) 
 *          -----    -----
 *            |        |
 *            ----------
 *                 |
 *               true/false 
 *               
 *          ture      true  => true
 *          true      false => false 
 *          false     true  => false
 *          false     false => false
 *          ------------------------- 두개의 조건이 true일 경우에만 true
 *           효율적인 연산 => 왼쪽에 있는 조건이 false면 
 *                         오른쪽에 있는 조건은 수행하지 않는다
 *           => 사용 : 범위,기간 포함 여부 확인 
 *                        ---- 예약이 가능 
 *                    --- 페이징 / 점수 
 *                    --- 오라클 : Between ~ AND 
 *          (조건) || (조건)  => 조건 : true/false 
 *          -----    ------          -----------부정,논리,비교 
 *            |         |
 *            -----------
 *                 |
 *             true / false
 *             
 *            true    true  => true 
 *            true    false => true 
 *            false    true => true 
 *            false   false => false 
 *            ----------------------- 한개이상의 true가 있는 경우 true
 *            왼쪽 조건값이 true면 오른쪽은 수행하지 않는다 
 *            사용 => 범위,기간외 .. 잘못된 입력인 경우 => 오류 처리 
 *            
 *            알파벳 => 소문자 
 *            c>='a' && c<'z'
 *            c>='A' && c<='Z'
 *            
 *            범위외 
 *            a<0 || a>100
 *            
 *            세자리 정수 입력 
 *            a>=100 && a<1000 => a<=999
 *            
 *            
 *        대입연산자 ( = , += , -= )
 *            = 대입 
 *            += , -= : 복합 대입 연산자 
 *            a+=1 ==> a=a+1 => 1더하기 
 *            a+=2 ==> a=a+2 => 2더하기 
 *            a+=10 ==> a=a+10  
 *            ------------------- 여러개 증가 
 *            -= 
 *            a-=1 => a=a-1
 *            a-=2 => a=a-2
 *            ---------------------------- a--(1감소) a++(1증가)
 *            => 결과값 (연산자) , 초기값 대입 , 변경된 값 
 *            
 *            int a=10;
 *            a=20
 *            a=30
 *            
 *            
 *      = 삼항연산자 ((조건)?값1:값2)
 *                    | true => 값1
 *                    | false => 값2
 *        => 소스가 간결 : 게임 / 웹 => 삼항연산자 
 *           if ~ else => 일반 Application
 *           
 *        예) => 태그 
 *           <%
 *              if(curpage>1)
 *              {
 *           %>
 *            <a href="list.jsp?page=<%=curpage-1%>">이전</a>
 *           <%
 *              }
 *              else 
 *              {
 *           %>
 *               <a href="list.jsp?page=<%=curpage%>">이전</a>
 *           <%
 *              }
 *           %>
 *           
 *           <a href="list.jsp?page=<%=curpage>1?curpage-1:curpage%>">이전</a>
 */
public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=10;
        int y=10;
        int z;
        
        x++;
        ++x;
        System.out.println("x="+x);// 12
        // 전치 / 후치 => 무조건 1개 증가 
        System.out.println("=====");
        
        y--;
        --y;
        System.out.println("y="+y); // 8 
        System.out.println("=====");
        
        z=x++;
        /*
         *   z = x ++
         *   ----- z=x => z=12
         *         ---
         */
        System.out.println("z="+z);
        System.out.println("=====");
        z=++x;
        /*
         *   x=13
         *   z = ++x
         *       -- x=14
         *   z=x => z=14
         */
        System.out.println("z="+z);
        System.out.println("x="+x);
        
        z= ++x + y++;
        // x=14 , y=8
        /*
         *   z = ++x + y++
         *       ---   ---
         *        15     8  = 23
         *   x=15 y=9
         */
        System.out.println("z="+z);//23
        System.out.println("x="+x);//15
        System.out.println("y="+y);//9
        
        System.out.println("=====");
        boolean bCheck=false;
        System.out.println(bCheck);
        System.out.println(!bCheck);
        // 반대로 데이터를 읽는 경우 
        System.out.println("=====");
        System.out.println(65.0);
        System.out.println((int)65.0);
        System.out.println((char)65.0);
        System.out.println((double)'A');
        System.out.println((double)65);
        /*
         *       ==========> Up
         *   byte < char < int < long < double
         *       <========== Down
         *   숫자 관련만 가능 (boolean은 제외)
         *   큰데이터 = 작은 데이터형 => 자동으로 변경 
         *   
         *   double d=10 
         *            --- 10.0
         *   int i = 'A' 
         *           --- 65
         *   
         *   작은 데이터형 = 큰 데이터형 
         *                ---------- 작은 데이터형으로 변경
         *   int i=10.5 
         *         ---- 오류 발생 
         *   int i=(int)10.5 => 10
         *   
         *   예외)
         *        char c=65; => 선언과 동시에 초기값으로만 가능 
         *                
         *    
         */
        char c1='A';
        char c2='B';
        int c3=c1+c2;// int / long / double
        
        byte b1=127;
        byte b2=127;
        int b3=b1+b2;
	}

}
