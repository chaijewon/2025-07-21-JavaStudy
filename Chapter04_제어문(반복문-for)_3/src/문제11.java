//10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count1=0;
        int count3=0;
        int count5=0; // sum=0 
        for(int i=1;i<=10;i++)
        {
        	int val=(int)(Math.random()*100)+1;
        	System.out.print(val+" ");
        	if(val%2==0)
        		count1++; // sum+=i
        	if(val%3==0)
        		count3++;
        	if(val%5==0)
        		count5++;
        	
        	// 단일 조건문 => 2개 동시 수행 
        }
        System.out.println();
        System.out.println("짝수의 갯수:"+count1);
        System.out.println("3의배수 갯수:"+count3);
        System.out.println("5의배수 갯수:"+count5);
	}

}
