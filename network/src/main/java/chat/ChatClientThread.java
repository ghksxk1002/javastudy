package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ChatClientThread extends Thread {
	private Socket socket = null;
	private BufferedReader br = null;

	public ChatClientThread(Socket socket, BufferedReader br) {
		this.socket = socket;
		this.br = br;
	}

	@Override
	public void run() {
		// Remote Host Information
		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetRemoteSocketAddress.getPort();

		try {

			while (true) {
				String response = br.readLine();
				System.out.println(response);
				if (response == null) {
					ChatClient.log("서버로부터 연결이 끊어졌습니다" + "[" + remoteHostAddress + ":" + remoteHostPort + "]");
					break;
				}

				String[] tokens = response.split(":");
				if ("join".equals(tokens[0])) {
					Join(tokens[1]);
				} else if ("message".equals(tokens[0])) {
					Message(tokens[1], tokens[2]);
				} else if ("quit".equals(tokens[0])) {
					Quit(tokens[1]);
				}
			}

		} catch (IOException e) {
			ChatClient.log("" + e);
		}
	}

	private void Quit(String msg) {
		System.out.println(msg);
	}

	private void Join(String msg) {
		System.out.println(msg);
	}

	private void Message(String nickName, String msg) {
		System.out.println(nickName + msg);

	}

}