package java001_basic;

public class Java007_operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.println(a/b); //  int/int => int  3
		System.out.println((double)a/b); // double/int => double 3.333... 
		System.out.println((double)(a/b)); // (double)(int/int) => double 3.0		
	}//end main()

}//end class
