package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {

	public static void main(String[] args) {
		// 서버만들기순서
		ServerSocket serverSocket = null;
		try {
			// 1. 서버소켓생성
			serverSocket = new ServerSocket();
			// 2. 바인딩(binding) => 이소켓에다가 ip와 소켓을 연결시켜주는것
			// socket에 InetSocketAdderss(IPAdress+port)
			// IPAdress : 0.0.0.0 : =>모든 IP로 부터의 연결을 허용하는 것이다.
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000));
			// 3. accpet
			// 클라이언트로 부터 연결 요청을 기다린다.
			Socket socket = serverSocket.accept();
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();// 상대방의
																											// 소켓어드레스를
																											// 가져와라
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetRemoteSocketAddress.getPort();
			System.out.println("[server] connected by client[" + remoteHostAddress + ":" + remoteHostPort + "]");

			// 4.IO Stream 받아오기
			// 데이터통신으로 들어온 try catch
			try {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				while (true) {
					// 5.데이타 읽기
					byte[] buffer = new byte[256];
					int readByteCount = is.read(buffer); // blocking
					if (readByteCount == -1) {
						// 반대편(클라이언트)가 정상적으로 종료되었다. => 정상적으로 종료가 안될수도 있다.
						// 클라인트가 소켓만 열어두고 close()메소드가 호출되지 않았거나 컴퓨터가 꺼졌을경우가 있다
						System.out.println("[sever] closed by client");
						break;// 버퍼가 다 비게되면 브레이크하고 while문을 빠져나간다
					}
					String data = new String(buffer, 0, readByteCount, "utf-8");
					System.out.println("[sever] received : " + data);
				}

			} catch (SocketException e) {
				System.out.println("[server error] suddenly closed by client");
			} catch (IOException e) {
				System.out.println("[server error]" + e);
			} finally {
				try {
					if (socket != null && socket.isClosed()) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				// 이부분은 데이터 소켓부분의 클로즈
			}
		} catch (IOException e) {
			System.out.println("[server] error:" + e);
		} finally {
			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
