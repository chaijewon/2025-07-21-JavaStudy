package com.sist.main;
/*
 *  상속
 *   장점  
 *   = 재사용 기법 
 *   = 코드를 간결하게 
 *   = 신뢰성이 뛰어나다 (검증된 클래스를 이용)
 *   = 한개의 클래스만 상속 => 단일상속 
 *   = 기능을 변경해서 사용이 가능 (오버라이딩)
 *   = 라이브러리 상속이 많다 
 *   = 개발시간이 단축 
 *   예)
 *        지니뮤직 
 *          |
 *         멜론 
 *        
 *        알라딘 
 *          |
 *        Yes24
 *        
 *        메가박스 
 *          |
 *         CGV 
 *          |
 *        롯데시네마
 *     단점) 결합성이 높아진다 
 *          ----- 클래스를 수정 => 다른 클래스에 영향 
 *          ----- 개발에 제약이 많다 
 *                | 메소드가 동일 
 *          메모리가 비대 => 메모리 누수현상 
 *          상속내리는 클래스의 모든 내용을 파악 => .jar *.class
 *     => 호불호 
 *     -------------------------------------------------
 *     기본 구조 
 *     class 상속받는클래스 extends 상속내리는클래스
 *     {
 *        // => 상속받은 변수/ 메소드
 *              상속이 안된는 것 : static / 생성자 / 초기화 블록 
 *              상속은 되는데 접근거부 : private 
 *     }
 *     
 *     정의 : 기존의 클래스로부터 상속을 받아서 확장된 새로운 클래스를 작성
 *           ----------                ----------------
 *     상속에서 많이 사용 
 *     --------------
 *     게시판 : 공통기능을 가지고 있어야 한다 
 *       글쓰기 
 *       목록
 *       상세보기 
 *       수정
 *       삭제
 *       검색 
 *     자료실 ====> 기존의 클래스의 기능 변경
 *       글쓰기 ====> 업로드 
 *       목록
 *       상세보기 ===> 다운로드 
 *       수정
 *       삭제
 *       검색 
 *     댓글형게시판 
 *       글쓰기 
 *       목록
 *       상세보기 
 *       수정
 *       삭제
 *       검색
 *       ===== 추가 : 댓글 
 *    --------------------------
 *     상위클래스 : 상속받는 클래스의 공통점을 모아둔 것 
 *                             ------
 *                             중복 제거 
 *     사람
 *      이름 
 *      주소
 *      성별 
 *     학생 extends 사람
 *      학번
 *      학과
 *      학년
 *     회사원 extends 사람
 *      사번 
 *      부서 
 *      년차 
 *     군인 extends 사람
 *      군번
 *      부대명
 *      계급
 *     
 *    ===> 코드 중복 제거 
 *    ===> 한개를 가지고 여러개 표현이 가능      
 */
class A
{
	public void aaa()
	{
		System.out.println("aaa() Call");
	}
	public void bbb()
	{
		System.out.println("bbb() Call");
	}
}
class B extends A
{
	A a=new A() {
		public void aaa()
		{
			System.out.println("B:aaa() Call");
		}
		public void bbb()
		{
			System.out.println("B:bbb() Call");
		}
	};
	// 자체 추가
	public void ccc()
	{
		System.out.println("B:ccc() Call");
	}
}
public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B a=new B();
        
	}

}
