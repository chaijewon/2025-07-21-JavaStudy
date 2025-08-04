// => 6개의 난수 => 1~45 => 중복없는 데이터 
/*
 *   => 데이터별 묶음 : 배열  
 *   => 단위별 묶음 : 클래스 => 구조체 
 *   => 명령문 묶음 : 메소드 
 *   --------------------------------- 클래스 
 *   
 *   
 *   
 *   1. 자바 메모리 구조 (JVM)
 *   
 *      -----------------------
 *       Method Area => static
 *        main/사용자 정의 메소드 => 기능  
 *      -----------------------
 *       Heap : 배열 데이터 / 클래스 데이터 
 *              => 프로그래머 관리 영역
 *              => new / delete
 *                 ------------ delete(X) => 자동 메모리 해제
 *                                           | 가비지컬렉션 
 *                                 System.gc()
 *      -----------------------
 *       Stack : 지역변수 / 매개변수 / 참조 주소 
 *               => 메모리 관리 => 자동으로 삭제 
 *               {}종료가 되면 자동 삭제 
 *      -----------------------
 *      
 *         스택  |  힙
 *        주소값 ==> 실제 데이터
 *              |
 *              
 *        int[] arr = new int[5]
 *                        |
 *                       arr[0] arr[1]  arr[2] ....
 *        ---arr---      ----------------------
 *      [I@5305068a       0      0      0   0   0
 *        --------      |----------------------
 *                   [I@5305068a
 *                   => 데이터형이 동일 
 *                      ------------
 *                      int[] arr={10,'A','b',20}
 *                      double[] arr={10,20,30,40,50}
 *                      
 *                      int a='A' 
 *                      
 *                      String => 형변환이 안된다 
 *                      ------ "10"
 */

import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] lotto=new int[6];
        System.out.println(lotto);
        for(int i=0;i<lotto.length;i++)
        {
        	lotto[i]=(int)(Math.random()*45)+1; 
        	for(int j=0;j<i;j++)// 비교 => 이미 저장된 데이터 vs 
        	{
        		if(lotto[i]==lotto[j])
        		{
        			i--;
        			
        			break;
        		}
        		
        	}
        }
        Arrays.sort(lotto);
        for(int i=lotto.length-1;i>=0;i--)
        {
        	System.out.print(lotto[i]+" ");
        }
	}

}
