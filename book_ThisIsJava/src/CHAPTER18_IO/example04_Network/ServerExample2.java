package CHAPTER18_IO.example04_Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 데이터 받고 보내기
public class ServerExample2 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5004));	// binding : 클라이언트가 접속할 포트 생성
			
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				// 2. 클라이언트가 보낸 데이터 받기
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]: " + message);
				
				// 3. 클라이언트에게 데이터 보내기
				OutputStream os = socket.getOutputStream();
				message = "밥먹어";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
			
		} catch (Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (Exception e1) {

			}
		}
		
	}

}
