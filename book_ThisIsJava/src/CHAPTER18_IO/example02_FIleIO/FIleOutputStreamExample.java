package CHAPTER18_IO.example02_FIleIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//파일복사
public class FIleOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = 
				"/Users/MACBOHAN/Desktop/bored/tumblr_oelojhjMne1ub6byyo1_500.jpg";
		String targetFileName = "/Users/MACBOHAN/Desktop/bored/smokingLana.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];	
		while( (readByteNo = fis.read(readBytes)) != -1 ) {		// 한번에 100바이트를 읽어 readBytes에 저장한다.
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fos.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}

}
