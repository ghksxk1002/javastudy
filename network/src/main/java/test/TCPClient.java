package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class TCPClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SEVER_PORT = 5000;

	public static void main(String[] args) {
		// 클라이언트 만들기 순서
		Socket socket = null;
		try {
			// 1.소켓생성
			socket = new Socket();
			// 1-1 소켓 버퍼 사이즈 확인
			int rcvBufferSize = socket.getReceiveBufferSize();
			int sndBufferSize = socket.getSendBufferSize();
			System.out.println(rcvBufferSize + ":" + sndBufferSize);
			// 1-2 소켓 버퍼 사이즈 변경
			socket.setReceiveBufferSize(1024 * 10);
			socket.setSendBufferSize(1024 * 10);
			System.out.println(rcvBufferSize + ":" + sndBufferSize);
			// 1-3. SO_NODELAY(Nagle 알고리즘 off)
			socket.setTcpNoDelay(true);//
			// 1 - 4. 소켓 타임아웃
			socket.setSoTimeout(3000);

			// 2.서버 연결
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
		} catch (SocketTimeoutException e) {
			System.out.println("[client] time out");
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
