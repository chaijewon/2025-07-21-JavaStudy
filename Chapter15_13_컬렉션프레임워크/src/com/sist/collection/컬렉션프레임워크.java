package com.sist.collection;
//642page 
/*
 *   1. Collection 
 *      자료구조 : 메모리상에서 데이터를 효율적으로 관리 
 *      | 객체를 관리 (추가 , 수정 , 삭제 , 읽기) 
 *      | 웹에서 핵심 기능 
 *      | 프레임워크 : 표준화 => 모든 개발자가 동일 
 *                  ------ 분석이 쉽다 
 *                  소스 통일화 (Spring , MyBatis , JQuery 
 *                            VueJS , ReactJS)
 *                  Spring 서버 => NodeJS , NestJS
 *      | 배열의 단점 
 *        --------- 고정적이다 (한번 크기를 지정하면 변경할 수 없다)
 *        --------- 가변형 (크기를 지정하지 않는다)
 *        
 *   ==> Collection => 데이터 그룹 / 다수의 데이터 => 모아서 관리 
 *   ** 자바에서 지원하는 컬렉션의 클래스 
 *                  Collection ==> interface 
 *                      |
 *      -----------------------------------------
 *      |                  |                    |
 *    List                Set                  Map (interface)
 *      |                  |                    |
 *                     -----------          ---------------
 *                     |         |          |             |
 *                   HashSet   TreeSet    HashMap       Properties
 * ------------------------               -------       ----------
 *                                                      | Database 정보 저장 
 * |             |        |                  |Spring,MyBaties 
 *ArrayList(*) Vector  LinkedList
 * 
 * 1) List 
 *    = 특징 : 순서가 존재 (인덱스 번호가 자동으로 부여)
 *            중복데이터를 허용 
 *    = 사용처 : 순차적으로 데이터를 저장 
 *             인덱스를 통한 접근이 필요한 경우 
 *             게시판 / 예약정보 / 장바구니 
 *             ----------------------- 순서,중복 
 *    = 구현 클래스 : ***ArrayList , Vector , LinkedList
 *                      |            |         |
 *                                           파일에서 관리 프로그램 
 *                    데이터베이스     네트워크(사용자 정보)
 * 2) Set 
 *    = 특징 : 순서가 없다 
 *            중복 데이터를 허용하지 않는다 
 *    = 사용처 : 회원가입 (데이터베이스 : private)
 *    = 구현 클래스 : HashSet , TreeSet
 *                           -------- 검색 
 *                 -------- 중복제거 
 * 3) Map 
 *    = 특징 : 순서는 없다 
 *            키 ,값이 쌍으로 저장 
 *            -- --
 *               | 중복이 가능 
 *            | 중복이 불가능 
 *    = 사용처 : 클래스 관리 , 화면 이동 , 웹에서 제공하는 모든 클래스
 *             --------- 
 *             Spring , MyBatis (키, 값) 
 *                                  --- SQL
 *            <select id="boardList">
 *              SELECT * FROM board
 *            </select>
 *            ==> XML (SQL담당 / 웹개발자가 나눠서 작업)
 *            
 *            => selectList("boardList")
 *     = 구현한 클래스 : **HashMap , Hashtable , **Properties
 *                    Hashtable의 단점 보완 => HashMap
 *  4) 기타 
 *     Queue(FIFO) / Stack(LIFO)   
 *         |            |
 *     네트워크,운영체제   메모리 / 메소드 호출 (Call Stack)
 *         |
 *     LinkedList
 *  클래스명                 특징                 사용처 
 * -----------------------------------------------------
 * ArrayList   배열기반 , 검색빠름 , 추가/삭제(느림) 순차적 저장 , 조회위주
 *             접근 속도가 빠르다    
 * -----------------------------------------------------
 * LinkedList  노드기반 추가/삭제(빠름)             추가/수정이 많은 경우 
 *             파일 기반 => 접근 속도가 느림 
 * -----------------------------------------------------
 * Vector     동기화 지원                    멀티쓰레드 
 *                                        => 네크워크 
 *                                        => 게임 
 *            Vector를 보완 => ArrayList
 * -----------------------------------------------------
 * HashSet    순서 (X) , 중복 (X)      중복제거 
 *                                   장르 / 부서명 / 근무지 ...
 * -----------------------------------------------------
 * TreeSet    정렬된 순서 , 중복 (X)     정렬 , 범위 검색 
 * -----------------------------------------------------
 * HashMap    순서 X , key 중복 X 
 * -----------------------------------------------------
 * 
 *   List 
 *    = ArrayList : 게시판 글 목록 , 최신 본 상품 
 *    = Vector    : 네트워크 사용자 정보 저장 
 *                  => 채팅 내용 저장 
 *                     ----------- 파일 
 *                     | 몽고디비 / 라디스 / ElasticSearch 
 *                       ------------------------------
 *                                  JSON
 *   Set 
 *    = HashSet  ==> 사용자 ID -> 객체 매핑 
 *    = TreeSet  ==> 점수대 , 랭킹 
 *                   ----------- BETWEEN / Order 
 *                   ----------- Rank 
 *   Map 
 *    = HashMap ==> 웹은 대부분 사용 
 *                  request / response / cookie / session 
 *                  Spring / MyBatis / JPA 
 *                  
 *   ---------------------------------------------------
 *     회원 관리 시스템 
 *         회원 ID 저장 => HashSet 
 *         회원 저장 => HashMap(id,Member)
 *     게시판 
 *         목록 : ArrayList
 *         댓글 순서 관리 : LinkedList
 *     검색 엔진
 *         HashMap 
 *     랭킹 시스템 
 *         TreeSet 
 *     
 *        
 */
public class 컬렉션프레임워크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
