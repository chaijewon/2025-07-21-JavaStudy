// 문자저장 
// 정수/문자열/실수 
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[15];
        int cnt=0,cnt1=0;
        // 변수의 위치 => 누적 / 갯수 => for밖에 설정 
        for(int i=0;i<alpha.length;i++)
        {
        	
        	int a=(int)(Math.random()*2);
        	if(a==0)
        		alpha[i]=(char)((Math.random()*26)+65);
        	else
        		alpha[i]=(char)((Math.random()*26)+97);
        	
        	System.out.print(alpha[i]+" ");
        	
        	if(alpha[i]>='A' && alpha[i]<='Z')
        		cnt++;
        	else
        		cnt1++;
        }
        
        System.out.println("\n대문자:"+cnt);
        System.out.println("소문자:"+cnt1);
	}

}
