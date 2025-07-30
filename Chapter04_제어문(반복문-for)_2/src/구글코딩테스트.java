// 문자열을 입력을 받아서 => 좌우 대칭여부 확인 
// ABBA
// 모든 문자열은 짝수 
import java.util.Scanner;
public class 구글코딩테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        String msg="";
        // 오류 처리 
        for(;;)
        {
        	System.out.print("문자열 입력(짝수):");
        	msg=scan.next();
        	if(msg.length()%2==0)
        	{
        		break;
        	}
        }
        
        boolean bCheck=true;
        /*
         *   AB BA
         *   -  -
         *    --
         */
        for(int i=0;i<msg.length()/2;i++)
        {
        	//   0  3
        	//   1  2
        	if(msg.charAt(i)!=msg.charAt(msg.length()-i-1))
        	{
        		bCheck=false;
        		break;
        	}
        	
        	
        }
        if(bCheck==true)
        {
        	System.out.println(msg+"는(은) 좌우 대칭입니다");
        }
        else
        {
        	System.out.println(msg+"는(은) 좌우 대칭이 아닙니다");
        }
	}

}
