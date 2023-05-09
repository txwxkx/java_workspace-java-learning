package java005_method;

public class Java054_method {

	public static void main(String[] args) { //1
		int year = 2012; //2
		boolean result = isLeapYear(year); //3
				
		if(result) {
			System.out.printf("%d년도가 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년도가 평년입니다.\n", year);
		}
		
		

	}//end main()
	
	public static boolean isLeapYear(int year) {
		//년도가 윤년이면 true, 평년이면 false을 리턴하는 프로그램 구현
		
//		boolean chk;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			chk = true;
			return true;
		} else {
//			chk = false;	
			return false;
		}
//		return chk;
		
	}//end isLeapYear

}//end class
