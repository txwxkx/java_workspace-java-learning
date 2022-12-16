package java013_api;

import java.util.StringTokenizer;

/*
 * java.lang.String split("구분자")  split(String regex)
 * java.util.StringTokenizer("문자열","구분자");   String delim
 */
public class Java132_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer("문자열","구분자");
		//문자열의 구분자가 공백일때는 2번째 인자값은 생략 할 수 있다.
		//StringTokenizer st = new StringTokenizer("java_jsp", "_");
		StringTokenizer st = new StringTokenizer("java jsp");
			System.out.println(st.countTokens());	//2
			System.out.println(st.nextToken());		//java
			System.out.println(st.nextToken());		//jsp
			//Exception in thread "main" java.util.NoSuchElementException
			//System.out.println(st.nextToken());
			System.out.println(st.countTokens());
			
			st = new StringTokenizer("java_jsp", "_");
			int count = st.countTokens();
			for(int i = 0; i<count; i++) {
				System.out.println(st.nextToken());
			}
			

			st = new StringTokenizer("java_jsp", "_");
			//메모리에 저장된 토큰이 있으면 true, 없으면 false을 리턴한다.
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
			
	}//end main()

}//end class
