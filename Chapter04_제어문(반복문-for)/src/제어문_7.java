
public class 제어문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int com=(int)(Math.random()*100)+1;
        int count=0;
        for(;;)
        {
        	int user=(int)(Math.random()*100)+1;
        	count++;
        	if(com>user)
        	{
        		System.out.println("입력값 UP");
        	}
        	else if(com<user)
        	{
        		System.out.println("입력값 DOWN");
        	}
        	else
        	{
        		System.err.println("Game Over!!");
        		System.out.println("입력횟수:"+count);
        		break;
        	}
        }
	}

}
