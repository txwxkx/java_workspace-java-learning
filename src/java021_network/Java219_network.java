package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

//https://programming119.tistory.com/194

/*
 * URI (Uniform Resource Identifier)
 * 인터넷 자원을 나타내는 고유 식별자이다.
 */

public class Java219_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.daum.net/moviedb/main?movieId=62708");
			System.out.println("getHost():" + url.getHost()); //movie.daum.net
			System.out.println("getProtocol():" + url.getProtocol()); //https
			System.out.println("getPort():" + url.getPort()); //-1
			System.out.println("getPath():" + url.getPath()); ///moviedb/main
			System.out.println("getQuery():" + url.getQuery()); //movieId=62708
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}//end main()

}//end class
