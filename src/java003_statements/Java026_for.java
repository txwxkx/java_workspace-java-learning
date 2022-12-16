package java003_statements;

/*
 * i=1 sum=1
 * i=2 sum=3
 * i=3 sum=6
 * i=4 sum=10
 * i=5 sum=15
 */

public class Java026_for {
	
	public static void main(String[] args) {
		//누적된 값이 최초로 15이상때 까지만 반복문을 수행

		int sum = 0;
		int i;
	
		for(i=1; ;i++) {
			sum = sum + i;
			System.out.printf("i=%d sum=%d\n", i, sum);
			if(sum>=15) {
				break; //if X, for O			
			}
		}
	}
}