// => 컴퓨터와 가위 바위 보
/*
 *    경우수 
 *    컴퓨터 (가위 0) 
 *      = 사용자 (가위 0)
 *      = 사용자 (바위 1)
 *      = 사용자 (보 2)
 *    컴퓨터 (바위 1)
 *      = 사용자 (가위 0)
 *      = 사용자 (바위 1)
 *      = 사용자 (보 2)
 *    컴퓨터 (보 2)
 *      = 사용자 (가위 0)
 *      = 사용자 (바위 1)
 *      = 사용자 (보 2)
 */
import java.util.Scanner;
public class 제어문_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("가위(0),바위(1),보(2):");
        int user=scan.nextInt();
        if(user>2)
        	user=0;
        // 컴퓨터 
        int com=(int)(Math.random()*3);
        
        // 사용자 / 컴퓨터 
        if(com==0)
        	System.out.println("컴퓨터:가위");
        if(com==1)
        	System.out.println("컴퓨터:바위");
        if(com==2)
        	System.out.println("컴퓨터:보");
        
        if(user==0)
        	System.out.println("사용자:가위");
        if(user==1)
        	System.out.println("사용자:바위");
        if(user==2)
        	System.out.println("사용자:보");
        
        // 결과값 -1,2 : 1,-2
        System.out.println("====== 결과 ======");
        int result=com-user;
        if(result==-1 || result==2)
        	System.out.println("User Win!!");
        if(result==1 || result==-2)
        	System.out.println("Compute Win!!");
        if(result==0)
        	System.out.println("비겼다!!");
//        if(com==0) // 가위  com-user
//        {
//        	if(user==0) // 0
//        		System.out.println("비겼다");
//        	if(user==1) // -1
//        		System.out.println("User Win!!");
//        	if(user==2) // -2
//        		System.out.println("Compute Win!!");
//        }
//        if(com==1) // 바위
//        {
//        	if(user==0)  // 1
//        		System.out.println("Compute Win!!");
//        	if(user==1) // 0
//        		System.out.println("비겼다");
//        	if(user==2) // -1
//        		System.out.println("User Win!!");
//        }
//        if(com==2) // 보
//        {
//        	if(user==0) // 2
//        		System.out.println("User Win!!");
//        	if(user==1) // 1
//        		System.out.println("Compute Win!!");
//        	if(user==2) // 0
//        		System.out.println("비겼다");
//        }
	}

}
