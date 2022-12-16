package java003_statements;

/*
 * [출력결과]
 * 홀수 : 3
 * 짝수 : 42
 */
public class Java040_array {

	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int odd = 0; //홀수
		int even = 0; //짝수\
		
//		even = even + num[0];
//		odd = odd + num[1];
//		even = even + num[2];
//		even = even + num[3];
		
		for(int i = 0; i < num.length; i++) {
			//num[i]의 값이 홀수이면
			if(num[i] % 2 == 1) {
				odd = odd + num[i];
			} else {
				even = even + num[i];
			}
		}
		
		System.out.printf("홀수:%d\n", odd);
		System.out.printf("짝수:%d\n", even);

	}

}
