package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;

public class ChatServerThread extends Thread {
	private String nickname;
	private Socket socket;
	private List<Writer> listWriters;
	private BufferedReader br = null;
	private PrintWriter pw = null;

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		// 호스트 정보 불러오기
		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetRemoteSocketAddress.getPort();
		log("connected by client[ " + remoteHostAddress + ":" + remoteHostPort + " ]");

		try {
			// IOStream(inputoutputStream)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));// 읽기
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);// 쓰기.fl

			while (true) {

				String request = null;
				request = br.readLine();// 클라이언트 요청 버터에서 라인으로 읽어오기

				if (request == null) {// 요청이 없으면
					log("클라이언트로 부터 연결 끊김");
					doQuit(pw);
					break;
				}
				// 프로트콜분석 -> 형식 : 요청명령:파라미터1:파라미터2:...\r\n
				String[] tokens = request.split(":");
				if ("join".equals(tokens[0])) {

					doJoin(tokens[1], pw);

				} else if ("message".equals(tokens[0])) {

					doMessage(tokens[1]);

				} else if ("quit".equals(tokens[0])) {

					doQuit(pw);

				} else {

					log("에러:알수 없는 요청(" + tokens[0] + ")");
				}

			}
		} catch (IOException e) {
			ChatServer.log("error:" + e);
		} finally {
			if (socket != null && socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void doJoin(String nickName, PrintWriter pw) {
		this.nickname = nickName;

		String data = nickName + "님이 참여하였습니다.";
		broadcast(data);

		/* writer pool에 저장 */
		addWriter(pw);

		// ack
		pw.println("join:채팅방에 들어왔습니다");
		pw.flush();

	}

	private void addWriter(Writer pw) {
		synchronized (listWriters) {
			listWriters.add(pw);
		}

	}

	private void broadcast(String data) {

		synchronized (listWriters) {// synchronized 여러 스레드가 공유 객체에 접근할때 동기화 보장

			for (Writer writer : listWriters) {// pw는 쓴다는것을 잊지말자
				PrintWriter pw = (PrintWriter) writer;
				pw.println(data);
			}

		}

	}

	private void doMessage(String message) {
		broadcast(nickname + ":" + message);
	}

	private void doQuit(Writer writer) {
		removeWriter(writer);

		String data = nickname + "님이 퇴장 하였습니다.";
		broadcast(data);
	}

	private void removeWriter(Writer writer) {
		/* 잘 구현 해보기 */
		synchronized (listWriters) {// listWriters 요청받은 배여에 메개변수값을 가진 객체 삭제
			listWriters.remove(writer);
		}
	}

	private void log(String log) {
		System.out.println("[chatServerThread] " + log);
	}

}
