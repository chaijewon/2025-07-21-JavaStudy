// 81page 
/*
 *   증감연산자 => 제어문(반복문)
 *                     |
 *                    게임 => 총알 발사 
 *                    비행기 => 자동이동 
 *     ++ , -- 
 *     ---  ---
 *          | 1 감소
 *     | 1 증가 
 *     
 *    1) 전치 연산자 
 *       ++a : 1증가
 *       -- 먼저 증가하고 다른 연산 수행  
 *    2) 후치 연산자
 *       a++ : 1증가
 *        -- 다른 연산 수행 나중에 증가 
 *        
 *    예)
 *        int a=10;
 *        int b=++a;
 *              --
 *               1
 *             --
 *              2
 *        
 *        a=11 , b=11
 *        
 *        int a=10;
 *        int b=a++;
 *            ---
 *             1
 *               --
 *                2
 *        a=11 , b=10
 *        
 *       
 *        int a=10;
 *        int b=++a + ++a;
 *               11 +  12 ==> 23
 *        
 *        int a=10;
 *        int b=a++ + a++;
 *               10     11  => 21
 *               
 *        int a=10;
 *        int b=++a + a++
 *              ---   ---
 *               11    11  => 22
 *               
 *        int a=10;
 *        int b=++a + a++ + ++a + a++
 *               11   11     13    13 => 48
 *               
 *        int a=10;
 *        int b=a++ + a++ + ++a + a++
 *              10    11     13   13 => 47
 *              
 *        -----------------------------------
 *        int a=10;
 *        int b=a++ + --a + a-- + a++
 *               10    10   10    9
 *               
 *        int a=10;
 *        int b=a-- + a-- + --a + --a;
 *               10    9      7    6  ==> 32
 */
public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=++a;
        // ++ => a=a+1
        // b=a
        // 전치 => 증가하고 증가된 값을 대입 
        System.out.println("a="+a+",b="+b);
        
        a=10;
        b=a++;
        // b=a ==> b=10
        // a=a+1 => a=10+1
        // 후치 => 대입을 하고 나중에 증가 
        // a++ a++ a++ a++ a++ => ++a  
        System.out.println("a="+a+",b="+b);
        
        a=10;
        b=++a + ++a;
        // 11    12  + => 23
        System.out.println("a="+a+",b="+b);
        
        a=10;
        b=a++ + a++;
        // 10    11 => 21
        System.out.println("a="+a+",b="+b); 
        
        a=10;
        b=--a; // a=9 , b=9
        System.out.println("a="+a+",b="+b);
        
        a=10;
        b=a--; // a=9 b=10
        System.out.println("a="+a+",b="+b);
        
        a=10;
        a++;
        a--;
        --a;
        ++a;
        a++;
        System.out.println(a);
        
        //a=10;
        a++;
        a++;
        a--;
        System.out.println("a="+a);
        /*
         *   double d=123456.78;
         *   int i=123456;
         *   int a=(int)((d-i)*100)
         */
        double d=123456.78f;
        int i=123456;
        int a1=(int)((d-i)*100);
        System.out.println(a1);
        
        // char는 연산이 수행되는 자동으로 int로 변경 
        char c='A';// 65 + 1 => 66 ('B')
        char c1=c++;
        System.out.println(c);
        System.out.println(c1);
	}
	/*
	 *   ++ , -- => 무조거 1개증가/1개감소
	 *   int a=10;
	 *   int b = a ++;
	 *       ----- --
	 *             2) a에 1을 증가 
	 *       1)b에 a값 대입 
	 *   
	 *   int a=10;
	 *   int b = ++a;
	 *           --
	 *           1) a에 1을 증가 
	 *       -------
	 *        2) b에 증가된 증가된 a값을 대입  
	 */

}
