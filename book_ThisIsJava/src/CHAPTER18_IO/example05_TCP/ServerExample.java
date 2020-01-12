package CHAPTER18_IO.example05_TCP;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();								// ServerSocket 생성
			serverSocket.bind(new InetSocketAddress("localhost", 5001));	
			
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();						// 클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch (Exception e) {
		}
		
		if(!serverSocket.isClosed()) {		// ServerSocket이 닫혀있지 않을 경우
			try {
				serverSocket.close();		// 닫기
			} catch (Exception e) {
				
			}
		}
	}

}
