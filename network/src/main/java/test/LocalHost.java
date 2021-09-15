package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {//로칼호스트는 프로그램이 돌고있는 컴퓨터이다(내컴퓨터). 호스트는 컴튜터라고 생각하면 된다

	public static void main(String[] args) {
		//인터넷어래스 : InetAddress
		try {
			InetAddress inetaddress = InetAddress.getLocalHost();
			
			String name = inetaddress.getHostName();//호스트 네임
			String hostaddress = inetaddress.getHostAddress();
			System.out.println(name);
			System.out.println(hostaddress);
			
			byte[] addresses = inetaddress.getAddress();
			for(byte address : addresses) {
				System.out.print(address);
				System.out.print(" ");
//				System.out.print(address & 0x000000ff);
//				System.out.print(".");		
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
