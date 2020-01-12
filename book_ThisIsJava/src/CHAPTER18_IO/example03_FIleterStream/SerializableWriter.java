package CHAPTER18_IO.example03_FIleterStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 직렬화해서 파일에 저장
public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("/Users/MACBOHAN/Desktop/bored/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.filed2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);
		
		oos.flush();
		oos.close();
		fos.close();
		
		
	}

}
