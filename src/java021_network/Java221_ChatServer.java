package java021_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java221_ChatServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(7777);
			while(true) {
				Socket client = server.accept();
				System.out.printf("client가 %s로 접속\n", client.getInetAddress().getHostAddress());
			
				Java221_ChatHandler handle = new Java221_ChatHandler(client);
				handle.iniStart(); //클라이언트 당 스레드가 하나씩 생성
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//end main()

}//end class
