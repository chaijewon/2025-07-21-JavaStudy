import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.print("세자리 정수 입력:");
        	int num=scan.nextInt();
        	if(num<100 || num>999)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue;// 다시 처음으로 이동 => true
        	}
        	
        	int a=num/100;
        	int b=(num%100)/10;
        	int c=num%10;
        	
        	if(a==b || b==c || a==c)
        	{
        		System.out.println("중복된 수는 사용할 수 없습니다");
        		continue;
        	}
        	
        	if(a==0 || b==0 || c==0)
        	{
        		System.out.println("0은 사용할 수 없습니다");
        		continue;
        	}
        	
        	switch(a)
        	{
        	case 1:
        		System.out.println(1);
        		break;
        	case 2:
        		System.out.println(2);
        		break;
        	case 3:
        		if(a==3)
        		{
        			System.out.println("프로그램 종료!!");
        			//break;==> switch
        			System.exit(0);
        			//return;
        		}
        	}
        	// break => while => 제어문 한개만 제어가 가능 
        }
	}

}
