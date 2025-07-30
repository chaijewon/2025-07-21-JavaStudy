/*
 *   출력예) ********** (5행10열)            
 *         **********            
 *         **********            
 *         **********            
 *         **********
 */
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++) // 행
        {
        	for(int j=1;j<=10;j++) // 열
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
