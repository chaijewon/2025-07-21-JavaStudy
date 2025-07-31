// 종료 시점 
import java.util.Scanner;
public class 제어문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        /*for(;;)
        {
        	System.out.print("q를 입력하면 종료합니다:");
        	String input=scan.next();
        	// 문자열 => equals로 비교 (==)
        	if(input.equals("q"))
        	{
        		System.out.println("for 종료!!");
        		break;
        	}
        }*/
        /*
        while(true)
        {
        	System.out.print("q를 입력하면 종료합니다:");
        	String input=scan.next();
        	// 문자열 => equals로 비교 (==)
        	if(input.equals("q"))
        	{
        		System.out.println("while 종료!!");
        		break;
        	}
        }*/
        String input="";
        do
        {
        	System.out.print("q를 입력하면 종료:");
        	input=scan.next();
        	//System.out.println("do~while=>종료");
        	if(input.equals("q"))
        	{
        		System.out.println("do~while 종료!!");
        		break;
        	}
        }while(true);
        //System.out.println("do~while=>종료");
	}

}
