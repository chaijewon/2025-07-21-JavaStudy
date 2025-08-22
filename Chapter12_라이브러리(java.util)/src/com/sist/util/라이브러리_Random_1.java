package com.sist.util;
/*
 *   Random => java.util 
 *   임의의 정수를 추출 
 *   
 *   public int nextInt(100) => 0~99 
 */
import java.util.*;
public class 라이브러리_Random_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
//		int rand=r.nextInt(100)+1;
//		System.out.println(rand);
        int[] lotto=new int[6];
        for(int i=0;i<lotto.length;i++)
        {
        	lotto[i]=r.nextInt(45)+1;
        	for(int j=0;j<i;j++)
        	{
        		if(lotto[i]==lotto[j])
        		{
        			i--;
        			break;
        		}
        	}
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
		
	}

}
