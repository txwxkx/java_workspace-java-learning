package java003_statements;

//keyword(예약어) : 프로그램에서 의미를 부여해놓은 단어
/*
 * 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */
public class Java030_for {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			//3의 배수가 아니면
//			if(i%3 != 0) {
//				System.out.println(i);
//			}
			
			//3의 배수이면
			if(i%3==0) {
				continue; 
				//무조건 for문의 증감식으로 이동
				//반복문에서 continue를 실행하면 조건식으로 이동한다.
				//for문에서 continue를 실행하면 증감식으로 이동한다.
			}
			System.out.println(i);
		}
		

	}

}
