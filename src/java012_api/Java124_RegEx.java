package java012_api;

/*
 * 정규화 표현식(Regular Expression)
 * 1. 정규화 표현식(정규식)이란 텍스트 에디터 중에서 원하는 조건(패턴)과 일치하는 문자열을
 * 찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용하여 작성한 문자열을 말한다.
 */
public class Java124_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = ""; //null은 깨끗한 도화지라고 생각.
		
		//a 또는 r이면 '_'로 변경
		for(int i = 0; i<sn.length(); i++) {
			char data = sn.charAt(i);
			if(data=='a' || data=='r') {
				sg += "_";
			} else {
				sg += data; //sg = sg + data;
			}
		}
		
		System.out.println(sg);
		
		System.out.println("==========Regular Expression을 이용한 문자 변경==========");
		//[]대괄호는 or를 의미한다.
		// . : 임의의 문자 하나
		// * : 0개 이상
		
		//sn변수에 저장된 문자열이 a이거나 r이면 "_"로 변경한다.
		System.out.println(sn.replaceAll("[ar]","_"));
		System.out.println(sn);
		
		//sn변수에 저장된 문자열이 a이거나 r로 끝나면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar]")); //*문자가 있어도 되고 없어도 됨. , a이거나 r(or)
		
		//sn변수에 저장된 문자열이 a이거나 r로 시작하면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches("[ar].*"));
		
		//sn변수에 저장된 문자열이 a이거나 r이 포함되어 있으면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar].*"));
		
		String st = "java@@@@korea";
		String sa = st.replaceAll("@{2,3}", "_");
		System.out.println(sa);
		
		sa = st.replaceAll("@{2}", "_");
		System.out.println(sa);
		
		sa = st.replaceAll("@{2,}", "_");
		System.out.println(sa);
		
		String[] line = st.split("@{4}");
		for(int i = 0; i<line.length; i++) {
			System.out.printf("line[%d]=%s\n", i, line[i]);
			
		}
		
		String sp = "java  jsp oracle    mybatis";
		String[] arr = sp.split("\s{1,}");
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
		
	}//end main()

}//end class
