package java005_method;

public class Java061_method {

	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);
	}//end main()
	
	public static void process(int num) {
		// num변수의 값이 0보다 크면 "양수", 0이면 "0", 0보다 작으면 "음수"로 출력하는 메소드 구현
		
		if(num>0) {
			System.out.printf("%d은(는) 양수입니다.\n", num);
		} else if(num==0) {
			System.out.printf("%d은(는) 0입니다.\n", num);
		} else if(num<0) {
			System.out.printf("%d은(는) 음수입니다.\n", num);
		}
	}//end process()

}//end class
