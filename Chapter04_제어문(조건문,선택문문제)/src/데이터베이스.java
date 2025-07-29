import java.util.*;
import java.sql.*;
public class 데이터베이스 {

	public static void main(String[] args) 
	throws Exception 
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@211.238.142.124:1521:xe";
		Connection conn=
				DriverManager.getConnection(url,"hr","happy");
		String sql="SELECT title,singer FROM genie_music";
		PreparedStatement ps=conn.prepareStatement(sql);
		// 오라클 전송 
		ResultSet rs=ps.executeQuery();
		// sql을 실행한 결과 요청 
		//rs.next()
		while(rs.next())// 데이터 갯수만큼 반복 수행 
		{
//			int empno=rs.getInt(1);
//			String ename=rs.getString(2);
//			String job=rs.getString(3);
//			int sal=rs.getInt(4);
//			// 1000이상 4000이하 
//			if(empno%2==0)
//			{
//				System.out.println(empno+":"+ename+":"+sal);
//				// 브라우저 => 웹
//			}
			String title=rs.getString(1);
			String singer=rs.getString(2);
			if(singer.contains("임영웅"))
			System.out.println(title+" "+singer);
		}
		
        
	}

}
