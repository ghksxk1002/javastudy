package udp;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UdpEchoClient {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			socket = new DatagramSocket();
			
			
			
		} catch (SocketException e) {
			System.out.println("error : " + e);
		} finally {
			if(socket != null && socket.isClosed() == false) {
				scanner.close();
				socket.close();
			}
		}
	}

}
