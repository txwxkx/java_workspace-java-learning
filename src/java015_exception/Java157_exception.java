package java015_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java157_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[2];
		int sum = 0;
		
		for(int i = 0; i<data.length; i++) {
			data[i] = inputData(sc, i);
			sum += data[i];
		}
		
		System.out.println("배열 요소 총합" + sum);

	}//end main()
	
	public static int inputData(Scanner sc, int index) {
		int num;
		while(true) {
			try {
				System.out.printf("%d번째 정수를 입력:", index + 1);
				num = sc.nextInt();                  //보통 1번째부터 시작, 인덱스는 0부터
				break;
			} catch (InputMismatchException ex) {
				System.out.println("정수를 입력하세요.");
				sc.next();
				//System.out.println("error:" + sc.next()); //buffer에 임시로 저장해서 불러옴
			}
		}	
		
		return num; //끝나는 시점을 알 수 없다. => 오류
		
	}//end inputData()

}//end class
