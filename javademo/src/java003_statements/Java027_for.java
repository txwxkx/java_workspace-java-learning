package java003_statements;

/*
 * i=1
 * i=2
 * i=3
 * i=4
 * i=5
 * sum=15
 */
public class Java027_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상때 까지만 반복문을 수행
		
		int i;
		int sum = 0;

		for (i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d\n", i);
			if (sum >= 15) {
				break; // if X, for O
			}
		}
		System.out.printf("sum=%d\n", sum);
	}
}
