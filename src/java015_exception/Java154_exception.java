package java015_exception;

public class Java154_exception {

	public static void main(String[] args) {
		int[] num = new int[3]; //ArrayIndexOutOfBoundsException 정해놓은 범위 벗어남
		num[0] = 10;
		System.out.println(num[0]);
		
		//예외처리
		try {
			num[4] = 20;
		} catch(ArrayIndexOutOfBoundsException ex) {
			//System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			//ex.printStackTrace();
		}
		
		
		

	}//end main()

}//end class
