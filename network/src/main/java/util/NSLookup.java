package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup {

	public static void main(String[] args) {
		String line = "www.naver.com";
		
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
