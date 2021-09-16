package echo;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static final int SEVER_PORT = 6000;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 6000));
			log("STARTS... [port: " + SEVER_PORT + " ]");// 서버가 6000번으로 시작되었다
			
			
			while (true) {
				Socket socket = serverSocket.accept();// 바인딩 끝난후 클라이언트와 connect 되길 기다림
				new EchoServerReceiveThread(socket).start();
			}
			
			
//			
//			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
//			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
//			int remoteHostPort = inetRemoteSocketAddress.getPort();
//			log("connected by client[ " + remoteHostAddress + ":" + remoteHostPort + " ]");
//
//			try {
//				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
//				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
//
//				while (true) {
//					String data = br.readLine();// 블락킹
//					if (data == null) {
//						log("closed by client");
//						break;
//					}
//					log("received : " + data);
//					pw.println(data);// 계행을 붙혀 보내주는 PrintWriter의 println 메소드
//				}
//			} catch (IOException e) {
//				log("error:" + e);
//			} finally {
//				try {
//					if (socket != null && socket.isClosed()) {
//						socket.close();
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
		} catch (IOException e) {
			log("error:" + e);
		} finally {
			if (serverSocket != null && serverSocket.isClosed()) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


	static void log(String log) {
		System.out.println("[EchoServer] " + log);

	}
}
