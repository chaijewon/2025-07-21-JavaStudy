package com.sist.util;
import java.util.*;
import java.sql.*;
public class 라이브러리_StringTokenizer_3 {
    // 0~65535 => 0~1023 사용중 
	// 3306 / 1521 / 4000 / 8080 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	String url="jdbc:oracle:thin:@211.238.142.124:1521:XE";
        	//               mysql                        3306:mydb
        	Connection conn=DriverManager.getConnection(url,"hr_1","happy");
        	String sql="select name,theme from food_menupan where theme like '%어른과 함께라면%'";
        	PreparedStatement ps=
        			conn.prepareStatement(sql);
        	ResultSet rs=ps.executeQuery();
        	while(rs.next())
        	{
	        	String name=rs.getString(1);
	        	String theme=rs.getString(2);
	        	System.out.println(name);
	        	//System.out.println(theme);
	        	StringTokenizer st=new StringTokenizer(theme,",");
	        	while(st.hasMoreTokens())
	        	{
	        		System.out.println(st.nextToken());
	        	}
        	}
        	rs.close();
        	ps.close();
        	conn.close();
        	
        }catch(Exception ex){}
	}

}
