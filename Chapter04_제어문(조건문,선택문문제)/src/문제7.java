/*
 *   정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
     작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
     나머지는 F)

 */
import java.util.Scanner;
public class 문제7 {
   public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.print("국어 영어 수학입력(90 90 90):");
	  int kor=scan.nextInt();
	  int eng=scan.nextInt();
	  int math=scan.nextInt();
	  
	  int avg=(kor+eng+math)/3;
	  char score='A';
	  if(avg>=90)
		  score='A';
	  else if(avg>=80)
		  score='B';
	  else if(avg>=70)
		  score='C';
	  else if(avg>=60)
		  score='D';
	  else
		  score='F';
	  System.out.println("학점:"+score);
   }
}
