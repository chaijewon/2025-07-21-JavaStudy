/*
 *   for => 형식 , 동작 순서 
 *         ---------------
 *                   |
 *           => 1    2  <= 4
 *         for(초기값;조건식;증가식)
 *         {          |
 *             실행문장 (반복) 3 
 *         }
 *         
 *   --------------------------------
 *   정수 입력 => 2~9 
 *   => 구구단 
 *   2*1=2
 *   ..
 *   ..
 *   2*9=18    
 */
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("2~9 사이의 단을 입력:");
        int dan=scan.nextInt();
        if(dan>=2 && dan<=9)
        {
        	for(int i=1;i<=9;i++)
        	{
        		System.out.printf("%d * %d = %d\n",
        				dan,i,dan*i);
        	}
        }
        else
        {
        	System.err.println("구구단 출력이 불가능합니다!!");
        }
	}

}
