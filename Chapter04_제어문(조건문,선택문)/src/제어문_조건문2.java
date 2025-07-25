
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 알파벳 => 대문자 / 소문자 
		// 컴퓨터가 임의의로 알파벳 추출 
		int change=(int)(Math.random()*2);
		// 0,1
		char c=' '; // 초기화 
		if(change==0)
		 c=(char)((Math.random()*26)+65);
		 // 0~25 => 0+65 1+65 2+65
		if(change==1)
		 c=(char)((Math.random()*26)+97);
		
		//System.out.println("c="+c);
		System.out.println("====== 결과값 ======");
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		if(c>='a' && c<='z')
			System.out.println(c+"는(은) 소문자입니다");
	}

}
