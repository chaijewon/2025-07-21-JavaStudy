// 성적 처리 
import java.util.Scanner;
/*
 *   변수 ===> 응용 연산자 ===> 응용 제어문 **
 *            -----------------------
 *                      |
 *                     응용 : 배열 / 메소드 
 *                     -----------------
 *                      |
 *                     응용 : 클래스 
 *                     
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 관련된 데이터를 묶어서 관리 => 데이터형이 동일
		// 데이터를 어떻게 쉽게 제어 
		// => 수정이 편리 
		final int ROWS=3; // 수정형 
		int[] kor=new int[ROWS]; //int kor1,kor2,kor3
		int[] eng=new int[ROWS];
		int[] math=new int[ROWS];
		int[] total=new int[ROWS];
		double[] avg=new double[ROWS];
		char[] score=new char[ROWS];
		
		Scanner scan=new Scanner(System.in);
		// 점수 받기 
		for(int i=0;i<ROWS;i++)
		{
			System.out.print((i+1)+"' 국어 입력:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"' 영어 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"' 수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			switch((int)(avg[i]/10))
			{
			 case 10,9 ->{
				 score[i]='A';
			 }
             case 8 ->{
            	 score[i]='B';
			 }
             case 7 ->{
            	 score[i]='C';
			 }
             case 6 ->{
            	 score[i]='D';
			 }
             default->{
            	 score[i]='F';
             }
			}
		}
		
		System.out.println("======== 결과값 =======");
		for(int i=0;i<ROWS;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%7.2f%3c\n",
	        		kor[i],eng[i],
	        		math[i],total[i],
	        		avg[i],score[i]); 
		}
	}

}
