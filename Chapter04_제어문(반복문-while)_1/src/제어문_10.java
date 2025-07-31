import java.util.Scanner;
public class 제어문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int com=(int)(Math.random()*100)+1;
        
        do
        {
        	System.out.print("1~100사이의 정수 입력:");
        	int user=scan.nextInt();
        	if(user<1 || user>100)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue;
        	}
        	
        	// 정상적 입력 => if(user>=1 && user<=100)
        	// 범위 밖 => if(user<1 || user>100)
        	// 결과 
        	if(com>user)
        	{
        		System.out.println("🆙");
        	}
        	else if(com<user)
        	{
        		System.out.println("🔽");
        	}
        	else
        	{
        		System.out.println("🎉 축하합니다");
        		break; // 종료시에 사용 
        		
        	}
        	
        }while(true);
	}
    // continue => 제외 / 처음으로 => 반복안에서 사용  
	// break => 반복/선택문 종료
	// 밑에는 코딩이 불가능 
}
