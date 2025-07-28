// 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
public class 문제6 {
  public static void main(String[] args) {
	 int change=(int)(Math.random()*2);//0,1
	 char c=' ';
	 if(change==0)
		 c=(char)((Math.random()*26)+65); // 대문자
	 else
		 c=(char)((Math.random()*26)+97); // 소문자
	 
	 if(c>='A' && c<='Z')
		 System.out.println(c+"는(은) 대문자");
	 else
		 System.out.println(c+"는(은) 소문자");
  }
}
