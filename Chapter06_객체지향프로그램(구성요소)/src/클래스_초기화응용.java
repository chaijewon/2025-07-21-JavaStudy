import java.io.*;
import java.util.*;
// 사용자 정의 데이터형 => 영화 관련 변수를 모아서 관리 
/*
 *   1|
 *   쇼생크 탈출|
 *   드라마|
 *   https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 *   |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 *   |2016 .02.24 재개봉, 1995 .01.28 개봉
 *   |15세 관람가
 *   |프랭크 다라본트

 */
// 영화 데이터형 => 사용자 정의 데이터형 => 프로그램에 맞게 개발자가 제작 
/*
 *   1. 데이터형 클래스 => 변수만 설정 
 *   2. 액션 클래스 => 기능 처리 
 *      => 목록 / 상세보기 / 예약하기 / 검색 ...
 */
class Movie
{
	int mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}
class MovieSystem
{
	// 공유 => 데이터베이스 : 공유된 데이터 
	static Movie[] movies=new Movie[1938];
	
	// 자동 수행 / 상속 예외 / 클래스안에서 구현을 이용한 초기화 
	static 
	{
		// 파일 입출력은 반드시 예외 처리해서 사용 
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			// 읽은 파일을 배열에 저장 
			String movie=sb.toString();
			
			// 1. 문장별로 저장 => \n
			String[] temp=movie.split("\n");
			i=0;
			for(String m:temp)
			{
				Movie mm=new Movie();
				String[] ss=m.split("\\|");
				// | 사용중 (정규식) => 있는 그대로 \\|
				mm.mno=Integer.parseInt(ss[0]);
				// 문자열을 정수형으로 변경 
				mm.title=ss[1];
				mm.genre=ss[2];
				mm.poster=ss[3];
				mm.actor=ss[4];
				mm.regdate=ss[5];
				mm.grade=ss[6];
				mm.director=ss[7];
				movies[i]=mm;
				i++;
			}
			
			
			
		}catch(Exception ex){}
	}
	// 기능 
	
}
public class 클래스_초기화응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.println("====== 메뉴 ======");
        	System.out.println("1. 목록");
        	System.out.println("2. 상세보기");
        	System.out.println("3. 검색(제목)");
        	System.out.println("4. 검색(출연)");
        	System.out.println("5. 검색(장르)");
        	System.out.println("6. 종료");
        	System.out.println("=================");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==6)
        	{
        		System.out.println("프로그램 종료!!");
        		break;
        	}
        	else if(menu==1)
        	{
        		int i=0;
        		for(Movie m:MovieSystem.movies)
        		{
        			System.out.println((i+1)+"."+m.title);
        			i++;
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.print("1~"+MovieSystem.movies.length+"사이의 영화번호 입력:");
        		int mno=scan.nextInt();
        		Movie m=MovieSystem.movies[mno-1];
        		System.out.println("***** 영화 정보 *****");
        		System.out.println("영화번호:"+m.mno);
        		System.out.println("영화제목:"+m.title);
        		System.out.println("영화출현:"+m.actor);
        		System.out.println("영화장르:"+m.genre);
        		System.out.println("영화등급:"+m.grade);
        		System.out.println("영화감독:"+m.director);
        		
        	}
        	else if(menu==3)
        	{
        		System.out.print("검색어 입력:");
        		String fd=scan.next();
        		for(Movie m:MovieSystem.movies)
        		{
        			if(m.title.contains(fd))
        			{
        			  System.out.println(m.title);
        			}
        		}
        	}
        }
	}

}
