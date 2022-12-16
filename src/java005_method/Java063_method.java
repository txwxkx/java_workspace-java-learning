package java005_method;
/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 */

public class Java063_method {

	public static void main(String[] args) {
		char[] arr = {'j','a','v','a',' ','t','e','s','t'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);

	}//end main()
	
	public static char[] reverse(char[] data) {
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		char[] alpa = new char[data.length];
		
//		alpa[0] = data[8];
//		alpa[1] = data[7];
//		//////////////
//		alpa[8] = data[0];
		
		for(int i = 0; i<alpa.length; i++) {
			alpa[i] = data[data.length-1-i];
		}
		
		return alpa;
	}//end reverse()

}//end class
