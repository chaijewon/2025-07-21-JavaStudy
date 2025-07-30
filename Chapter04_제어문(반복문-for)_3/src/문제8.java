// 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.


public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
        int sum=0;
        for(int i=3;i<=4462;i++)
        {
        	if(i%2==0)
        		sum+=i;
        }
        System.out.println("3이상 4462 이하에서 짝수인 정수의 합:"
                           +sum);
        
        System.out.println("===== while =====");
        sum=0;
        int i=3;
        while(i<=4462)
        {
        	if(i%2==0)
        		sum+=i;
        	i++;
        }
        System.out.println("3이상 4462 이하에서 짝수인 정수의 합:"
                +sum);
        System.out.println("===== do~while =====");
        sum=0;
        i=3;
        do
        {
        	if(i%2==0)
        		sum+=i;
        	i++;
        }while(i<=4462);
        System.out.println("3이상 4462 이하에서 짝수인 정수의 합:"
                +sum);
	}

}
