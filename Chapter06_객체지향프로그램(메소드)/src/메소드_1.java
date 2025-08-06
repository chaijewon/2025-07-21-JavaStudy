/*
 *    국어 영어 수학 점수를 입력을 받아서 
 *    총점 / 평균 / 학점 출력 
 */
import java.util.*;
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        /////////////// 입력 
        System.out.print("국어 입력:");
        int kor=scan.nextInt();
        
        System.out.print("영어 입력:");
        int eng=scan.nextInt();
        
        System.out.print("수학 입력:");
        int math=scan.nextInt();
        /////////////////// 3번 반복 => 제거 => 1.메소드
        /// 메소드는 무조건 호출시에는 처음부터 끝까지 수행 
        // 요청처리 
        int total=kor+eng+math;
        // 평균 
        double avg=total/3.0;
        
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
        System.out.println("====== 결과값 ======");
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+score);
	}

}
