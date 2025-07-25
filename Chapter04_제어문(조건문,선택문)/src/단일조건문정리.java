/*
 *   자바에서 지원하는 프로그램 형식 
 *   평문 : 위에서 아래로 한문장씩 수행 
 *   -----
 *   조건문 : 상황에 따라서 동작 형식 변경 
 *          -----------
 *           상황 여러개 => if를 여러개 사용 
 *   반복문 : 중복 제거 
 *   
 *   형식) 
 *        package package명 => 한번만 사용  
 *        import ... => 여러개 사용이 가능 
 *        class ClassName{
 *           public static void main(String[] arg)
 *           {
 *              // 1. 변수 선언 
 *              // 2. 변수에 초기화 
 *              // 3. 사용자 요청 따른 처리 => 제어문 
 *              // 4. 결과 출력 
 *           }
 *        }
 *        
 *    조건문 
 *      단일조건문 
 *      형식) if(조건문)
 *           {  ------ true/false가 나오는 연산자 이용 
 *                       => 부정연산자 / 비교연산자 / 논리연산자
 *              조건이 true일때 수행하는 문장 
 *           }
 *           false일 경우에 if문하지 않고 건너뛴다 
 *           
 *           => 중복이 있는 경우 
 *              1~100 
 *                => 3배수 , 5배수 , 7배수 출력 
 *                15  3      5
 *                21  3              7
 *           => if문 독립 문장 
 *              모든 if를 수행 => 속도가 늦다 
 *              
 *              
 *           => 여러개 문장을 동시에 수행 
 *           if(조건문)
 *           {
 *              제어하는 문장 여러개 추가 
 *           }
 *        
 */
public class 단일조건문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=20;
        
        if(a%3==0) // 수행
        {
        	System.out.println("3의 배수");
            System.out.println("test");
        }
        if(a%5==0) // 수행 
        	System.out.println("5의 배수");
	}

}
