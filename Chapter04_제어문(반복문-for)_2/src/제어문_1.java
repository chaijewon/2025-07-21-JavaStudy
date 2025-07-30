/*
 *    용어(프로그램)
 *    1. 변수 
 *       하나의 값을 메모리 저장해서 재사용
 *       ------- 변경해서 사용이 가능 
 *    2. 상수 
 *       하나의 값을 메모리 저장해서 사용 
 *       ------- 변경할 수 없다 
 *       final => 값을 고정 
 *       예) for ==> 10
 *    3. 초기값 
 *       변수를 선언한 경우에 처음 저장하는 값
 *       int a=10;
 *    4. 자료형 (데이터형) 
 *       컴퓨터에 자체 처리 => 메모리 크기 (기본형)
 *       => 정수 / 실수 / 문자 / 논리 
 *       => 자동처리가 안되는 경우 (사용자 정의 데이터형:참조형)
 *                            -----------------
 *                            class / interface / enum
 *    5. 연산자 : 연산을 사용하기 위한 기호 (+,-....)
 *    6. 피연산자 : 연산에 필요한 데이터 
 *    7. 제어문 : 실행시에 흐름을 개발자가 원하는 방향으로 바꿀 수 있게 만드는 것
 *               상황에 따라 변경 : 조건문 , 선택문 
 *               프로그램 실행중에 계속 반복 : 반복문 (for,while)
 *               => 프로그램 종료 : break , continue => 프로그램 제어
 *       => for : 반복 횟수가 지정 
 *                => 화면 출력 / 목록 
 *       => while : 무한 루프 => 반복 횟수가 없는 경우 
 *                  선조건 : 한번도 수행을 못할 수 있다 
 *                => 데이터베이스 / 네트워크 
 *                => 무조건 => 종료 조건을 설정 
 *       => do~while : 후조건 : 무조건 한번이상 수행 
 *       => break , continue => 바로 밑에 소스 코딩이 불가능
 *       
 *    for : 반복횟수 
 *          => 2차 for : 알고리즘 (정렬 / 등수구하기 / 구구단...)
 *          int a=10,b=20,c=30,d=40,e=50;
 *          ----------------
 *           10 20 30 40 50 
 *          ----------------
 *          => 중요 
 *             => 여러개를 => 한개의 변수명 
 *          int a1~a10000;
 *          int[] arr=new int[10000]
 *          => 클래스 ==> 50개
 *             한개의 이름으로 제어 => 인터페이스 
 *             
 *          명령문 묶어서 => 메소드 
 *          -------------------
 *          
 *     => 반복문 (for)
 *        for(초기값(시작);조건(끝);증감)
 *        {
 *            실행문장 
 *        }
 *        
 *        => 알파벳 => 연산처리 => 자동으로 정수 변수 
 *           char c='A'  c<='Z'
 *           => 실수는 사용하지 않는다 
 *        => 종료하지 않는 프로그램 : 무한루프 
 *        => for(;;)
 *        
 *        웹 : 출력 = for 
 *            ---------- 
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 1~10 
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		for(char c='Z';c>='A';c--)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		String s="Hello Java";
		//        0123456789 
		// => 인덱스번호 => 0번부터 
		// length() => 문자의 갯수 
		// 마지막 문자 번호 => length()-1
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		String html=" <li class=\"common_sp_list_li\">\r\n"
				+ "                  <div class=\"common_sp_thumb\">\r\n"
				+ "                    <a href=\"/recipe/7059176\" class=\"common_sp_link\">\r\n"
				+ "                                                <img src=\"https://recipe1.ezmember.co.kr/cache/recipe/2025/07/18/5f8fac2ed99b2c20e4436678d67a844c1_m.jpg\">\r\n"
				+ "                    </a>\r\n"
				+ "                </div>\r\n"
				+ "                <div class=\"common_sp_caption\">\r\n"
				+ "                                        <div class=\"common_sp_caption_tit line2\">110.상큼딸기양갱 만들기 (ft.우리들의여름) (2025.7.30)</div>\r\n"
				+ "                    <div class=\"common_sp_caption_rv_name\" style=\"display: inline-block; vertical-align: bottom;\">\r\n"
				+ "                        <a href=\"/profile/recipe.html?uid=25757478\"><img src=\"https://recipe1.ezmember.co.kr/cache/rpf/2025/04/14/1c4021b4b61a61c12b242a594594b0231.77bf95abca70e4f63d14d79d0dbf76f7\">벚꽃조이나</a>\r\n"
				+ "                    </div>\r\n"
				+ "                    <div class=\"common_sp_caption_rv\">\r\n"
				+ "                                                    <span class=\"common_sp_caption_rv_star\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"></span>\r\n"
				+ "                            <span class=\"common_sp_caption_rv_ea\">(1)</span>\r\n"
				+ "                                                <span class=\"common_sp_caption_buyer\" style=\"vertical-align: middle;\">조회수 16</span>\r\n"
				+ "                    </div>\r\n"
				+ "                </div>\r\n"
				+ "            </li>";
		
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		System.out.println(html);
		
		for(int i=0;i<30;i++)
		{
			System.out.println(html);//out.println()
		}
	}

}
