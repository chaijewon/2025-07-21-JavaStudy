import java.util.Scanner;
public class 메소드_1_변환 {
    // 입력 
	static int input(String msg)
	{
		 Scanner scan=new Scanner(System.in);
	     /////////////// 입력 
	     System.out.print(msg);
	     int num=scan.nextInt();
	     return num;
	}
	// input("국어 입력:")
	// 총점 
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	// 평균 
	static double avg(int t)
	{
		return t/3.0;
	}
	// 학점
	static char score(double avg)
	{
		char score='A';
        switch((int)(avg/10))// 정수 , 문자 , 문자열 
        {
          case 10,9 ->{
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
          }
        }
        return score;
	}
	static void process()
	{
		int kor=input("국어 입력:");
		int eng=input("영어 입력:");
		int math=input("수학 입력:");
		int total=total(kor, eng, math);
		double avg=avg(total);
		char score=score(avg);
		System.out.println("======= 결과값 =======");
		System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+score);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         process();
	}

}
