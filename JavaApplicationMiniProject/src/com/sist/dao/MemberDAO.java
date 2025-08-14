package com.sist.dao;
// 로그인 / 회원가입 / 회원 탈퇴 / 회원수정 => 오라클 연결 
import java.sql.*;
import java.util.Date;

import com.sist.vo.*;
public class MemberDAO {
   private Connection conn;
   private PreparedStatement ps;
   private static MemberDAO dao;
   private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE";
   //                                          211.238.142.124
   // 1. 드라이버 등록 
   public MemberDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex) {}
   }
   
   // WEB => JDBC => DBCP
   // JDBC => 연결 / 닫기 => 연결에 시간 소모가 많다 
   // => 미리 연결한후에 사용 => 재사용 (반환) => WEB에서 일반화 
   // 2. Connection을 한개만 생성 
   public static MemberDAO newInstance()
   {
	   if(dao==null)
		   dao=new MemberDAO();
	   return dao;
   }
   
   // 3. 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr_1","happy");
	   }catch(Exception ex) {}
   }
   // 4. 닫기 
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   // 기능 
   // 1. 로그인 
   public MemberVO isLogin(String id,String pwd)
   {
	   MemberVO vo=new MemberVO();
	   try
	   {
		   // 1. 연결 
		   getConnection();
		   // 2. SQL문장 전송 => id존재여부 확인 
		   String sql="SELECT COUNT(*) FROM member "
				     +"WHERE id=?";
		   ps=conn.prepareStatement(sql);
		   ps.setString(1, id);
		   
		   // 실행 요청 
		   ResultSet rs=ps.executeQuery();
		   rs.next();
		   int count=rs.getInt(1);
		   rs.close();
		   
		   if(count==0) // ID없는 상태 
		   {
			   vo.setMsg("NOID");
		   } 
		   else // ID있는 상태
		   {
			   // 비밀번호 확인 
			   sql="SELECT id,pwd,name,sex "
				  +"FROM member "
				  +"WHERE id=?";
			   ps=conn.prepareStatement(sql);
			   // 실행전에 ?에 값을 채운다 
			   ps.setString(1, id);
			   // 결과값 
			   rs=ps.executeQuery();
			   rs.next(); // 한줄씩 읽어 온다 
			   //            ----- RECORD
			   vo.setId(rs.getString(1));
			   vo.setName(rs.getString(3));
			   vo.setSex(rs.getString(4));
			   String db_pwd=rs.getString(2);
			   
			   // 비밀번호 검사 
			   if(db_pwd.equals(pwd)) // 로그인
			   {
				   vo.setMsg("OK");
			   }
			   else // 비밀번호가 틀리다 
			   {
				   vo.setMsg("NOPWD");
			   }
			   
		   }
		   
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
	   return vo;
   }
   // 회원 정보 
   /*
    *   private String id,pwd,name,sex,email,address,msg;
        private Date regdate,birthday;
    */
   public MemberVO memberInfo(String id)
   {
	   MemberVO vo=new MemberVO();
	   try
	   {
		   getConnection();
		   String sql="SELECT name,sex,email,address,"
				     +"regdate,birthday "
				     +"FROM member "
				     +"WHERE id=?";
		   ps=conn.prepareStatement(sql);
		   ps.setString(1, id);
		   ResultSet rs=ps.executeQuery();
		   rs.next();
		   vo.setName(rs.getString(1));
		   vo.setSex(rs.getString(2));
		   vo.setEmail(rs.getString(3));
		   vo.setAddress(rs.getString(4));
		   vo.setRegdate(rs.getDate(5));
		   vo.setBirthday(rs.getDate(6));
		   rs.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
	   return vo;
   }
   // 2. 회원가입
   // 3. 회원수정
   // 4. 회원탈퇴
   
}
