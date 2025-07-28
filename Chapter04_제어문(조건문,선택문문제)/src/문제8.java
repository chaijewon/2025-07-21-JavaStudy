import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		  System.out.print("국어 영어 수학입력(90 90 90):");
		  int kor=scan.nextInt();
		  int eng=scan.nextInt();
		  int math=scan.nextInt();
		  
		  int avg=(kor+eng+math)/3;
		  char score='A';
		  // 실무 => jdk1.8
		  switch(avg/10)
		  {
		   // -> break를 사용하면 오류 발생 
		   // -> jdk 12
		   
		   /*case 10,9 ->{
			  score='A';
		   }
		   case 8 ->{
			  score='B';
		   }
		   case 7 ->{
			  score='C';
		   }
		   case 6 ->{
			  score='D';
		   }
		   default ->{
			  score='F';
		   }*/
		  case 10:
		  case 9:
			  score='A';
			  break;
		  case 8:
			  score='B';
			  break;
		  case 7:
			  score='C';
			  break;
		  case 6:
			  score='D';
			  break;
		  default:
			  score='F';
		  }
		  System.out.println("학점:"+score);
	}

}
