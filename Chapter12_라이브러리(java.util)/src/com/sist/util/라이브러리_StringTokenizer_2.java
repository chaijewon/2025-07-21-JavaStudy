package com.sist.util;
import java.util.*;
public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] data={
        	"100|hong|남자|대기실",
        	"200|자바방|5|공개",
        	"210|자바방|hong",
        	"300|hong|shim|Hi~~",
        	"400|hong"
        };
        for(String msg:data)
        {
        	StringTokenizer st=new StringTokenizer(msg,"|");
        	int protocol=Integer.parseInt(st.nextToken());
        	switch(protocol)
        	{
        	  case 100:
        	  {
        		 String id=st.nextToken();
        		 String sex=st.nextToken();
        		 String loc=st.nextToken();
        		 System.out.println(id+"님이 "+loc+"에 입장하셨습니다");
        	  }
        	  break;
        	  case 200:
        	  {
        		  String roomName=st.nextToken();
        		  String inwon=st.nextToken();
        		  String state=st.nextToken();
        		  System.out.println("방이름:"+roomName+",인원:"
        		    +inwon+",상태:"+state);
        	  }
        	}
        	
        }
	}

}
