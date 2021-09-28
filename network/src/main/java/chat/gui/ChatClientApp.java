package chat.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientApp {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6000;
	private static BufferedReader br;
	private static PrintWriter pw;

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket;
		while (true) {
			System.out.println("대화명을 입력하세요.");
			System.out.print(">> ");
			name = scanner.nextLine();

			if (name.isEmpty() == false) {
				break;
			}
			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}

		scanner.close();

		try {
			// 1. create socket
			socket = new Socket();
			// 2. connect to server
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			// 3. get iostream
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));// 서버가 보내준 응답을 읽는것
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);// 서버한테 요청하는것 쓰기
			// 4. join
			pw.println("join:" + name);
			pw.flush();

			String line = br.readLine();
			String[] tokens = line.split(":");
			if ("join".equals(tokens[0])) {
				new ChatWindow(name, socket, br, pw).show();
			} else {
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}