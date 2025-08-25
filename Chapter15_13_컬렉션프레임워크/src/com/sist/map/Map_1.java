package com.sist.map;
/*
 *     Map ====> 인터페이스 
 *      |
 *    -----------
 *    |         |
 *  HashMap    Hashtable 
 *    = 비동기     = 동기    ==> Hashtable을 보완 HashMap
 *    
 *  ==> List : ArrayList 
 *  ==> Set  : HashSet DISTINCT ORDER BY
 *  ==> Map  : HashMap  ==> id:admin sex:성별 name:홍길동 
 *  -----------------------
 *  
 *  => 특징 
 *        두개를 동시에 저장 (key , value) 
 *        => 웹 / MyBatis / Spring
 *                          | 키 값
 *                              클래스 주소값
 *                           임의로 지정  
 *                 | 키 / 값  
 *                  id   SQL
 *           | request / response / session / cookie 
 *        => key / value 
 *                 | 중복이 가능 
 *           | 중복허용 금지 
 *             ----------- 중복시에 오류는 없다 (덮어쓴다) 
 *             ("id","hong") 
 *             ("id","shim") ==> X  
 */
import java.util.*;
// => 저장 (put) / 읽기 (get(key)) 
public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map map=new Hashtable();// 동기 => 쓰레드 
        // Map map=new HashMap(); 비동기 => 일반 
        /*
         *      List
         *   ArrayList : 비동기 => 데이터베이스 
         *   Vector    : 쓰레드 => 동기 => 네트워크 
         *   LinkedList : 파일 입출력 
         */
        map.put("id", "admin");
        map.put("password", "1234");
        map.put("name", "홍길동");
        map.put("sex", "남자");
        map.put("age", 25);
        map.put("id", "hong"); // key중복 => 덮어쓴다 
        System.out.println("ID:"+map.get("id"));
        System.out.println("PWD:"+map.get("password"));
        System.out.println("NAME:"+map.get("name"));
        System.out.println("SEX:"+map.get("sex"));
        System.out.println("AGE:"+map.get("age"));
        // 키는 대소문자 구분 => 문자로 시작한다 
        
        Set set=map.keySet();
        for(Object obj:set)
        {
            String key=(String)obj;
        	System.out.println(obj+":"+map.get(key));
        }
        /*
         *   clear() : 전체 삭제 
         *   get(String key) : 값 읽기 
         *   put() : 저장 (데이터 추가) 
         *   isEmpty() : 데이터가 있는 지 여부 
         *   size() : 저장 객수 
         *   keySet() : key전체를 읽는 경우 
         *   values() : 실제 저장된 값만 
         */
        for(Object obj:map.values())
        {
        	System.out.println(obj);
        }
        
	}

}
