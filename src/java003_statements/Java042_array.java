package java003_statements;
 /*
  * data배열에서 대문자의 갯수를 출력하는 프로그램 구현
  * 
  * [출력결과]
  * 대문자 갯수 : 2
  */
public class Java042_array {

	public static void main(String[] args) {
		char[] data = new char[] {'a', 'b', 'F', 'R', 'a'};
		int cnt = 0; //대문자 갯수를 저장하기 위한 변수
		
//		if(data[0]) >= 'A' && data[0] <='Z' {
//            cnt++;		  	//cnt = cnt + 1;
//		}
//		
//		if(data[1] >= 'A' && data[1] <='Z') {
//			cnt++;
//		}
//		
//		if(data[2] >= 'A' && data[2] <='Z') {
//			cnt++;
//		}
//		
//		if(data[3] >= 'A' && data[3] <='Z') {
//			cnt++;
//		}
//		
//		if(data[4] >= 'A' && data[4] <='Z') {
//			cnt++;
//		}
//		
		for(int i = 0; i < data.length; i++) {
			if(data[i] >= 'A' && data[i] <= 'Z' ) {
				cnt++; // cnt = cnt + 1
			}
		}
		
		System.out.printf("대문자 갯수:%d\n", cnt);
	}

}
