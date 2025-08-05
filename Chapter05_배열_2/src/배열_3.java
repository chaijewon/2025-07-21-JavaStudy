import java.util.Arrays;
import java.util.Scanner;
/*
 *   숫자 야구게임
 *   
 *   난수 => 3 6 9
 *   -------------
 *     456 => 1B ======> 힌트 
 *     379 => 2S
 *            --- 3S
 *            
 *   => 저장 => 배열 
 *     
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 컴퓨터 난수 => 중복없는 난수 => 1~9 
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1 ~ 9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j]) // 중복된 값 확인 
				{
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		//----------------------------------
		
		// 2. 사용자 입력 
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3]; 
		while(true) // 횟수가 지정이 안된 경우  => 반드시 종료 조건
		{
			System.out.print("⏰ 세자리 정수를 입력:");
			int input=scan.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("💀 세자리 정수 입력해야 됩니다");
				continue; // 처음부터 다시 시작 
				// => while => 조건식 , for => 증가식 
			}
			
			// 정상적으로 3자리 정수 입력 완료 
			/*
			 *   369  ==> 333 1S-2B
			 *   369/100 ==> 3
			 *   369%100 => 69/10 => 6
			 *   369%10 => 9
			 */
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			// 중복된 수 사용 금지
			if(user[0]==user[1] || 
			   user[1]==user[2] ||
			   user[0]==user[2])
			{
				System.out.println("✅ 중복된 수는 사용할 수 없습니다");
				continue;
			}
			// 0을 입력할 수 없다 
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("✅ 0은 사용할 수 없습니다");
				continue;
			}
			
			// => 정상적 입력 
			// 힌트 제공 
			int s=0,b=0;
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					if(com[i]==user[j])// 같은 수가 있는지 
					{
						if(i==j) // 같은 자리에 있는 경우
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("👻 Input Number:%d,Result:%dS-%dB\n",
					  input,s,b);
			// 종료
			if(s==3)
			{
				System.out.println("🎉축하합니다🎉");
				break; // while문 종료
			}
		}
		// 3. 힌트 
		// 4. 종료여부 => break
		//----------------------- 반복문 
		
	}

}
