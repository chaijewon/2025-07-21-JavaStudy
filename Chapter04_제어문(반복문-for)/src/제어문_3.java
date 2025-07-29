// 변수의 사용범위 => 지역변수 : 메모리 자체에서 생성/소멸 
// {} 안에서만 사용이 가능 
public class 제어문_3 {
    // 다른 클래스에서 사용이 가능한 영역 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 단점 => 다른 클래스에서 사용이 불가능 
		{
			int a=10;
			{
				int b=20;
				{
					int c=30;
					// a,b,c
				}
				// a,b
			}
			//a 
		}
		// System.out.println(a);
		// i는 루프 => i는 사용금지 권장 => m/n a/b 
        for(int i=0;i<26;i++) // i j
        {
        	char c='A';// 생성 = 소멸... 26번 
        	System.out.print(c++);
        }
	}

}
