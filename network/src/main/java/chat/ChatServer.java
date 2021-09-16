package chat;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	private static final int PORT = 6000;
	
	public static void main(String[] args) {
		// 1. 서버 소겟 생성
		ServerSocket serverSocket = new ServerSocket();
					
		// 2. 바인딩
		String hostAddress = InetAddress.getLocalHost().getHostAddress();
		serverSocket.bind( new InetSocketAddress( hostAddress, PORT ) );			
		log( "연결 기다림 " + hostAddress + ":" + PORT );

		// 3. 요청 대기 
		while( true ) {
		   Socket socket = serverSocket.accept();
		   new ChatServerThread( socket ).start();
		}

	}

}
