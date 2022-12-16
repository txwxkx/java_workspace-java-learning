package java003_statements;

/*
 * [데이터]
 * 홍길동  90  85  40
 * 이영희 100  35  75
 * 
 * [출력결과]
 * 홍길동  90  85  40  215  71.7
 * 이영희 100  35  75  210  70.0
 */
public class Java045_array {

	public static void main(String[] args) {
		String[] name = {"홍길동", "이영희"};
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } };
		
		int sum;
		double avg;
		
		for(int index = 0; index < jumsu.length; index++) {
			System.out.printf("%8s", name[index]);
			sum = 0;
			for(int col = 0; col < jumsu[index].length; col++) {
				System.out.printf("%4d", jumsu[index][col]);
				sum = sum + jumsu[index][col];
			}
			
			//avg = sum/3.0;
			avg = sum / (double) jumsu[index].length;
			System.out.printf("%4d %.1f\n", sum, avg);
		}
		

	}

}
