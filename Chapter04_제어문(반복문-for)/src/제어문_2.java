/*
 *     어디서부터 어디까지 반복횟수(증가/감소)
 *          1     2    4
 *     for(초기값;조건식;증감식)
 *     {
 *          반복수행문장 3 
 *     }
 *     
 *     1-2-3-4
 *       2-3-4
 *       2-3-4
 *       .....> 2의 조건식 false면 종료 
 *     
 *     => 반복 횟수가 있다 
 *     => Front-End : for => Back-End : while 
 *     ---------------------------------------
 *                     | 이차 for문 
 *                       --------- 알고리즘 
 *                       구구단 / 페이징
 *                               | 1차 for  
 *                         | 2차 for
 *     ----------------------------------------
 *     
 *     => 1~100 => 합 / 짝수합 / 홀수합 
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0,even=0,odd=0;
        // 합 => 초기값은 0부터 시작 , 곱 => 초기값은 1부터 시작 
        for(int i=1;i<=100;i++)
        {
        	sum+=i; // sum=sum+i
        	if(i%2==0)
        		even+=i;
        	else
        		odd+=i;
        }
        System.out.println("1~100까지의 총합:"+sum);
        System.out.println("1~100까지의 짝수합:"+even);
        System.out.println("1~100까지의 홀수합:"+odd);
        System.out.println("=======================");
        // 변수 
        int a=0,b=0,c=0;
        // 반복문 
        int i=1;
        // i=100 i<=100 => i=101 i<=100
        for(i=1;i<=100;i++)
          // i변수는 for에서만 사용이 가능 
        {
        	if(i%3==0)
        		a+=i;
        	if(i%5==0)
        		b+=i;
        	if(i%7==0)
        		c+=i;
        	
        }// i는 메모리에서 사라진다  => 지역변수 
        System.out.println("i="+i);
        System.out.println("1~100까지 3의 배수 합:"+a);
        System.out.println("1~100까지 5의 배수 합:"+b);
        System.out.println("1~100까지 7의 배수 합:"+c);
        
	}
    // 3의 배수합,5의	배수 ,7의 배수 
}
