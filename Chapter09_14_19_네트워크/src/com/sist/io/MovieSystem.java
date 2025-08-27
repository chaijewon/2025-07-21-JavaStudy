package com.sist.io;
import java.util.*;
import java.io.*;
public class MovieSystem {
   private static ArrayList<MovieVO> mList=
		      new ArrayList<MovieVO>();
   static 
   {
	   try
	   {
		   FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		   StringBuffer sb=new StringBuffer();
		   int i=0;
		   /*
		    *    int read(char[] buffer,int offst,int len)
		    *    ---- 읽은 글자수 
		    *    int read()
		    *    ---- 문자
		    */
		   while((i=fr.read())!=-1)
		   {
			   sb.append((char)i);
		   }
		   fr.close();
		   
		   String temp=sb.toString();
		   String[] movies=temp.split("\n");
		   for(String movie:movies)
		   {
			   String[] mm=movie.split("\\|");
			   MovieVO vo=new MovieVO();
			   vo.setMno(Integer.parseInt(mm[0]));
			   vo.setTitle(mm[1]);
			   vo.setGenre(mm[2]);
			   vo.setPoster(mm[3]);
			   vo.setActor(mm[4]);
			   vo.setRegdate(mm[5]);
			   vo.setGrade(mm[6]);
			   vo.setDirector(mm[7]);
			   mList.add(vo);
		   }
	   }catch(Exception ex) {}
   }
   
   // 기능 설정 
   public List<MovieVO> movieListData(int page)
   {
	   List<MovieVO> list=
			   new ArrayList<MovieVO>();
	   final int ROWSIZE=12;
	   int start=(page*ROWSIZE)-ROWSIZE;
	   int end=page*ROWSIZE;
	   int total=movieTotalPage();
	   if(end>total)
		   end=mList.size();
	   /*
	    *   1page 0~9
	    *   2page 10~19
	    *   ==> 오라클 : 인라인뷰 
	    */
	   list=mList.subList(start, end);
	   return list;
   }
   public MovieVO movieDetailData(int mno)
   {
//	   MovieVO vo=new MovieVO();
//	   for(MovieVO m:mList)
//	   {
//		   if(mno==m.getMno())
//		   {
//			   vo=m;
//			   break;
//		   }
//	   }
	   return mList.get(mno-1);
   }
   // 검색 
   public List<MovieVO> movieFindData(String title)
   {
	   List<MovieVO> list=
			   new ArrayList<MovieVO>();
	   for(MovieVO m:mList)
	   {
		   if(m.getTitle().contains(title))
		   {
			   list.add(m);
		   }
	   }
	   return list;
   }
   // 총페이지 
   public int movieTotalPage()
   {
	   return (int)(Math.ceil(mList.size()/12.0));
   }
}
