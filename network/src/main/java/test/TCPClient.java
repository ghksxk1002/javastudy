package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class TCPClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SEVER_PORT = 5000;

	public static void main(String[] args) {
		// 클라이언트 만들기 순서
		// 1.소켓생성
		Socket socket = null;
		// 2.서버 연결
		try {
			
			socket = new Socket();
			socket.connect(new InetSocketAddress(SERVER_IP, SEVER_PORT));
			// IO 서버 받아오기
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 4.쓰기
			String data = "Hello world";
			os.write(data.getBytes("UTF-8"));
			
			// 5.읽기
			byte[] buffer = new byte[256];
			int readByteCount = is.read(buffer); // blocking
			if (readByteCount == -1) {
				// 반대편(클라이언트)가 정상적으로 종료되었다. => 정상적으로 종료가 안될수도 있다.
				// 클라인트가 소켓만 열어두고 close()메소드가 호출되지 않았거나 컴퓨터가 꺼졌을경우가 있다
				System.out.println("[client] closed by server");
			}
			
			 data = new String(buffer, 0, readByteCount, "UTF-8");
			 System.out.println("[client] received " + data);
		} catch (SocketException e) {
			System.out.println("[client] suddenly closed by server");
		} catch (IOException e) {
			System.out.println("[client error]" + e);
		} finally {
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
