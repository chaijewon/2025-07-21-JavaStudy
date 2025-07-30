import java.util.Scanner;
public class 순간반응게임 {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("숫자가 5개 나오면 5를 입력한 다음 => 엔터");
        
        Thread.sleep(2000);// 준비 시간 
        int speed=10000;
        for(int i=1;i<=10;i++)
        {
        	int num=(int)(Math.random()*5)+1;
        	System.out.println("숫자:"+num);
        	if(num==5)
        	{
        		long start=System.currentTimeMillis();
        		int user=scan.nextInt();
        		long end=System.currentTimeMillis();
        		if(user==5)
        		{
        			System.out.println("반응 시간:"+(end-start)+"ms");
        			int a=(int)(end-start);
        			if(speed>a)
        				speed=a;
        		}
        		else
        		{
        			System.out.println("틀렸습니다");
        		}
        	}
        	Thread.sleep(1000);
        }
        System.out.println("최고 반응 속도:"+speed+"ms입니다");
	}

}
