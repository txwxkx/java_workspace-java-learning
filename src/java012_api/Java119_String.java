package java012_api;

/*
 * [출력결과]
 * aerok
 * korea
 */
public class Java119_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);
		
	}//end main()
	
	public static char[] display(String alpa) {
		// alpa 매개변수에 저장된 문자열을 reverse한 후 반환하는 프로그램을 구현하세요.
		char[] arr = new char[alpa.length()];
//		arr[0] = alpa.charAt(4);	//alpa.charAt(arr.length -1 -0)
//		arr[1] = alpa.charAt(3);	//alpa.charAt(arr.length -1 -1)
//		arr[2] = alpa.charAt(2);	//alpa.charAt(arr.length -1 -2)
//		arr[3] = alpa.charAt(1);	//alpa.charAt(arr.length -1 -3)
//		arr[4] = alpa.charAt(0);    //alpa.charAt(arr.length -1 -4)
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = alpa.charAt(arr.length - 1 - i);
		}
		
		return arr;
	}//end display()

}//end class
