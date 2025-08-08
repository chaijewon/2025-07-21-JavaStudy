/*
 *   1|
 *   쇼생크 탈출|
 *   드라마|
 *   https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 *   팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 *   2016 .02.24 재개봉, 1995 .01.28 개봉|
 *   15세 관람가|
 *   프랭크 다라본트
 */
// 영화 한개의 정보를 모아서 관리  ==> new 메모리 공간을 설정 
import java.util.*;
import java.io.*;
class Movie{
	int mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String dorector;
}
public class 클래스_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Movie[] movies=new Movie[1938];
        // 주소 => null
        // int[] arr=new int[10]
        // 데이터형으로 인식 
        File file=new File("c:\\javaDev\\movie.txt");
        StringBuffer sb=new StringBuffer();
        int i=0; // 한글자 받는 변수 
        FileReader fr=new FileReader(file);
        while((i=fr.read())!=-1)
        {
        	//-1 EOF
        	//System.out.print((char)i);
        	sb.append((char)i);
        }
        fr.close();
        
        String movie=sb.toString();
        
        // 분리 
        String[] mo=movie.split("\n");
        i=0;
        for(String m:mo)
        {
        	String[] mm=m.split("\\|");
        	movies[i]=new Movie();
        	movies[i].title=mm[1];
        	i++;
        }
        for(i=0;i<movies.length;i++)
        {
        	System.out.println((i+1)+"."+movies[i].title);
        }
        
        
	}

}
