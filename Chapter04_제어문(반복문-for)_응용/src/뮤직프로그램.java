import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 뮤직프로그램 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        for(;;)
        {
        	System.out.println("========== 메뉴 ==========");
        	System.out.println("1. 목록 (TOP200)");
        	System.out.println("2. 검색(곡명)");
        	System.out.println("3. 검색(가수명)");
        	System.out.println("4. 상승이 많은 곡");
        	System.out.println("5. 하강이 많은 곡");
        	System.out.println("6. 종료");
        	System.out.println("=========================");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu<1 || menu>6)
        	{
        		System.out.println("존재하지 않는 메뉴입니다");
        		continue; // 다시 메뉴 선택 => 처음으로 다시 돌아간다
        	}
        	
        	if(menu==6)
        	{
        		System.out.println("프로그램을 종료합니다");
        		break; // 프로그램 종료 (for종료)
        	}
        	else if(menu==1)
        	{
        		System.out.println("***** 뮤직Top 200 *****");
        		int k=1;
        		for(int i=1;i<=4;i++)
        		{
        			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250730&hh=17&rtm=Y&pg="+i).get();
        			Elements title=doc.select("table.list-wrap td.info a.title");
        			// 태그명 => class . id => #
        			for(int j=0;j<=title.size();j++)
        			{
        			  try{
        				    System.out.println(k+"."+title.get(j).text());
        			     	k++;
        			    }catch(Exception e) {}
        			}
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.println("***** 노래명으로 검색 *****");
        	}
        	else if(menu==3)
        	{
        		System.out.println("***** 가수명으로 검색 *****");
        	}
        	else if(menu==4)
        	{
        		System.out.println("***** 상승이 가장 많은 곡 *****");
        	}
        	else if(menu==5)
        	{
        		System.out.println("***** 하강이 가장 많은 곡 *****");
        	}
        	
        }
	}

}
