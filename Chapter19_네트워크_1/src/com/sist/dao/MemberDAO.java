package com.sist.dao;
import java.util.*;
import java.sql.*;
// 기능 => 우편번호 / 로그인 / 회원가입 
public class MemberDAO {
  private Connection conn;
  private PreparedStatement ps;
  private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
  private static MemberDAO dao;
  
  // 1. driver등록 
  public MemberDAO()
  {
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
	  }catch(Exception ex) {}
  }
  // 2. 싱글턴 
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
		  conn=DriverManager.getConnection(URL,"hr","happy");
	  }catch(Exception ex) {}
  }
  // 4. 해제
  public void disConnection()
  {
	  try
	  {
		  if(ps!=null) ps.close();
		  /*
		   *  PreparedStatement : OutputStream / BufferedReader
		   */
		  if(conn!=null) conn.close();
		  /*
		   *    Connection : Socket
		   */
	  }catch(Exception ex) {}
  }
  // 기능 
  // 1. 우편번호 검색 
  public List<ZipcodeVO> postFind(String dong)
  {
	  List<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
	  try
	  {
		  getConnection();
		  String sql="SELECT zipcode,sido,gugun,dong,"
				    +"NVL(bunji,' ') "
				    +"FROM zipcode "
				    +"WHERE dong LIKE '%'||?||'%'";
		  // 전송 
		  ps=conn.prepareStatement(sql);
		  // ?에 값을 설정 
		  ps.setString(1, dong);
		  // 실행결과 
		  ResultSet rs=ps.executeQuery();
		  while(rs.next())
		  {
			  ZipcodeVO vo=new ZipcodeVO();
			  vo.setZipcode(rs.getString(1));
			  vo.setSido(rs.getString(2));
			  vo.setGugun(rs.getString(3));
			  vo.setDong(rs.getString(4));
			  vo.setBunji(rs.getString(5));
			  list.add(vo);
		  }
		  rs.close();
	  }catch(Exception ex)
	  {
		  ex.printStackTrace();
	  }
	  finally
	  {
		  disConnection();
	  }
	  return list;
  }
  // 2. ID체크
  // 3. 회원가입 
  // 4. 로그인 
}
