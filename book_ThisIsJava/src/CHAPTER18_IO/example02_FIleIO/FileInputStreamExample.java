package CHAPTER18_IO.example02_FIleIO;

import java.io.FileInputStream;

//텍스트 파일을 읽고 출력
public class FileInputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("/Users/MACBOHAN/Desktop/bored/file1.txt");
			int data;
			
			while ( ( data = fis.read() ) != -1 ) {		// 1바이트씩 읽고 콘솔에 출력
				System.out.println(data);
			
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
