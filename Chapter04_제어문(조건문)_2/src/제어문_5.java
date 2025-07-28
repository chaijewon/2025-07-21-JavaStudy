// 빈도수 구하기 => 선택문  
public class 제어문_5 {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count_1=0;
        int count_2=0;
        
        int change=(int)(Math.random()*2);
        // 0,1
        // 지역변수 {} => 사용범위가 {안에서만 사용이 가능}
        char c=' '; // main종료시까지 사용이 가능 
        if(change==0)
        {
        	c=(char)((Math.random()*26)+65);
        }
        else
        {
        	c=(char)((Math.random()*26)+97);
        }
        
        //---------------------------------
        if(c>='A' && c<='Z')
        	count_1++;
        else
        	count_2++;
        
        change=(int)(Math.random()*2);
        // 0,1
        // 지역변수 {} => 사용범위가 {안에서만 사용이 가능}
        c=' '; // main종료시까지 사용이 가능 
        if(change==0)
        {
        	c=(char)((Math.random()*26)+65);
        }
        else
        {
        	c=(char)((Math.random()*26)+97);
        }
        
        //-------------------
        if(c>='A' && c<='Z')
        	count_1++;
        else
        	count_2++;
        
        
        change=(int)(Math.random()*2);
        // 0,1
        // 지역변수 {} => 사용범위가 {안에서만 사용이 가능}
        c=' '; // main종료시까지 사용이 가능 
        if(change==0)
        {
        	c=(char)((Math.random()*26)+65);
        }
        else
        {
        	c=(char)((Math.random()*26)+97);
        }
        //-----
        if(c>='A' && c<='Z')
        	count_1++;
        else
        	count_2++;
        
        change=(int)(Math.random()*2);
        // 0,1
        // 지역변수 {} => 사용범위가 {안에서만 사용이 가능}
        c=' '; // main종료시까지 사용이 가능 
        if(change==0)
        {
        	c=(char)((Math.random()*26)+65);
        }
        else
        {
        	c=(char)((Math.random()*26)+97);
        }
        // ----
        if(c>='A' && c<='Z')
        	count_1++;
        else
        	count_2++;
        
        change=(int)(Math.random()*2);
        // 0,1
        // 지역변수 {} => 사용범위가 {안에서만 사용이 가능}
        c=' '; // main종료시까지 사용이 가능 
        if(change==0)
        {
        	c=(char)((Math.random()*26)+65);
        }
        else
        {
        	c=(char)((Math.random()*26)+97);
        }
        
        if(c>='A' && c<='Z')
        	count_1++;
        else
        	count_2++;
        
        System.out.println("대문자:"+count_1);
        System.out.println("소문자:"+count_2);
        
	}

}
