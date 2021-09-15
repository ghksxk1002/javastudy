package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//서버만들기순서
		ServerSocket serverSocket=null;
		try {
			// 1. 서버소켓생성
			serverSocket = new ServerSocket();
			
			// 2. 바인딩(binding) => 이소켓에다가 ip와 소켓을 연결시켜주는것
			//		socket에 InetSocketAdderss(IPAdress+port)
			//		IPAdress : 0.0.0.0 :  =>모든 IP로 부터의 연결을 허용하는 것이다.
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000));
			
			// 3. accpet
			// 		클라이언트로 부터 연결 요청을 기다린다.
			Socket socket = serverSocket.accept();
			
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();//상대방의 소켓어드레스를 가져와라
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetRemoteSocketAddress.getPort();
			
			System.out.println("[server] connected by client["+remoteHostAddress+":"+remoteHostPort+"]");
			
		} catch (IOException e) {
			System.out.println("[server] error:" + e);
		}finally {
			try {
				if(serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
