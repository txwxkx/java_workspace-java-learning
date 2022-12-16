package java012_api;

/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */

public class Java118_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
//		int index = sn.indexOf(":");
//		System.out.println("ip:" + sn.substring(0, index));
//		System.out.println("port:" + sn.substring(index + 1));
		
		String[] data = sn.split(":"); //콜론을 기준으로 나눠줄 때 첫번째 데이터를 0번에 저장
		System.out.println("ip:" + data[0]);
		System.out.println("port:" + data[1]);

	}//end main()

}//end class
