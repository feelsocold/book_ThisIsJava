package CHAPTER18_IO.example05_TCP;

import java.net.InetSocketAddress;
import java.net.Socket;

//연결 요청
public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();		// Socket 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));	// 연결 요청
			System.out.println("[연결 성공]");
			
		} catch (Exception e) {
		}
		
		if(!socket.isClosed()) {		// 연결이 되어 있을 경우
			try {
				socket.close();
			} catch (Exception e) {		// 연결 끊기
			}
		}
	}

}
