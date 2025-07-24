// 비트 이동 연산자 
// << 왼쪽 , >> 오른쪽 이동 
/*
 *   4<<2 == 16  ==> 0을 두개 붙인다 
 *   x<<y == x*2^y 
 *   4>>2 == 1   ==> 0을 두개 제거 
 *   x>>y == x/2^y  => 4/4 = 1
 *   
 *   10000
 *   
 * 1101100 
 *    8 4
 *  32
 * 64    ==> 108
 *   
 *   27<<2  
 *   11011 
 *   27>>2
 *   11011
 *      --
 *     110 => 6
 *     
 *     6 => 110
 *     6<<3 110000
 *          32 + 16 => 48
 *     6*2^3
 *       --- 8  => 6*8 = 48
 *       
 *     6>>2 110 ==> 1 => 1
 *     
 *     x>>y  x<<y 
 *        -     - 뒤에 y만큼 0을 채워라 
 *        뒤에서 y만큼 버린다 
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Integer.toBinaryString(27));
        System.out.println(6<<2);
        System.out.println(6>>2);
	}

}
