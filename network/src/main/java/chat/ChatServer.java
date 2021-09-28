package chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private static final int PORT = 6000;
	static List<Writer> listWriters = new ArrayList<Writer>();

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// 서버소켓생성
			serverSocket = new ServerSocket();
			// bind 롤 크라이언트 소렛어드래스와 포트로 연결
			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			log("채팅방이열렸습니다..."+ hostAddress +"[port: " + PORT + " ]");// 서버가 6000번으로 시작되었다

			while (true) {
				socket = serverSocket.accept();// 바인딩 끝난후 클라이언트와 connect 되길 기다림
				new ChatServerThread(socket, listWriters).start();
			}

		} catch (IOException e) {
			log("error:" + e);
		} finally {

			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}

				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void log(String log) {
		System.out.println("[chatServer] " + log);

	}

}
