/*
 *   B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
 *   |           | => 2
 */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(char c='B';c<='N';c+=2)
        {
        	if(c>'B' && c<='N')
        	 System.out.print(",");
        	System.out.print(c);
        }
	}

}
