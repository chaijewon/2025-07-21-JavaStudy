package com.sist.thread;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  쓰레드 : 같은 작업이 많은 경우 = 나눠서 작업 
 *         크롤링 
 *         동시 작업이 많은 경우 
 *         ----------------
 *         Client <===> 서버 
 *                   | 통신 담당 쓰레드 
 *        ------------------------------
 *        1. 사용법 
 *           Thread를 상속 => 멀티쓰레드 (게임 , 크롤링)
 *           Runnable 구현 => 싱글쓰레드 (윈도우 , 네트워크)  
 *        2. Thread 생명 주기 
 *           = NEW (쓰레드 생성) => new Thread()
 *           = Runnable => 실행 대기 상태 (start())
 *           = Running  => 작업 시작 (run())
 *           = BLOCKED (일시 정지) 
 *               => sleep 
 *           = TERMINATED (종료 상태) => interrupt()
 *           = 동작은 반드시 run()에서 구현한다 
 *        3. 디폴트 : 비동기 
 *           -------------
 *           동기화 => 멀티쓰레드 => 공유 데이터의 안전하게 다루는 경우
 *           1) public synchronized void display()
 *              {
 *              }
 *           2) public void display()
 *              {
 *                 synchronized(this)
 *                 {
 *                 }
 *              }
 *  
 *         
 */
class GenieThread extends Thread
{
	HashSet<String> genie=new HashSet<String>();
	private int page=1;
	static int k=0;
	public GenieThread(int page)
	{
		this.page=page;
	}
	
    // 작업 
	public synchronized void run()
	{
		getData();
	}
	// synchronized : 동기화 
	public  void getData()
	{
		try
		{
			
			
			Document doc=
					Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250826&hh=16&rtm=Y&pg="+page).get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				
				String t=title.get(i).text();
				genie.add(t);
				//System.out.println(t);
				
			}
		}catch(Exception ex){}
	}
	public void print()
	{
		Iterator<String> it=genie.iterator();
		int i=1;
		while(it.hasNext())
		{
			System.out.println(i+"."+it.next());
			i++;
		}
	}
}
public class 쓰레드_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GenieThread t1=new GenieThread(1);
        GenieThread t2=new GenieThread(2);
        GenieThread t3=new GenieThread(3);
        GenieThread t4=new GenieThread(4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        try
        {
        	Thread.sleep(5000);
        }catch(Exception ex) {}
        
        t1.print();
        System.out.println("=====================");
        t2.print();
        System.out.println("=====================");
        t3.print();
        System.out.println("=====================");
        t4.print();
        System.out.println("=====================");
        
	}

}
