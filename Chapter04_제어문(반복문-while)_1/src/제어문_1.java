/*
 *   1. while => 형식 
 *      => 사용처 
 *      => 파일 읽기 (출력) => 한글자씩 읽는다 
 *      => 데이터베이스 => 갯수는 확인 => 갯수를 확인할 수 없는 곳에서 주로 사용 
 *      => for : Front-End (화면 출력) , 
 *         while : Back-End (요청에 따른 갯수가 확인 없는 경우)
 *         Front-End 
 *         ---------- javascript (변수,연산자,제어문,배열,예외처리
 *                          객체지향프로그램) 
 *   2. for => 지정 (반복) , while => true일 동안
 *      for(초기값;조건식;증가식)
 *      {
 *      }
 *      while(true)
 *      {
 *         => 종료 시점 설정 => break
 *      }    
 *      
 *   3. 형식 => 반복 횟수를 지정 => for과 동일하게 사용이 가능 
 *      초기값 ---------- 1
 *      while(조건식) --- 2 ==> false 종료
 *      {      | true
 *         반복실행문장 --- 3
 *         증감식 ------- 4 ==> 증가된 값을 2번에 다시 조건검색
 *      }
 *      
 *   4. 실행이 안될 수 있다 => 선 조건 검색 
 *   ----------------------------------
 *      => for 에서 사용한 예제 
 *      => while => 고유 기능 
 *         => 웹 , 파일 
 *   => Java => 100
 *      0.0000000001
 *      
 *      
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10까지 출력 
		int i=1; // 시작점 => for(int i=1;i<=10;i++)
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		while(true)
		{
			System.out.print(i+" ");
			if(i>=10) break; // 위치 , 변수의 위치 
			i++;
		}
	}
    
}







