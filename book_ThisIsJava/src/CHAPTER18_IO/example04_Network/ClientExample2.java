package CHAPTER18_IO.example04_Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//데이터 보내고 받기
public class ClientExample2 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			
			socket.connect(new InetSocketAddress("localhost", 5004));
			System.out.println("[연결 성공");
			
			byte[] bytes = null;
			String message = null;
			
			// 1. 서버로 데이터 보내기
			OutputStream os = socket.getOutputStream();
			message = "hungry";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			// 4. 서버에서 데이터 받기
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공] : " + message);
			
			os.close();
			is.close();
			
		} catch (Exception e) {
			
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e) {
			}
		}
	}

}
