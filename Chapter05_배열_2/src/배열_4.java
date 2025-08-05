import java.util.Arrays;
/*
 *     33, 31, 73, 36, 4
 *     --  --
 *     31  33
 *     --      --
 *     31      73
 *     --          --
 *     31          36
 *     --             --
 *     4              31  ---- for 1 (1 round)
 *     ---------------------
 *     4  33  73  36 31
 *        --  --
 *        33  73
 *        --      --
 *        33      36
 *        --         --
 *        31         33    --- for 2 (2 round)
 *    ----------------------
 *     4  31  73  36 33
 *            --  --
 *            36  73
 *            --     --
 *            33     36    --- for 3 (3 round)
 *    ----------------------
 *     4  31  33  73 36
 *                -- --
 *                36 73    --- for 4 (4 round)
 *    ----------------------
 *     4  31  33  36 73
 *    
 *    => 5 - 4
 *    i j
 *    1 4 > 5 
 *    2 3 > 5
 *    3 2 > 5
 *    4 1 > 5  ----> i+j=5 => j=5-i
 *     
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=new int[5];
        // 초기값 
        for(int i=0;i<com.length;i++)
        {
        	com[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("===== 정렬 전:");
        for(int i:com)
        {
        	System.out.print(i+" ");
        }
        System.out.println("\n===== 정렬 후:");
//        for(int i=0;i<com.length-1;i++)
//        {
//        	for(int j=i;j<com.length;j++)
//        	{
//        		if(com[i]<com[j])// if(com[i]>com[j])
//        		{
//        		  int temp=com[i];
//        		  com[i]=com[j];
//        		  com[j]=temp;
//        		}
//        	}
//        }
        Arrays.sort(com);
        for(int i=com.length-1;i>=0;i--)
        {
        	System.out.print(com[i]+" ");
        }
	}

}
