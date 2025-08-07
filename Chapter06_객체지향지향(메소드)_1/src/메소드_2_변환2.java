import java.util.Scanner;
public class 메소드_2_변환2 {
    static int year,month,week; // MethodArea
    // 전역변수는 자동 초기화 => 0
    static int[] lastday={
			     31,28,31,30,31,30,
			     31,31,30,31,30,31
		        };
     // 1. 반복 구간 
 	static int input(String msg)
 	{
        Scanner scan=new Scanner(System.in);
 		System.out.print(msg);
 		int num=scan.nextInt();
 		return num;
 	}
 // 요일 구하기 => 재사용할 수 있는 기능
 	static void getWeek()
 	{
 		       // 1. 전년도까지 총날수 
 				int total=(year-1)*365
 						 +(year-1)/4
 						 -(year-1)/100
 						 +(year-1)/400;
 				
 				// => 웹 (사용빈도가 높다)
 				if((year%4==0 && year%100!=0)||(year%400==0))
 					lastday[1]=29;
 				else
 					lastday[1]=28;
 				
 				for(int i=0;i<month-1;i++)
 				{
 					total+=lastday[i];
 				}
 				
 				// +1 => 각달의 1일자 확인 
 				total++;
 				
 				// 요일 구하기 
 				week=total%7;
 		
 	}
 // 달력 출력 
 	static void print()
 	{
 		       
 		        String[] strWeek= {
 				  "일","월","화","수","목","금","토"	
 				};
 				System.out.printf("%d년도 %d월\n\n",year,month);
 				for(String s:strWeek)
 				{
 					System.out.print(s+"\t");
 				}
 				
 				System.out.println();// 줄바꿈 
 				for(int i=1;i<=lastday[month-1];i++)
 				{
 					if(i==1)
 					{
 						for(int j=0;j<week;j++)
 						{
 							System.out.print("\t");
 						}
 					}
 					System.out.printf("%2d\t",i);
 					week++;
 					if(week>6)
 					{
 						week=0;
 						System.out.println();
 					}
 				}
 	}
 	static void process()
	{
		year=input("년도 입력:");
		month=input("월 입력:");
		
		getWeek();
		print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int year=2025; // Stack 
        //System.out.println(year);
        // 지역변수 우선 순위 => 없는 경우는 전역변수를 찾는다 
        // 구분 => 클래스명.변수명 
	}

}
