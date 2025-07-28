/*
 *    Math.random()
 *    ------------- 모든 메소드(기능)은 결과값을 넘겨준다 
 *        |
 *     0.0~0.99 => double(X) => int(O)
 *     
 *     (int)(Math.random()*100)+1
 *            0.0~0.99
 *            0.0~99.0 => 0~99
 *     --------------------- 0
 *     (int)(Math.random()*10)+1 => 1~10
 *     (char)(Math.random()*26)
 *            0~25 + 65 => 65~90
 *     
 *     (int)(Math.random()*45)+1  1~45
 */
public class 제어문_4 {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
        int a=(int)(Math.random()*5)+1;
        
        if(a==1)
        	System.out.println("난수 1 발생"); // 종료
            //  |
        else if(a==2)
        	System.out.println("난수 2 발생"); // 종료
        //난수 => 임의로 추출 
        //       |
        else if(a==3)
        	System.out.println("난수 3 발생");
        else if(a==4)
        	System.out.println("난수 4 발생");
        else if(a==5)
        	System.out.println("난수 5 발생");
        // 조건에 맞는 if문 한개만 수행 
        //int b=(int)(Math.random()*45)+1;
        //int c=(int)(Math.random()*45)+1;
        //int d=(int)(Math.random()*45)+1;
        //int e=(int)(Math.random()*45)+1;
        //int f=(int)(Math.random()*45)+1;
        
        //System.err.println("===== 로또 번호 =====");
        // 단점 : 중복된 수가 발생할 수 있다 
        //System.out.print(a+" ");
        //Thread.sleep(1000);
        //System.out.print(b+" ");
        //Thread.sleep(1000);
        //System.out.print(c+" ");
        //Thread.sleep(1000);
        //System.out.print(d+" ");
        //Thread.sleep(1000);
        //System.out.print(e+" ");
        //Thread.sleep(1000);
        //System.out.print(f);
        
        
	}

}







