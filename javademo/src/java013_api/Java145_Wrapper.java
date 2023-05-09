package java013_api;

public class Java145_Wrapper {

	public static void main(String[] args) {
		char data = 'a'; //a를 대문자로 구현
		
		if(data>='a' && data<='z') {
			System.out.println((char)(data -32));
		}
		
		System.out.println(Character.toUpperCase(data));
		System.out.println(Character.toLowerCase(data));
		System.out.println(Character.isUpperCase(data));
		System.out.println(Character.isLowerCase(data));
		System.out.println(Character.isAlphabetic(data));
		System.out.println(Character.isDigit(data));
		System.out.println(Character.toString(data));

	}//end main()

}//end class
