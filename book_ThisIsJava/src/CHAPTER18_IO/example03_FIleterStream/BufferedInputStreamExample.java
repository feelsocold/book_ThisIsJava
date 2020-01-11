package CHAPTER18_IO.example03_FIleterStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args)throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream(
			"/Users/MACBOHAN/Desktop/bored/smokingLana.jpg"
		);
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {};
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때 : " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("/Users/MACBOHAN/Desktop/bored/smokingLana.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);	// 버퍼 스트림 생성
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때 : " + (end-start) + "ms");
		bis.close();
		fis2.close();
				
		// 버퍼 스트림을 생성해서 사용했을 때 파일을 읽는 성능이 좋아진다.
		
		
	}

}
