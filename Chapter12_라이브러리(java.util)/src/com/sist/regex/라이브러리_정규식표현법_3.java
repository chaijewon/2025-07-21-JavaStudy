package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *   Matcher 
 *     macheres() : 전체 문자열이 패턴과 일치하는 여부 검색 
 *     ***find() : 부분 일치 (패턴 형식)
 *     ***group() : 찾은 문장열 
 *     start() : 시작 인덱스 
 *     end() : 끝 인덱스 
 *     replaceAll() : 변환 
 */
public class 라이브러리_정규식표현법_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="비밀번호: 1234 , 또 다른 비밀번호: 567";
        String regex="\\d+";
        // 1 234 12 455 899000  \\d*
        //String result=msg.replaceAll(regex, "****");
        //System.out.println(result);
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(msg);
        while(m.find())
        {
        	System.out.println("비밀번호:"+m.group());
        }
	}

}
