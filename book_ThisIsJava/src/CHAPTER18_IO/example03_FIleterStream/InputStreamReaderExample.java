package CHAPTER18_IO.example03_FIleterStream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// 버퍼 사용여부에 따른 성능비교
public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception{
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
		
	}

}
