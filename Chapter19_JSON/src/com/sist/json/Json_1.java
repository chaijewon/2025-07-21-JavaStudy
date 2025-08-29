package com.sist.json;
/*
 *   JSON => JavaScript Object Notation 
 *           = 자바스크립트 객체 표현법 
 *           = 실제로는 모든 언어에서 사용 
 *           = 웹(자바스크립트) === 자바 연동
 *             일반 데이터형 = 자바스크립트와 호환 
 *             ~VO  ==> {}
 *             List ==> []
 *             ------------------ Vue , React
 *             자바에서 지원 라이브러리 
 *             ------------------외부에서 지원 
 *             => simple-json.jar 
 *             => jackson.jar : Spring-Boot => 자동 설정 
 *      목적 : 데이터 교환 => 경량 데이터 포맷 
 *            서버 = 웹브라우저 
 *            서버 = 모바일 
 *            ---------------------
 *            1. 읽기 쉽다(가독성) , 생성 쉽다 
 *            2. 모든 언어의 동일한 포맷
 *            3. 장고 => Spring  
 *      구조 
 *        1. 객체(Object)
 *           class Sawon
 *           {
 *              int sabun;
 *              String name;
 *              String dept;
 *           } 
 *           Sawon s=new Sawon()
 *           s.sabun=1;
 *           s.name="홍길동"
 *           s.dept="개발부" 
 *           
 *           => {sabun:1,name:"홍길동",dept:"개발부"} = VO
 *                 |   |
 *                key value
 *           => key는 문자열이다 
 *           => value는 문자열 "" , 숫자 : 10,10.5
 *                     boolean true/false , 값이 없는 경우 null
 *        2. 배열(Array) => List => []
 *           [{},{},{}...]
 *        3. 언어의 호환 
 *           --------- 보통 : 서버(C) / 클라이언트(Java)
 *                           char*      String
 *                           char[] 
 *                           웹(JavaScript) / 서버(Java)
 *                               |              |
 *                               ----------------
 *                                       |
 *                                    JSON
 *                  BackEnd       FrontEnd
 *                  -------       ---------
 *                                 JavaScript,HTML,CSS
 *                                     |
 *                                  Ajax , Vue , React , Next..
 *                                  NodeJS : 서버측 사이드 
 *                                  Nest => Fast API 
 *                     자바,JSP,Spring,DataBase 
 *        4. 사용처     |            |
 *           웹 API : 서버 <=====> 클라이언트 
 *                           |
 *                       데이터 교환 
 *           설정파일 : package.json , tsconfig.json...
 *           데이터 저장 : 몽고디비 , ElasticSearch  
 *        5. JSON 작성 규칙 
 *           1. 문자열 키는 항상 ""
 *              {"name":"값"} => 값이 여러개 ,
 *              => 마지막에 ,를 사용할 수 없다 
 *              => 차트 (관리자 모드) 
 *        6. 객체안에 객체 
 *           {==============> JSONObject
 *             "item":[ ====> JSONArray
 *                {} , {} , {} ...
 *             ]
 *           }
 *           
 *           => JSON : 네이버 뉴스
 *        
 */
// => json-simple : 생성 / 파싱 (데이터 추출)
// => jackson : 생성 / 파싱 (데이터 추출) *** 객체단위 
import com.sist.manager.*;
import java.util.*;
import com.sist.dao.*;
public class Json_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        SimpleJsonManager sm=new SimpleJsonManager();
//        String json=sm.jsonArrayCreate();
//        System.out.println(json);
//        //String json=sm.jsonObjectCreate(7788);
//        //System.out.println(json);
//        List<EmpVO> list=sm.jsonListCreate(json);
//        for(EmpVO vo:list)
//        {
//        	System.out.println(vo.getEmpno()+" "
//        			+vo.getEname()+" "
//        			+vo.getJob()+" "
//        			+vo.getHiredate()+" "
//        			+vo.getSal()+" "
//        			+vo.getDeptno());
//        }
		JacksonManager jm=new JacksonManager();
		String json=jm.listJacksonCreate();
		System.out.println(json);
//		String json=jm.voJacksonCreate(7900);
//		System.out.println(json);
		//EmpVO vo=jm.jacksonVOCreate(json);
		List<EmpVO> list=jm.jacksonListCreate(json);
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno());
			System.out.println(vo.getEname());
			System.out.println(vo.getHiredate());
			System.out.println(vo.getJob());
			System.out.println(vo.getSal());
		}
		// 객체 => JSON => 자바 => 자바스크립트 (React , Vue)
		// JSON => 객체 => 외부에서 데이터 읽기 
		
	}

}



