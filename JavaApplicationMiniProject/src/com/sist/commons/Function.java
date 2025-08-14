package com.sist.commons;
// 서버 == 클라이언트의 약속 => 내부프로토콜 (정수 / 문자열)
// 가독성 => 상수형으로 처리 
// 서버 / 클라이언트가 동시에 사용 => 공통 모듈 
// => 이미지 => 확대 / 축소 <img width height> : CSS
public class Function {
    // client에서 요청
	// 먼저 로그인된 사람 처리
	public static final int LOGIN=100;
    // 로그인하는 사람 처리 
	public static final int MYLOG=110;
    // 채팅 
	public static final int WAITCHAT=200;
	// 쪽지보내기 / 개인 정보보기
	public static final int SENDMESSAGE=300;
	public static final int INFO=400;
	// 방만들기 / 방들어가기 / 방나가기 
	// 나가기 
	public static final int EXIT=900;
	public static final int MYEXIT=910;
}
