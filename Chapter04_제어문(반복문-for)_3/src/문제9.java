// 0~12까지 2의 배수, 3의 배수의 갯수을 구하여라.
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a2=0;
        int a3=0;
        for(int i=0;i<=12;i++)
        {
        	if(i%2==0 && i!=0)
        		a2++;
        	if(i%3==0 && i!=0)
        		a3++;
        }
        System.out.println("2의 배수 합:"+a2);
        System.out.println("3의 배수 합:"+a3);
	}

}
