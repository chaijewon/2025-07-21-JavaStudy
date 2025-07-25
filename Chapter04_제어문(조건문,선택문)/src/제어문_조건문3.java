// 사용자 정수 2 => 연산자 1
import java.util.Scanner;
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        System.out.print("첫번째 정수 입력:");
        int num1=scan.nextInt();
        
        System.out.print("두번째 정수 입력:");
        int num2=scan.nextInt();
        
        System.out.print("연산자 선택(+,-,*,/):");
        String temp=scan.next();
        //     ----- char 변환 
        char op=temp.charAt(0); // 첫번째 문자=> char변환 
        // 자바에서 사용하는 문자열은 0번부터 시작한다 
        
        System.out.println("====== 결과 ======");
        if(op=='+')
        	System.out.printf("%d %c %d = %d\n",
        			num1,op,num2,num1+num2);
        if(op=='-')
        	System.out.printf("%d %c %d = %d\n",
        			num1,op,num2,num1-num2);
        if(op=='*')
        	System.out.printf("%d %c %d = %d\n",
        			num1,op,num2,num1*num2);
        /*
         *   / 
         *   => 정수/정수 = 정수
         *   => 정수/실수 = 실수 (소수점)
         *   => 0으로 나눌 수 없다 
         *      => 나누는 값을 체크 => 0인 경우 조건을 제시  
         */
        if(op=='/')
        {
        	if(num2==0)
        		System.out.println("0으로 나눌 수 없습니다");
        	if(num2!=0)
        		System.out.printf("%d %c %d = %.2f\n",
            			num1,op,num2,num1/(double)num2);
        }
        
        
	}

}
