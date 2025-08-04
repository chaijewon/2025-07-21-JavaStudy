// 예약일 
public class 배열_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] lotto=new int[6];
        int su=0; // 난수 
        boolean bCheck=false;
        
        for(int i=0;i<lotto.length;i++)
        {
        	bCheck=true;
        	while(bCheck) // 중복횟수 
        	{
        		su=(int)(Math.random()*45)+1;
        		bCheck=false;
        		// 중복 
        		for(int j=0;j<i;j++) 
        		{
        			if(lotto[j]==su)// 중복이면 -> WHILE이동
        			{
        				bCheck=true;
        				break;
        			}
        			
        			
        		}
        	}
        	lotto[i]=su;
        }
        for(int i:lotto)
        {
        	System.out.print(i+" ");
        }
	}

}
