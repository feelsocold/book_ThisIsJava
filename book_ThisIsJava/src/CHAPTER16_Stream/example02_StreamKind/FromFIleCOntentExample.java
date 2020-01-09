package CHAPTER16_Stream.example02_StreamKind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//파일로부터 스트림 얻기
public class FromFIleCOntentExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/CHAPTER16_STREAM/example02_StreamKind/linedata.txt");
		Stream<String> stream;
		
		//Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach( System.out :: println);		// 메소드 참조( s->System.out.println(s)와 동일하다)
		System.out.println();
	
		//BufferedRead의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach( System.out :: println);
		
	}

}
