/*
 *  1####
 *  #2###
 *  ##3##
 *  ###4#
 *  ####5
 *  
 *   for => 주로 if 
 *   --------------
 *   
 */
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i==j)
        			System.out.print(j);
        		else
        			System.out.print("#");
        	}
        	System.out.println();
        }
	}

}
