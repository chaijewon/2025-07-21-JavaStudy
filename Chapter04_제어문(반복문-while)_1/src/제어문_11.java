/*
 *   break,continue => 반복제어문
 *           | for / while / do~while 
 *              |      |        |
 *            증가식    -----------
 *                          |
 *                         조건식  
 *    | 반복문 / 선택문 
 *    
 *    for(int i=1;i<=10;i++)
 *    {
 *       if(i==5)
 *         continue;=> i++ 증가식으로 이동 
 *    }
 *    
 *    i=1~4 i==5
 *    
 *    int i=1
 *    while(i<=10)
 *    {
 *       if(i==5)
 *         continue; => i<=10 조건식 => 무한루프
 *       i++;
 *    }
 *    
 *    => break => 전체 반복문 
 *    => continue 주로 for에서 사용 
 */
public class 제어문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
