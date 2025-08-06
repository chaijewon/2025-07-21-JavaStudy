import java.util.Scanner;
public class 메소드_2_변환 {
    // 입력 
	static int input()
	{
		Scanner scan=new Scanner(System.in);
        System.out.print("정수입력(0~32767):");
        int num=scan.nextInt();
        return num;
	}
	// 처리 
	// 데이터가 많은 경우 => 배열 / 클래스 
	static int[] binary(int num) // binary(int)
	                             // binary(int,int[])
	{
		 // 저장 준비 
        int[] bin=new int[16];
        // 배열 => 뒤
        int index=bin.length-1;
        
        while(true) // 반복횟수가 지정이 안됨 
        {
        	bin[index]=num%2;
        	num/=2; // num=num/2
        	
        	if(num==0)
        		break;
        	index--;
        }
        
        return bin;
	}
	static void binary(int num,int[] bin)
	{
		 // 저장 준비 
        
        // 배열 => 뒤
        int index=bin.length-1;
        
        while(true) // 반복횟수가 지정이 안됨 
        {
        	bin[index]=num%2;
        	num/=2; // num=num/2
        	
        	if(num==0)
        		break;
        	index--;
        }
        
        //return bin;
	}
	static void print(int[] bin)
	{
		System.out.println("===== 결과값 =====");
        for(int i=0;i<bin.length;i++)
        {
        	if(i%4==0 && i!=0)
        		System.out.print(" ");
        	System.out.print(bin[i]);
        }
	}
	static void process()
	{
     	int num=input();
     	int[] bin=new int[16];
     	binary(num, bin);
     	print(bin);
//	    int[] bin=binary(num);
//	    print(bin);
	}
	// 출력 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
