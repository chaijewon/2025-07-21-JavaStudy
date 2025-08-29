package com.sist.commons;
// 내부 프로토콜 => (서버 = 클라이언트) 
/*
 *   로그인 : 로그인된 사람 / 로그인 요청하는 사람 
 */
public class Function {
  // 웹 => 파일명 => 요청 
  public static final int LOGIN=100;// id(aaa)/name/sex
  public static final int MYLOG=110;
  public static final int MAKEROOM=200; // rname(aaa)/rstate/rinwon
  public static final int ROOMIN=210;
  public static final int ROOMOUT=220;
  public static final int MYROOMOUT=230;
  public static final int WAITUPDATE=240;
  public static final int WAITCHAT=300;
  public static final int ROOMCHAT=310;
  public static final int INFO=500;
  public static final int CHATEND=900;
  public static final int MYEND=910;
}
