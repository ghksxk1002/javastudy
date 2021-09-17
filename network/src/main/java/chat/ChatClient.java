package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6000;
	private static BufferedReader br;
	private static PrintWriter pw;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		String nickname = null;
		try {
			// 1. 키보드 연결
			// 2. socket 생성
			socket = new Socket();
			// 3. 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			// 4. reader/writer 생성
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			// 5. join 프로토콜
			System.out.print("닉네임>>");
			nickname= scanner.nextLine();
			pw.println("join:" + nickname);

			// 6. ChatClientReceiveThread 시작

			ChatClientThread chatClientThread = new ChatClientThread(socket,br);
			chatClientThread.start();

			// 7. 키보드 입력 처리

			while (true) {

				System.out.print(">>");
				String input = scanner.nextLine();//키보드로 입력된값을 한줄로 저장

				if ("quit".equals(input) == true) {
					// 8. quit 프로토콜 처리
					pw.println(input);
					pw.flush();
					try {
						chatClientThread.join();
					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				} else {
					// 9. 메시지 처리
					pw.println("message:" + input);
				}
			}

		} catch (SocketException e) {
			log("server is not open");
		} catch (IOException e) {
			log("error:" + e);
		}  finally {
			try {
				if( scanner != null) {
					scanner.close();
				}
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

	public static void log(String log) {
		System.out.println("[chatClient] " + log);
	}

}
