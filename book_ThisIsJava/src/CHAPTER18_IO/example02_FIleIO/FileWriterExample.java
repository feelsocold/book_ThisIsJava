package CHAPTER18_IO.example02_FIleIO;


import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/MACBOHAN/Desktop/bored/file1.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("\n FileWriter는 한글로된 " + "/r/n");
		fw.write("문자열을 바로 출력할 수 있다. " + "/r/n");
		fw.flush();
		fw.close();
	}

}
