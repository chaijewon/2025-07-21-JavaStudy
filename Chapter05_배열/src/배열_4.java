/*
 *   인덱스 : 0번 부터 => 값 지정의 위치 구분 
 *          -------- 반복문 사용이 편리 
 *   => 반복문 
 *      : 데이터값 초기화 , 값 변경시 => 일반 for 
 *      : 출력만 처리 => for-each 
 *                    --------- 웹 데이터를 브라우저에 출력 
 *        map => js(for-each)
 */
// => 초기화 
// => 입력 / 임의의 추출 => 중요 : 저장을 몇개  new int[5]
// 검색 => 갯수 => 배열 생성 
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 초기화 => int 
		int[] arr=new int[10];
		int max=1;
		int min=100;
		for(int i=0;i<arr.length;i++)
		{
			// 갯수보다 인덱스가 1개 작다 
			// 배열의 크기를 초과하면 오류 발생
			// ArrayIndexOutOfBoundsException 
			arr[i]=(int)(Math.random()*100)+1;
			//System.out.print(arr[i]+" ");
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("\n===== 결과 =====");
		for(int i:arr)// 출력 형식 
		{
			// i는 인덱스번호가 아니고 => 실제 저장된 값 읽기 
			// 데이터가 없는 경우에 자동으로 종료 
			System.out.print(i+" ");
		}
		System.out.println("\n최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
