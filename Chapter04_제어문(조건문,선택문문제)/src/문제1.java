/*
 *  정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
    판단해보자.
    if(num>=50)
    else
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=(int)(Math.random()*100)+1;
        // 1~100 사이 정수 
        System.out.println("num="+num);
        if(num>=50)
        	System.out.println(num+"는(은) 50이상인 수");
        else
        	System.out.println(num+"는(은) 50미만인 수");
	}

}
