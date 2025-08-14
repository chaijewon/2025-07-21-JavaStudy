package com.sist.test;
import java.sql.*;

public class CardDAO {
	// 연결 => 오라클 
		private Connection conn;
		// 송수신 => SQL문장 전송 , 결과값 받기 
		private PreparedStatement ps;
		// 메모리 절약 / Connection객체 생성 조절
		private static CardDAO dao;
		// 오라클 연결 주소 
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		
		// 드라이버 등록 => 한번만 사용
		public CardDAO()
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 리플렉션 => 클래스이름으로 메모리할당 / 메소드 제어 ..
				// new 역할 => 메소드명을 모르는 경우에도 호출 가능 
			}catch(Exception ex) {}
		}
		// 싱글턴 
		public static CardDAO newInstance()
		{
			if(dao==null)
				dao=new CardDAO();
			return dao;
		}
		// 연결 
		public void getConnection()
		{
			try
			{
				conn=DriverManager.getConnection(URL,"hr","happy");
			}catch(Exception ex) {}
		}
		// 해제 
		public void disConnection()
		{
			try
			{
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch(Exception ex) {}
		}
		// 일괄 처리 방식 
		public void cardInsert(String id,int price)
		{
			try
			{
				getConnection();
				conn.setAutoCommit(false);//commit해제 
				String sql="INSERT INTO myCard "
						+"VALUES(?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				ps.setInt(2,price);
				ps.executeUpdate(); 
				
				sql="INSERT INTO myPoint "
				   +"VALUES(1,?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				ps.setInt(2, price);
				ps.executeUpdate();
				
				conn.commit();// 오라클에서는 저장이 안된다 
			}catch(Exception ex)
			{
				ex.printStackTrace();
				try
				{
					conn.rollback();
				}catch(Exception e) {}
			}
			finally
			{
				try
				{
					conn.setAutoCommit(true);
				}catch(Exception ex) {}
				disConnection();
			}
		}
		
		public static void main(String[] args) {
			CardDAO dao=CardDAO.newInstance();
			dao.cardInsert("park", 3000);
		}
}
