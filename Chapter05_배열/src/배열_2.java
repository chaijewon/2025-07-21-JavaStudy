/*
 *    1. 데이터가 많은 경우 => 효율적 사용 => 배열 
 *       -------------- 같은 종류의 데이터 3개이상 
 *    2. 인덱스를 이용한 빠른 접근 
 *       연속적인 메모리 구조 => 캐시 효율이 좋음 
 *       고정적이다 (저장 갯수가 지정 => 추가/삭제가 어렵다) 
 *         => 추가 / 삭제 => 배열의 크기를 변경 
 *                         새로운 배열을 만든다 
 *    3. 용어 
 *       인덱스 : 배열에 저장된 데이터의 위치 => 0
 *              ----------- 배열에 저장된 갯수 : 배열명.length
 *       요소 : 실제 배열에 저장된 한개의 값 
 *       길이 : 배열의 갯수 
 *    4. 배열 선언 
 *       데이터형[] 배열명;
 *       데이터형 배열명[]; 
 *       
 *           스택 (힙에 생성된 주소)     힙(실제 데이터 저장)
 *       ----배열명------        
 *          저장 주소     ==============  --------------
 *       --------------     |              1 2 3 4 5
 *                       주소를 이용한 접근 ------------ - *                       --------------
 *                         참조 => 참조 변수 : 147page 
 *                         
 *       기본형         참조형
 *       byte         ------ 사용자 정의 : 배열 / 클래스 146page
 *       int      
 *       long
 *       double
 *       boolean
 *       char
 *       
 *       int[] arr=new int[5]
 *       --------- ----------
 *          |          |
 *         스택        힙 
 *                  new => 동적 메모리 할당 (malloc())
 *                  100
 *      ----arr---  |---------------------------------
 *         100          0       0     0      0    0
 *      ----------   ----------------------------------
 *                      |       |     |      |     |
 *                    arr[0] arr[1] arr[2] arr[3] arr[4]  
 *                   100번지의 첫번째 값 => arr[0]
 *                   
 */
// 3명의 학생의 국어 영어 수학 => 총점 , 평균 , 학점 
// => 일반 변수 
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor1=0,kor2=0,kor3=0;
        int eng1=0,eng2=0,eng3=0;
        int math1=0,math2=0,math3=0;
        int total1=0,total2=0,total3=0;
        double avg1=0.0,avg2=0.0,avg3=0.0;
        char score1='A',score2='A',score3='A';
        
        Scanner scan=new Scanner(System.in);
        System.out.print("1' 국어점수:");
        kor1=scan.nextInt();
        
        System.out.print("1' 영어점수:");
        eng1=scan.nextInt();
        
        System.out.print("1' 수학점수:");
        math1=scan.nextInt();
        
        total1=kor1+eng1+math1;
        avg1=total1/3.0;
        
        switch((int)(avg1/10))
        {
         case 10,9 ->{
        	score1='A';
         }
         case 8 ->{
         	score1='B';
          }
         case 7 ->{
         	score1='C';
          }
         case 6 ->{
         	score1='D';
          }
         default ->{
        	 score1='F';
         }
        }
        
        System.out.print("2' 국어점수:");
        kor2=scan.nextInt();
        
        System.out.print("2' 영어점수:");
        eng2=scan.nextInt();
        
        System.out.print("2' 수학점수:");
        math2=scan.nextInt();
        
        total2=kor2+eng2+math2;
        avg2=total2/3.0;
        
        switch((int)(avg2/10))
        {
         case 10,9 ->{
        	score2='A';
         }
         case 8 ->{
         	score2='B';
          }
         case 7 ->{
         	score2='C';
          }
         case 6 ->{
         	score2='D';
          }
         default ->{
        	 score2='F';
         }
        }
        
        System.out.print("3' 국어점수:");
        kor3=scan.nextInt();
        
        System.out.print("3' 영어점수:");
        eng3=scan.nextInt();
        
        System.out.print("3' 수학점수:");
        math3=scan.nextInt();
        
        total3=kor3+eng3+math3;
        avg3=total3/3.0;
        
        switch((int)(avg3/10))
        {
         case 10,9 ->{
        	score3='A';
         }
         case 8 ->{
         	score3='B';
          }
         case 7 ->{
         	score3='C';
          }
         case 6 ->{
         	score3='D';
          }
         default ->{
        	 score3='F';
         }
        }
        
        System.out.println("===== 결과 =====");
        System.out.printf("%-5d%-5d%-5d%-7d%7.2f%3c\n",
        		kor1,eng1,math1,total1,avg1,score1); 
        System.out.printf("%-5d%-5d%-5d%-7d%7.2f%3c\n",
        		kor2,eng2,math2,total2,avg2,score2);
        System.out.printf("%-5d%-5d%-5d%-7d%7.2f%3c\n",
        		kor3,eng3,math3,total3,avg3,score3);
        
        
	}

}
