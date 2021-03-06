package httpd;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
	private static final int PORT = 8080;

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			// 1. Create Server Socket
			serverSocket = new ServerSocket();
			   
			// 2. Bind
			serverSocket.bind( new InetSocketAddress( "0.0.0.0", PORT ) );
			consolLog("stats...[" + PORT + "]");

			while (true) {
				// 3. Wait for connecting ( accept )
				Socket socket = serverSocket.accept();

				// 4. Delegate Processing Request => 이처리를 내가 하지않고 스레드에게 맡기는것, 위임,리퀘스트를 처리하는것을 스레드에게 위이했다
				new RequestHandler(socket).start();
			}

		} catch (IOException ex) {
			consolLog("error:" + ex);
		} finally {
			// 5. 자원정리
			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch (IOException ex) {
				consolLog("error:" + ex);
			}
		}
	}

	public static void consolLog(String message) {//스레드 아이디 출력
		System.out.println("[HttpServer#" + Thread.currentThread().getId()  + "] " + message);
	}
}
