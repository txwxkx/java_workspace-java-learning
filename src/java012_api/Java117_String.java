package java012_api;

/*
 * 배열 크기 : length //키워드
 * 문자열 크기 : length( ) //메소드
 */
public class Java117_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이:" + str.length()); //14
		System.out.println("대문자:" + str.toUpperCase()); //KOREA, JSP, JAVA
		System.out.println("소문자:" + str.toLowerCase()); //korea,jsp,java
		System.out.println("문자:" + str.charAt(0)); //K
		System.out.println("인덱스:" + str.indexOf('a')); //4
		System.out.println("인덱스:" + str.indexOf(97)); //4
		System.out.println("인덱스:" + str.indexOf('a', 5)); //11
		System.out.println("인덱스:" + str.indexOf("jsp")); //6
		System.out.println("인덱스:" + str.lastIndexOf('a')); //13    lastIndexOf('a') : 뒤에서부터 a를 찾아라.
		System.out.println("범위:" + str.substring(5)); //,jsp,java    5인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위:" + str.substring(2, 8)); //REa,js    2인덱스부터 8미만까지 문자열 리턴(8은 인덱스 번호)
		
		//메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		System.out.println(arr.length); //3
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]); //arr[0]=KoREa, arr[1]=jsp, arr[2]=java
		}
		
		int x = 10;
		int y = 20;
		System.out.printf("%d + %d = %d\n", x, y, x + y); //10 + 20 = 30
		
		//String <= int
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s + %s = %s\n", s1, s2, s1 + s2); //10 + 20 = 1020
		
		char[] data = {'1', '2', '3', '4', '5', '6'};
		String s3 = String.valueOf(data);
		System.out.println(s3); //123456
		
		String s4 = String.valueOf(data, 1, 3); //배열에서 
		System.out.println(s4); //234
		
	}//end main()

}//end class
