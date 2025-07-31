/*
 *   do~while : 자바에서는 사용 빈도가 없다 
 *   ---------
 *     | while의 단점 보완 
 *       ----- 실행(X) 
 *       ----- 반드시 한번 이상 수행 
 *   while : 먼저 조건 처리 
 *   do~while : 나중에 조건 처리 
 *   
 *   형식)
 *        초기값 -------- 1
 *        //int a=10;
 *        while(조건식)-- 2
 *        {
 *          반복 실행문장 - 3
 *          증감식   ---- 4
 *        }
 *        
 *        초기값  --------- 1
 *        do
 *        {
 *            반복 실행문장 -- 2
 *            증감식 -------- 3
 *        }while(조건식); ---4 
 */
public class 제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("===== for =====");
        for(int i=1;i<=10;i++)
        {
        	System.out.print(i+" ");
        }
        System.out.println("\n===== while =====");
        int i=1;
        while(i<=10)
        {
        	System.out.print(i+" ");
        	i++;
        }
        System.out.println("\n===== do~while =====");
        i=1;
        do
        {
        	System.out.print(i+" ");
        	i++;
        }while(i<=10);
	}

}
