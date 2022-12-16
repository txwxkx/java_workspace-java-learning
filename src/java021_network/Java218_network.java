package java021_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 네트워크 : 두 대 이상의 컴퓨터를 케이블로 연결하여 구성하는 기능이다.
 * 클라언트/서버 : 컴퓨터 간의 관계를 역할로 구분하는 개념이다.
 * 서버 : 서비스를 제공하는 컴퓨터이다.
 * 서비스 : 서버가 클라이언트로 부터 요청 받은 작업을 처리하여 그 결과를 제공하는 개념이다.
 * 네트워크 관련된 정보 : java.net.*
 * InetAddress : ip주소를 다루기 위한 클래스이다.
 */

public class Java218_network {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("daum.net");
			System.out.println(ip.getHostAddress()); //211.249.220.24
			System.out.println(ip.getHostName()); //daum.net
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
			
	}//end main()

}//end class
