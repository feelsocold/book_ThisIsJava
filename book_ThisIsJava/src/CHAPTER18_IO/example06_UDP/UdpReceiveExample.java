package CHAPTER18_IO.example06_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//수신자
public class UdpReceiveExample extends Thread {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket datagramSocket = new DatagramSocket(5001);	// 5001번 포트에서 수신하는 DatagramSocket 생성
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
					
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[받은 내용: " + packet.getSocketAddress() + "]" + data);
					}
				} catch (Exception e) {
					System.out.println("[수신종료]");
				}
			}
		};
		thread.start();
		
		thread.sleep(100000);
		datagramSocket.close();
		
	}

}
