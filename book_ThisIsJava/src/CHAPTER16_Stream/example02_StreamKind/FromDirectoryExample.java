package CHAPTER16_Stream.example02_StreamKind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args) throws IOException{
		Path path = Paths.get("/Users/MACBOHAN/Documents/elevatingcodingclub/book_ThisIsJava/book_ThisIsJava/src/CHAPTER16_Stream"	); 
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()));
		
	}

}
