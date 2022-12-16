package java003_statements;

public class Java038_array {

	public static void main(String[] args) {
		//javascript
		//let myArray = [1, 2, 3, "홍길동", "아무개"];
		
		//java
		int[] data = {10, 20, 30};
		//초기값을 할당하면서 배열생성 할 때에는 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] {90, 80, 40};
		
		for(int i =0; i < data.length; i++) {
			System.out.printf("data[%d]=%d\n", i, data[i]);
		}
		
		System.out.println(data[2]);
		System.out.println(data[1]);
		System.out.println(data[0]);
		
		for(int i = 2; i >= 0; i--) {
			System.out.printf("data[%d]=%d\n", i, data[i]);
		}

	}

}
