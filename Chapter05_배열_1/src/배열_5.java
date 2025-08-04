// 10개의 임의의 정수 저장 ==> 총합 / 평균 
// 전체 데이터 for => 요청값 추출 => if => 제어문 
// 데이터저장 => 제어 (제어문) 
public class 배열_5 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열선언 
		int[] arr=new int[10];
		// 배열 초기화 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		// 배열의 총합 / 평균 
		int sum=0;
		// 81 19 37 49 35 37 46 30 60 46
		// for(받는 변수 : 배열명)
		for(int i:arr)// for-each : 실제 배열에 저장된 값을 순차적으로 읽는다
		{
			sum+=i;
		}
		System.out.println("\n총합:"+sum);
		System.out.printf("평균:%.2f\n",sum/10.0);
	}

}
