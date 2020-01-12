package CHAPTER18_IO.example04_Network;

import java.net.Inet4Address;
import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		
		try {
			InetAddress local = Inet4Address.getLocalHost();
			System.out.println("내컴퓨터 IP주소 : " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
