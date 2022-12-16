package java003_statements;

public class Java043_array {

	public static void main(String[] args) {
		//2차원 배열
		
		//3행 2열의 2차원 배열
		int[][] num = new int[3][2];
		System.out.printf("num[%d][%d]=%d\t", 0, 0, num[0][0]); //0행 0열
		System.out.printf("num[%d][%d]=%d\n", 0, 1, num[0][1]); //0행 0열
		
		System.out.printf("num[%d][%d]=%d\t", 1, 0, num[1][0]); //1행 0열
		System.out.printf("num[%d][%d]=%d\n", 1, 1, num[1][1]); //1행 1열
		
		System.out.printf("num[%d][%d]=%d\t", 2, 0, num[2][0]); //2행 0열
		System.out.printf("num[%d][%d]=%d\n", 2, 1, num[2][1]); //2행 1열
		
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;
		
		//length
		for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d]=%d\t", row, col, num[row][col]); 
	
			}		
			System.out.println();			
		}
		System.out.println(num.length); //2차원 배열에서는 행의 크기를 리턴한다.
		System.out.println(num[0].length); //2차원 배열에서는 0행의 열의 크기를 리턴한다.
		
	}
	
}
