package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("도메인을 입력하세요: ");
		String line = sc.nextLine();
		
		try {
			InetAddress[] inetaddresses = InetAddress.getAllByName(line);
			for(InetAddress inetaddess :inetaddresses) {
				System.out.println(inetaddess);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
