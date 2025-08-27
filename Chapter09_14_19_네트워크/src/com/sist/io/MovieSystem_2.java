package com.sist.io;
import java.util.*;
import java.io.*;
public class MovieSystem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	List<MovieVO> list=
        			new ArrayList<MovieVO>();
        	FileInputStream fis=
        			new FileInputStream("c:\\javaDev\\movie.txt");
        	BufferedReader in=
        		 new BufferedReader(new InputStreamReader(fis));
        	while(true)
        	{
        		String movie=in.readLine();
        		if(movie==null) break;
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
 			    list.add(vo);
        		
        	}
        	
        	for(MovieVO vo:list)
        	{
        		System.out.println(vo.getMno()+"."
        				+vo.getTitle());
        	}
        }catch(Exception ex) {}
	}

}
