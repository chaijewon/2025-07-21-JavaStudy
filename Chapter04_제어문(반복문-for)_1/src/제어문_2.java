/*
 *    1~100 사이의 정수 => 10개 추출 
 *    => 최대값 / 최소값 
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1;
		int min=100;
        for(int i=0;i<10;i++)
        {
        	int num=(int)(Math.random()*100)+1;
        	System.out.print(num+" ");
        	
        	if(max<num)
        		max=num;
        	
        	if(min>num)
        		min=num;
        }
        System.out.println();
        System.out.println("========= 결과 =========");
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
	}

}
