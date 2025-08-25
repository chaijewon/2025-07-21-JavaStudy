package com.sist.network;
import java.util.*;
import java.net.*;
public class Server implements Runnable{
    private final int PORT=3355;
    // 0~65535 => 0~1023 (사용중) => 4000 , 8080 , 1521 , 1433 , 3306
    private ServerSocket ss;
    // 저장 공간 
    Vector waitVc=new Vector();
    public Server()
    {
    	try
    	{
    		ss=new ServerSocket(PORT); // bind / listen 
    		System.out.println("Server Start...");
    	}catch(Exception ex) {}
    }
    public void run()
    {
    	try
    	{
    		while(true)
    		{
    			Socket s=ss.accept();
    			waitVc.add(s);
    			System.out.println("접속인원:"+waitVc.size());
    			for(Object obj:waitVc)
    			{
    				Socket ss=(Socket)obj;
    				System.out.println(ss.getPort());
    				System.out.println(ss.getInetAddress().getHostAddress());
    			}
    		}
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Server server=new Server();
         new Thread(server).start();
	}

}
