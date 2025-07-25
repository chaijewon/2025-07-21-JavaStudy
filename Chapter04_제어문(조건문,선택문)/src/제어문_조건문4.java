/*
 *   1. 12,1,2 => 겨울 if(a==12||a==1||a==2)
 *      3,4,5  => 봄  if(a>=3 && a<=5)
 *      6,7,8  => 여름 
 *      9,10,11 => 가을 
 *   1) 사용자 입력을 받는다 (월입력) 
 *   2) 결과값은 봄,여름,가을,겨울 계절을 출력 
 *   
 */
import java.util.*;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("월 입력:");
        int month=scan.nextInt();
        
        System.out.println("===== 계절 출력 =====");
        if(month==12 || month==1 || month==2)
        	System.out.println(month+"월은 겨울입니다");
        if(month>=3 && month<=5)
        	System.out.println(month+"월은 봄입니다");
        if(month>=6 && month<=8)
        	System.out.println(month+"월은 여름입니다");
        if(month>=9 && month<=11)
        	System.out.println(month+"월은 가을입니다");
	}

}




