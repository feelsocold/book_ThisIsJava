package CHAPTER18_IO.example06_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//발신자
public class UdpSendExample {

	public static void main(String[] args) throws Exception{
		
		DatagramSocket datagramSocket = new DatagramSocket();		// Datagram Socket 생성
		
		System.out.println("[발신 시작]");
		
		for (int i = 0; i < 3; i++) {
			String data = "메시지" + i;
			byte[] byteArr = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(				// Datagram Packet 생성
					byteArr, byteArr.length, new InetSocketAddress("localhost", 5001));
		
			datagramSocket.send(packet);							// DatagramPacket 전송
			System.out.println("[보낸 바이트 수] : " + byteArr.length + " bytes");
		}
		
		System.out.println("[발신 종료]");
		
		datagramSocket.close();		// DatagramSocket 닫기
		
	}

}
