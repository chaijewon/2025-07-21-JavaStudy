import java.net.URLEncoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 메소드_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("멜론뮤직(1),지니뮤직(2):");
        int select=scan.nextInt();
        
        while(true)
        {
        	System.out.println("===== Menu =====");
        	System.out.println("1. 목록");
        	System.out.println("2. 곡명 상세보기");
        	System.out.println("3. 곡명 검색");
        	System.out.println("4. 가수 검색");
        	System.out.println("5. 종료");
        	System.out.println("================");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==5)
        	{
        		System.out.println("프로그램 종료!!");
        		break;
        	}
        	
        	if(select==1)
        	{
        		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get(); 
 			    Elements title=doc.select("tr.lst50 div.rank01 a");
 			    Elements singer=doc.select("tr.lst50 div.rank02 a");
        		switch(menu)
        		{
        		   case 1 ->{
        			   // 소스 읽기
        			   
        			   for(int i=0;i<title.size();i++)
        			   {
        				   System.out.println((i+1)+"."
        			         +title.get(i).text());
        			   }
        			   
        		   }
        		   case 2 ->{
        			   System.out.print("1~50번 중에 번호 선택:");
        			   int s=scan.nextInt();
        			   String t=title.get(s-1).text();
        			   System.out.println(t);
        			   // https://www.youtube.com/results?search_query=%EC%95%84%EC%9D%B4%EB%B8%8C
        			   String url="https://www.youtube.com/results?search_query="
        					     +URLEncoder.encode(t, "UTF-8");
        			   Document doc2=Jsoup.connect(url).get();
        			   Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
        			   Matcher m=p.matcher(doc2.toString());
        			   String key="";
        			   /*
        			    *   /watch?v=F0B7HDiY-10\u0026list=RDEMpg9XLA5KnAqZ9f0n2ZZQTw\u0026start_radio=1"
        			    */
        			   while(m.find())
        			   {
        				   String ss=m.group();
        				   key=ss.substring(ss.indexOf("=")+1,
        						   ss.indexOf("\""));
        				   break;
        			   }
        			   // 정규식 
        			   Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
        					     +"http://youtube.com/embed/"+key);
        		   }
        		   case 3 ->{
        			   System.out.print("검색어 입력:");
        			   String fd=scan.next();
        			   for(int i=0;i<title.size();i++)
        			   {
        				   String t=title.get(i).text();
        				   if(t.contains(fd))
        				   {
        					   System.out.println(t);
        				   }
        			   }
        		   }
                   case 4 ->{
                	   System.out.print("가수명 입력:");
        			   String fd=scan.next();
        			   for(int i=0;i<title.size();i++)
        			   {
        				   String t=singer.get(i).text();
        				   if(t.contains(fd))
        				   {
        					   System.out.println(
        					     title.get(i).text()
        					   );
        				   }
        			   }
        		   }
        		}
        	}
        	else
        	{
        		// https://www.genie.co.kr/chart/top200
        		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); 
 			    Elements title=doc.select("table.list-wrap a.title");
 			    Elements singer=doc.select("table.list-wrap a.artist");
 			   switch(menu)
       		  {
       		   case 1 ->{
       			   // 소스 읽기
       			   
       			   for(int i=0;i<title.size();i++)
       			   {
       				   System.out.println((i+1)+"."
       			         +title.get(i).text());
       			   }
       			   
       		   }
       		   case 2 ->{
       			   System.out.print("1~50번 중에 번호 선택:");
       			   int s=scan.nextInt();
       			   String t=title.get(s-1).text();
       			   System.out.println(t);
       			   // https://www.youtube.com/results?search_query=%EC%95%84%EC%9D%B4%EB%B8%8C
       			   String url="https://www.youtube.com/results?search_query="
       					     +URLEncoder.encode(t, "UTF-8");
       			   Document doc2=Jsoup.connect(url).get();
       			   Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
       			   Matcher m=p.matcher(doc2.toString());
       			   String key="";
       			   /*
       			    *   /watch?v=F0B7HDiY-10\u0026list=RDEMpg9XLA5KnAqZ9f0n2ZZQTw\u0026start_radio=1"
       			    */
       			   while(m.find())
       			   {
       				   String ss=m.group();
       				   key=ss.substring(ss.indexOf("=")+1,
       						   ss.indexOf("\""));
       				   break;
       			   }
       			   // 정규식 
       			   Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
       					     +"http://youtube.com/embed/"+key);
       		   }
       		   case 3 ->{
       			   System.out.print("검색어 입력:");
       			   String fd=scan.next();
       			   for(int i=0;i<title.size();i++)
       			   {
       				   String t=title.get(i).text();
       				   if(t.contains(fd))
       				   {
       					   System.out.println(t);
       				   }
       			   }
       		   }
                  case 4 ->{
               	   System.out.print("가수명 입력:");
       			   String fd=scan.next();
       			   for(int i=0;i<title.size();i++)
       			   {
       				   String t=singer.get(i).text();
       				   if(t.contains(fd))
       				   {
       					   System.out.println(
       					     title.get(i).text()
       					   );
       				   }
       			   }
       		   }
       		}
        	}
        	
        }
        
	}

}
