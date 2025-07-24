/*
1. 다음 중 식별자 사용이 잘못된 경우를 모두 골라라.

1) int _i; => _,$ 사용이 가능 
2) int %j; => %
3) char 안녕; => 한글/알파벳으로 시작 
4) double 1var; => 숫자는 사용이 가능 (단 앞에 사용금지)
5) char student_ID;
6) final int abcdefghijklmnopqrstuvwxyz;//문자의 길이를 제한하지 않는다
==> 2,4

2. 다음 각 항목이 나타내는 변수를 선언하라.
   데이터형 변수명 
1) int형 변수 height
   int height;
2) 0.25로 초기화된 double형 변수 size
   double size=0.25
3) height 변수의 값과 size 변수의 값을 더한 값으로 초기화된 double형 변수 total
   double total=height+size
4) 문자 'a'로 초기화된 char형 변수 c   
   char c = 'a';
   
   1. 초기화 
      int i=0
      double d=0.0
      float f=0.0f
      boolean b=false
      char c=' '
      long l=0L

3. 다음 수식의 결과 값과 타입은?

67+12.8  => 67.0
            67.0+12.8 => 79.8
10/3 => 정수/정수=정수 => 3
10.0/3 => 실수/정수=실수 => 3.3333...
10==9
----- false 

4. 다음 표의 빈칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
   ------------------------------------------------
         1byte          2byte      4byte   8byte 
   ------------------------------------------------
    정수   byte          short       int     long(빅데이터,금융권)
        (-128~127)     (16bit)    정수 default
        => 네트워크 전송 -32768~32767   |
        => 웹 전송      => C언어 호환  컴퓨터 인식
           파일업로드 
           파일다운로드 
        암호화 (RAS,DES)
                      *** int / long => L(l)
   -------------------------------------
    실수                           float   double 
                             정밀도  7자리    15자리
                                          default 
                             float / double => f(F)               
   -------------------------------------
    문자            char (0~65535) 
                   멀티바이트 : 각언어를 사용할 수 있다 
                   -------- Unicode 
                   -------- 모든 운영체제에 호환 
   -------------------------------------
    논리   boolean => true / false 
   -------------------------------------

5. 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.

int i = 100;
long l = 100L;
final float PI = 3.14f;

약속 사항 
  변수는 소문자 
  상수는 모든 문자를 대문자 사용 

==> 변수 : i , l
==> 상수 : PI
==> 리터럴 : 100,100L , 3.14f
==> 키워드 : int , long ,final , float
 
6. 다음 중 기본형(primitive type)이 아닌 것은?

1) int
2) Byte => Wrapper 클래스 (박싱,언박싱)
           ------------- 데이터형을 클래스화 (기능을 부여)
           Integer (int)  Integer i=100
                          int ii=i
           Byte (byte)
           Short (short)
           Long (long)
           Double (double)
           Float (float)
3) double
4) boolean

7. 다음 중 형 변환을 생략할 수 있는 것은? (모두 고르시오)
byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;
a. b = (byte) i; => 불가능  int <= byte,  byte <= int(X)
b. ch = (char) b; => 불가능
c. short s = (short) ch; => 생략이 불가능 
d. float f = (float) l;
             ------- 생략 
e. i = (int) ch;
       ------ 생략이 가능 
   byte < char < int < long < float < double
          short
 
8. 다음 중 변수를 잘못 초기화한 것은? (모두 고르시오) a,c,d
a. byte b = 256; // 범위 초과 => 127
b. char c = ' '; ''오류
c. char answer = 'no'; // 한글자
d. float f = 3.14; // double 
e. double d = 1.4e3f;

 */
public class 정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b=Double.isInfinite(10/0.0);
        System.out.println(b);
        b=Double.isNaN(10%0.0);
        System.out.println(b);
	}

}
