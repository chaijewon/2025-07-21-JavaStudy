/*
 *    ★★★★★
 *    ★★★★★
 *    ★★★★★
 *    ★★★★★
 *    ★★★★★
 *    
 *    #123
 *    1#23
 *    12#3
 *    123#
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print("★");
        	}
        	System.out.println();
        }*/
		/*for(int i=1;i<=4;i++)// 줄수 => rows
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print('#');
				else 
				    System.out.print(j);
			}
			System.out.println();
		}*/
		/*
		 *   ABCD
		 *   EFGH
		 *   IJKL
		 *   MNOP
		 */
		// 지역변수는 {} => 사라진다 => 생성 
		for(int i=1;i<=4;i++)// 줄수 => rows
		{
			// 메모리가 4번 변경
			for(int j=1;j<=4;j++)
			{
				char c='A';
				System.out.print(c++);
			}
			System.out.println();
			//c=사라진다
		}
		/*
		 *   ABCD
		 *   ABCD
		 *   ABCD
		 *   ABCD
		 */
		
	}

}
