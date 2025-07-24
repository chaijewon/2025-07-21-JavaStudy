/*
 *    대입연산자 
 *    
 *    = 값을 대입 (초기값,결과값) 
 *    
 *    ----------- 복합 대입연산자 
 *    +=
 *      => int a=10;
 *         a+=10; ==> a=a+10 => 20
 *         => 증가 
 *         
 *         5개 증가 
 *         a++; => a+=1 a+=2 a+=3...
 *         a++;
 *         a++;
 *         a++;
 *         a++;
 *         
 *         a+=5; => a=a+5 => 10000을 증가 
 *    -=
 *         int a=1;
 *         
 *         a-- : a-=1
 *         a--
 *         a--
 *         
 *         a-=3 => a=a-3
 *    ----------------------
 *    *=
 *        int a=10;
 *        a*=10 ==> a=a*10
 *    /=
 *        a/=10 ==> a=a/10
 *    %=
 *        a%=10 ==> a=a%10
 */
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=1;
        a++;
        ++a;
        ++a;
        a++;
        a++;
        System.out.println("a="+a);
        
        a=1;
        a+=5;
        System.out.println("a="+a);
        
        /*
         *   a++
         *   ++a
         *   ------- 고정 (1개만)
         *   a+=1 : 누적 , 누적된 문자열 결합 
         *   ------- 여러개를 동시에 증가 
         *   a=a+1 
         *   ------- 
         */
        String s1="Hello ";
        String s2="Java";
        String s3="!!";
        String s4=s1;
         s4+=s2;
         s4+=s3;
         System.out.println(s4);
         // (= , +=) => 숫자,문자열  , -= => 숫자 
         // HTML누적 
	}

}
