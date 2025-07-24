/*
 *               false
 *    형식) |-------------
 *         |-------     |
 *           true  |     |
 *        (조건) ? 값1 : 값2 
 *                -------- 프로그램에 따라서 지정 
 *          |
 *        1) 부정연산자 
 *        2) 비교연산자 
 *        3) 논리연산자 
 *        ----------- true/false 
 *        조건 : true/false
 *                |    |
 *               실행  건너뛴다
 */
import java.util.Scanner;
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력값을 받아서 짝수/홀수 
		Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        System.out.println(
           num!=0 && num%3==0?num+"는(은) 3의 배수입니다":num+"는(은) 3의 배수가 아닙니다"
        );
	}

}



