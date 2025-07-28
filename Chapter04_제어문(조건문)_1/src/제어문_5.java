// 조건문 
/*
 *   선택 조건문 : true/false 나눠서 작업 
 *   변수 / 연산자 / 제어문 / 메소드 
 *   -------------------------- 웹에서 사용 
 *                              -- 
 *   정수를 입력을 받아서 
 *   11 22 33 ... => 같은 수 / 다른 수입니다 
 */
import java.util.Scanner;
public class 제어문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("두자리 정수 입력:");
        int num=scan.nextInt();
        // 1. 오류처리 => 조건문으로 주로 처리 => 예외처리 
        // 코딩 테스트 
        // 2. 재입력 
        // 3. 결과값 출력 
        // 오류 처리 
        if(num>=10 && num<=99)
        {
        	// 정상적으로 입력이 된 경우 => 중첩 조건문 
        	//int a=num/10;
        	//int b=num%10;
        	if(num%11==0)
        	{
        		System.out.println(num+"은(는) 같은 수입니다");
        	}
        	else
        	{
        		System.out.println(num+"은(는) 다른 수입니다");
        	}
        	
        }
        else
        {
        	System.out.println("잘못된 입력입니다!!");
        }
	}

}
