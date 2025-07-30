/*
 *   사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
     끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int gop=1;
        int start=0;
        int end=0;
        
        for(;;)
        {
        	System.out.print("첫번째 정수 입력:");
        	start=scan.nextInt();
        	System.out.print("두번째 정수 입력:");
        	end=scan.nextInt();
        	if(start<=end)
        	{
        		break;
        	}
        }
        for(int i=start;i<=end;i++)
        {
        	gop*=i;
        }
        System.out.println("===== 결과 =====");
        System.out.println(start+"에서 "+end+"까지의 곱:"+gop);
	}

}
