package com.sist.regex;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class 라이브러리_정규식표현법_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date(); // 시스템의 날짜/시간을 가지고 오는 클래스
        // 기능 => 기능보완 Calendar
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String today=sdf.format(date);
        // 2025-08-22
        //System.out.println(today);
        
        String regex="(\\d{4})-(\\d{1,2})-(\\d{2})";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(today);
        //System.out.println(08);
        if(m.matches())
        {
        	System.out.println(m.group());
        	System.out.println("년도:"+m.group(1));
        	System.out.println("월:"+m.group(2));
        	System.out.println("일:"+m.group(3));
        }
        
        String ip="211.238.142.124";
        regex="(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\.(\\d{1,3})";
        p=Pattern.compile(regex);
        m=p.matcher(ip);
        
        if(m.matches())
        {
        	System.out.println(m.group());
        	System.out.println(m.group(1));
        	System.out.println(m.group(2));
        }
        /*
         *   패턴 만들기 
         *   ---------
         *   Pattern.matches : equals => 전체 문장 
         *   Matcher.find/group : contains() => 부분 검색 
         *      => 찾은 문장열 읽기 : group()
         *      => 주로 find()를 사용한다 
         *   replaceAll : 변환 
         *   그룹 () => 그룹을 묶는 경우 
         *   
         *   => 데이터셋 => 데이터사전 
         */
        
	}

}
