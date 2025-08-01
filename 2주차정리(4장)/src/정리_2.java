import java.util.*;
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[16];
        //        --- 초기값 : 0
        int index=15;
        System.out.print("정수 입력:");
        int input=scan.nextInt();
        System.out.println(Integer.toBinaryString(input));
        while(true)
        {
        	arr[index]=input%2;
        	input=input/2;
        	if(input==0)
        		break;
        	index--;
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(i%4==0 && i!=0)
        		System.out.print(" ");
        	System.out.print(arr[i]);
        }
        
        int[] arr2= {10 ,40, 50, 20, 30};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
	}

}
