package CHAPTER18_IO.example03_FIleterStream;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//객체 직렬화
public class SerialVersionUIDExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("/Users/MACBOHAN/Desktop/bored/Object.dat");
		ObjectOutput oos = new ObjectOutputStream(fos);
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		oos.writeObject(classC);

		oos.flush();
		oos.close();
		fos.close();
		
	}

}
