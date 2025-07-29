/*
 *  1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
 *  
 *  for => 시작점 , 끝점 , 증가식 
 *         ------------------
 *         [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *         
 *         맛있고 맜있는 맜있니...
 *         맜있+
 *         ------------------- REGEXP_LIKE(ename,"[A-Z]")
 *         ename LIKE %A% OR
 *         ename LIKE %B% OR
 *         ...
 *         ename LIKE %Z%
 *         --------------------  LLM
 *  
 *    => 밑에 있는 문장 1개만 수행 
 *       for()
 *        문장 ==> for
 *        문장 
 *     
 *       for()
 *       {
 *          
 *       }
 *       
 *       for(int i=1...)
 *              -- for문안에서만 사용이 가능 
 *         
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] arr={"aaa","bbb","ccc","ddd",
    		   "eee","fff","iii","jjj","ggg","kkk"};
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       System.out.println(arr[2]);
       
       System.out.println(arr[3]);
       System.out.println(arr[4]);
       System.out.println(arr[5]);
       
       System.out.println(arr[6]);
       System.out.println(arr[7]);
       System.out.println(arr[8]);
       
       for(int i=0;i<9;i++)
       {
    	   System.out.println(arr[i]);
       }
	}

}
