package java022_debug;

/*
bug :  어떤 의도하지 않는  문제가 발생한 오류
debug : bug을 찾아 수정하는 작업
debugging : bug을 원하는 대로 실행이 되도록 작업하는 하는 과정
debugger : debugging을 할때 사용하는 도구

디버깅 종류
1. 출력문을 이용한 디버깅 
2. 디버깅 툴을 이용한 디버깅

Step Into(F5) : 메소드로 들어감
Step Over(F6) : 한 문장이 실행
Step Return(F7) : 메소드를 빠져나옴
Resume (F8) : 다음 브레이크포인트(breakpoint)으로 이동한 후
			  더 이상 브레이크포인트가 없으면 시스템을 종료 함.

*/

public class DebugTest01 {

	public static void main(String[] args) {
		int sum = 0;
		
		System.out.println("+++++++++");
		System.out.println("---------");
		System.out.println("*********");
		System.out.println("$$$$$$$$$");
		for(int i = 0; i < 5; i++) {
			System.out.printf("i=%d\n", i);
			sum = sum + count(i);
		}		
		
	}//end main()
	
	public static int count(int index) {
		int[] num = new int[] {1, 5, 2, 3, 4};
		return num[index];
		
	}//end count()

}//end class
