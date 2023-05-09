package java005_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data = new char[] {'a','b','c'};
		System.out.println(data);
		System.out.printf("%s\n", data); //[C@28f67ac7
		System.out.println("data=" + data); //data=[C@28f67ac7
		
		int[] num = new int[] {1,2,3};
		System.out.println(num); //[I@256216b3
	}//end main()

}//end class
