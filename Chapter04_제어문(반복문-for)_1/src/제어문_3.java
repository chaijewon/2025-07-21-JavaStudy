/*
 *   5개의 알파벳 입력 
 *   --------------
 *   A -> a
 *   b -> B
 */
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 대소문자의 차이 32 => 65 97 
        /*for(int i=1;i<=5;i++)
        {
        	System.out.print("알파벳 입력:");
        	String s=scan.next();
        	char c=s.charAt(0);
        	System.out.println("입력값:"+c);
        	if(c>='A' && c<='Z')
        	{
        		System.out.println("변경값:"+(char)(c+32));
        	}
        	else
        	{
        		System.out.println("변경값:"+(char)(c-32));
        	}
        }*/
        // 알파벳 여러개를 받아서 sdsafsafasfas
        // 모든 문자를 대문자로 변경 
        // toUpperCase() => toLowerCase()
        System.out.print("알파벳문자를 입력:");
        String s=scan.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	if(c=='A' || c=='a')
        	{
        		count++;
        	}
        	/*if(c>='a' && c<='z')
        	{
        		System.out.print((char)(c-32));
        	}
        	else
        	{
        		System.out.print(c);
        	}*/
        }
        System.out.println("count="+count);
        // 문자열을 입력을 받아서 'A' | 'a' 의 갯수 확인 
	}

}
