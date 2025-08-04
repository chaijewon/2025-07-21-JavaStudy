/*
 *   1. 데이터 저장 
 *      = 변수 : 한개만 저장이 가능 
 *      = 배열 : 같은 종류의 데이터를 여러개 저장이 가능 
 *      ***= 클래스 : 관련된 다른 데이터형을 모아서 저장 
 *        ------ 영화 정보 / 맛집 정보 ... (상세보기)
 *         => ~VO => FoodVO , ~DAO => 오라클 
 *   => 변수 
 *      int a=10;
 *      
 *      ---a---
 *         10
 *      -------
 *      
 *   => 배열 
 *      int[] arr=new int[5];
 *      --------- --- ------ 
 *          1      2     3
 *          
 *                     |     |
 *                   arr[0] arr[1] arr[2] arr[3] arr[4]
 *      ---arr---   -----------------------------------
 *         0x100 ==>   0     0        0      0     0
 *      ---------  |-----------------------------------
 *                0x100
 *                
 *                => 데이터값을 제어 => index / 같은 변수명 사용 
 *                                          arr
 *                   => 반복문 사용이 편리 
 *      1. 배열 선언 
 *         데이터형[] 배열명; => 자바형식 (권장)
 *         데이터형 배열명[]; => C형식 
 *         
 *         int[] arr;
 *         String[] arr;
 *         char[] arr;
 *         double[] arr;
 *         
 *      2. 배열 할당 => 메모리에 저장 
 *         데이터형[] 배열명=new 데이터형[저장갯수]
 *         데이터형 배열명[]=new 데이터형[저장갯수]
 *         
 *         int[] arr=new int[5];
 *                          ---
 *         ----- 배열 데이터형
 *         String[] arr=new String[5];
 *         char[] arr=new char[5]
 *      3. 배열값 초기화 
 *         = 기본값 지정 = 나중에 값을 변경 
 *           new 
 *           ----
 *            int 0 
 *            double 0.0
 *            char '\0'
 *            boolean false
 *            long 0L
 *            String null => 실제 저장된 데이터 주소 
 *            // 모든 클래스는 null값이 default 
 *         = 선언과 동시에 값을 설정 
 *            int[] arr={1,2,3,4,5}
 *            String[] arr={"aaa","bbb","ccc"}
 *         ---------------------------
 *         ***
 *         = File에서 읽기 => 초기화 
 *         = DataBase에서 읽어서 초기화 
 *         = 크롤링을 통해서 초기화 
 *         ---------------------------
 *         
 *         int[] arr
 *           스택                      힙
 *         ---arr--                 --------------
 *          실제 데이터 저장 주소          실제 데이터 저장 
 *         --------                 ---------------
 *                  주소를 참조헤서 데이터 제어 => 참조변수 
 *                  배열 / 클래스 
 *                  
 *        *** 배열은 인덱스를 이용해서 데이터 한개씩 제어 
 *                 ------------------------
 *                  0번 시작한다 
 *                  갯수 : length
 */
// 3명의 국어 등수 
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 10개의 정수를 저장 
		// 배열 => 같은 종류의 데이터가 3개 이상 
		Scanner scan=new Scanner(System.in);
		int[] kor=new int[3];
		int[] rank=new int[3];
		
		// 필요한 데이터를 저장한다 
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"' 국어 점수 입력:");
			kor[i]=scan.nextInt();
		}
		// 등수 
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;// 1등 
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
				{
					rank[i]++; // 등수증가 
				}
			}
		}
		System.out.println("===== 결과값 =====");
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d\n",kor[i],rank[i]);
		}
		
	}

}
