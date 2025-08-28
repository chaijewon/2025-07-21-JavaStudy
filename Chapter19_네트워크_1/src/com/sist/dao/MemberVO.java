package com.sist.dao;
/*
 *   ID    NOT NULL VARCHAR2(20)  
		PWD   NOT NULL VARCHAR2(10)  
		NAME  NOT NULL VARCHAR2(51)  
		POST  NOT NULL VARCHAR2(7)   
		ADDR1 NOT NULL VARCHAR2(250) 
		ADDR2          VARCHAR2(200)
 */
public class MemberVO {
  private String id;
  private String pwd;
  private String name;
  private String post;
  private String addr1;
  private String addr2;
  private int login;
}
