package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.net.*;
import java.io.*;
/*
 *    서버 
 *     => 접속 담당 
 *        => 접속한 클라이언트의 정보 저장 
 *     => 통신 담당 : 각 클라이언트당 따로 통신 
 *        -------- 쓰레드 이용 
 *        => 저장된 클라이언트의 정보 이용 
 *        => 멤버클래스 (내부 클래스)
 *     ----------------------------------------
 *     class Server 
 *     {
 *        Vector waitVc;
 *        
 *        class Client extends Thread
 *        {
 *           // 클래스간의 공유가 많다 (변수,메소드) 
 *           // 내부 클래스를 이용한다 
 *        }
 *     }
 *     ------------- 서버 / 빅데이터 
 */
public class Server implements Runnable{
    // 클라이언트 정보 저장 
	Vector<Client> waitVc=new Vector<Client>();
	// 동기화 , ArrayList : 비동기화 => 데이터베이스 
	// 접속을 받는다 
	ServerSocket ss;
	// 클라이언트 => 서버 => 연결선 (숫자 => PORT)
	final int PORT=3355;
	// port => 0~65535 
	// 0~1023 알려진 포트 => 80 : HTTP 
	// 23 : FTP , 25 : SMTP ...
	// 4000(머드서버) 8080(프록시서버) 
	// 1521(오라클) , 3306(MySQL) ..
	// 1.서버구동 
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); // 핸드폰 
			// 자동 => IP인식 
			// 연결 => IP+PORT가 매칭 (유심) => bind()
			// 대기상태 listen()
			// 단점 : 50명만 접근이 가능 
			// new ServerSocket(1000,PORT)
			System.out.println("Server Start...");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	// Thread메소드 => 동작 
	// 접속시마다 처리 
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s=ss.accept();//대기상태 
			   //        접속한 경우 => 클라이언트가 접속시에 호출되는 특수메소드
			   // 발신자 정보 => 접속된 클라이언트 IP/PORT
			   // => 통신을 시작한다 
			   Client client=new Client(s);
			   client.start();
			}catch(Exception ex) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 시적점 
		Server server=new Server();
		// 서버 설정 => 서버구동 
		new Thread(server).start(); // 접속처리 => run()
	}
	// 같은 서버에서 같은 PORT면 서버는 한번만 수행한다 
	// 통신 담당 클래스 
	class Client extends Thread
	{
		// Client의 모든 정보 
		String id,name,sex;
		// Client 연결 
		Socket s;
		// 송수신 
		// 송신
		OutputStream out;
		// 수신 
		BufferedReader in;
		/*
		 *   https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&q=%EC%9E%90%EB%B0%94
		 */
		public Client(Socket s)
		{
			try
			{
			  this.s=s;
			  // => 클라이언트 컴퓨터 메모리 
			  out=s.getOutputStream();
			  // 접속한 클라이언트로 요청 처리값을 보내는 경우에 사용
			  in=new BufferedReader(
					  new InputStreamReader(s.getInputStream()));
			  // 클라이언트로부터 요청을 받을 경우에 사용
			  // => 한글처리 => 2byte 
			  // InputStream => 1byte => 한글깨짐 
			  // ===> 2byte로 변경후 받는다 => Reader
			  // 웹에서 전송 : 1byte / 받는 경우 : 2byte로 변경 
			  // => Encoding         Decoding(UTF-8)
			  // ------------        => setCharacterEncoding("UTF-8")
			  // %EC%9E%90%EB%B0%94 ==> 자바
			}catch(Exception ex) {}
			
		}
		// 통신 => Thread로 처리  start() => run() 호출 
		public void run()
		{
			try
			{
				while(true)
				{
					// 사용자 전송한 메세지를 받는다 
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					// 100|hong|홍길동|남자
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					  // 로그인 요청시 처리 
					  case Function.LOGIN:
					  {
						  id=st.nextToken();
						  name=st.nextToken();
						  sex=st.nextToken();
						  
						  // 1. 전체적으로 로그인 정보 전송 
						  messageAll(Function.LOGIN+"|"
								  +id+"|"+name+"|"+sex);
						  // 2. 입장메세지 전송 
						  messageAll(Function.WAITCHAT+"|[알림]"
								  +name+"님이 입장하셨습니다");
						  // 3. waitVc에 저장 
						  waitVc.add(this);
						  // => 메인화면으로 이동 
						  messageTo(Function.MYLOG+"|"
								  +id);
						  // 4. 먼저 접속한 사람의 정보 전체를 보낸다 
						  for(Client client:waitVc)
						  {
							  messageTo(Function.LOGIN+"|"
									+client.id+"|"
									+client.name+"|"
									+client.sex);
						  }
						  // 5. 방정보 전송 
					  }
					  break;
					  case Function.WAITCHAT:
					  {
						  messageAll(Function.WAITCHAT+"|["
								  +name+"] "+st.nextToken());
					  }
					  break;
					  case Function.EXIT:
					  {
						  messageAll(Function.EXIT+"|"+id);
						  messageAll(Function.WAITCHAT+"|[알림]"
								  +name+"님이 퇴장하셨습니다");
						  for(int i=0;i<waitVc.size();i++)
						  {
							  Client c=waitVc.get(i);
							  if(c.id.equals(id))
							  {
								  messageTo(Function.MYEXIT+"|");
								  waitVc.remove(i);
								  // 접속자명단 제거 
								  try
								  {
									  // 통신 중단 
									  in.close();
									  out.close();
								  }catch(Exception ex) {}
							  }
						  }
					  }
					  break;
					}
				}
			}catch(Exception ex) {}
		}
		// => 개인별로 전송 
		// synchronized => 동기화
		// => async function  AJAX
		// => sync function
		public synchronized void messageTo(String msg)
		{
			// 신뢰성이 좋은 프로그램 => 안정성 / 속도가 느리다 
			// => SMTP/FTP 
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
		// => 접속자 전체 전송 
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client client:waitVc)
				{
					client.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}

}
