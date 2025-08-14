package com.sist.vo;
/*
 *   ID       NOT NULL VARCHAR2(20)  
PWD      NOT NULL VARCHAR2(10)  
NAME     NOT NULL VARCHAR2(50)  
SEX               CHAR(6)       
EMAIL             VARCHAR2(100) 
BIRTHDAY NOT NULL DATE          
ADDRESS  NOT NULL VARCHAR2(100) 
REGDATE           DATE    

    => jdbc => 자바 데이터베이스 연결 
       => java.sql.*
       1. ojdbc8.jar 
       2. lombok.jar 
       --------------
       1) 오라클에 있는 데이터를 모아서 윈도우/웹에 전송 
          ------------------------------------
            ***=> ~VO (value object) : Spring  
            => ~DTO (data transfor object) : MyBatis 
            => ~Bean : JSP
            => 변수(컬럼) => 데이터의 손실 방지 => 캡슐화 
       2) DAO => 데이터베이스 연결 
          = Connection : 데이터베이스 연결 
          = Statement : SQL문장 전송 / 결과값을 받는 역할
             = Statement : SQL+데이터를 동시에 전송 
               "WHERE no="+no => SQL완성후 전송 
             = PreparedStatement :SQL문장을 전송 
                                  나중에 데이터값을 채운다 
               "WHERE name=?"
               => 가장 많이 사용되는 방식 
             예)
                 String name,sex,address,phone;
                 int age, no;
                 "INSERT INTO tableName VALUES('"+name
                 +"','"+sex+"','"+address+"','"+phone
                 +"',"+age+","+no+")"
                 
                 "INSERT INTO tableName VALUES(?,?,?,?,?,?)";
             = CallableStatement : PROCEDURE를 호출 
                                  ----------- 오라클 함수 
                                  PL/SQL => 중복 SQL 
               
          = ResultSet : 결과값을 저장하는 메모리 공간 => 단위가 ROW
            결과값을 저장하는 메모리 공간 
            SELECT id,sex,age,name,regdate FROM member
            => 정렬
            -------------------------------------
               id    sex   age   name   regdate
            -------------------------------------
              hong1  남자   25    홍길동   25/01/16 | => next()
             ------  ---   --    -----   --------
                                         getDate(5)  => getDouble()
                                getString(4)
                          getInt(3)
                   getString(2)
             getString(1)
              hong2  남자   25    홍길동   25/01/16 | => next()
              hong3  남자   25    홍길동   25/01/16
              hong4  남자   25    홍길동   25/01/16
              hong5  남자   25    홍길동   25/01/16 | => previous()
            -------------------------------------
            | 커서 
            
            => 출력된 row가 많은 경우 => 검색 / 목록 
               while(rs.next()) 
            => 출력된 row가 1개인 경우 => 상세보기 / 총페이지
               rs.next()
               
         코딩 
          1) 드라이버 등록 => 한번 사용 (생성자) 
             Class.forName("oracle.jdbc.driver.OracleDriver")
                        MYSQL="com.mysql.cj.jdbc.Driver"
                        ----- MARIADB 
                        ----- driver는 각 데이터베이스업체에서 다운 받는다 
         2) 오라클 연결 / 닫기 => 중복이 많다 (메소드 처리)
            = 연결 => 
            conn=DriverManager.getConnection(URL,username,password)
            => 닫기 
               ps.close() / conn.close() 
         3) Connection 객체 관리 => 가비지컬렉션 (바로 회수(X))
            ------------------
            => 반드시 한개만 가지고 사용이 가능 
                    ----------- 싱글턴 (메모리 절약,객체 재사용)
                    | 데이터베이스 / 서버프로그램 
                      ---------------------- 테스트서버 (50)
         4) 코딩 순서 => 표준 (모든 개발자 코딩이 거의 유사)
                            ----------------------
                            | 라이브러리 => MyBatis / JPA
                            | 실무 (Spring / MyBatis)
                                  ------------------ 통합 
            => 286page => 설명 (287page)
               -------         -------
            try
            {
                1. 연결 
                2. SQL문장 
                3. 오라클로 SQL문장 전송 
                4. 실행후 결과값 가지고 오기
                5. List/VO에 값을 채운다 
            }catch(Exception ex)
            {
                에러 위치 확인 / 에러 확인 => 복구할 수 없다 
            }
            
            finally
            {
                오라클 닫기 
            }
             
            
 */
import java.util.*;

import lombok.Data;
@Data
public class MemberVO {
  private String id,pwd,name,sex,email,address,msg;
  private Date regdate,birthday;
}
