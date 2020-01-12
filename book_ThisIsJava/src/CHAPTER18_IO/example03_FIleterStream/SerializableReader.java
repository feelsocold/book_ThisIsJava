package CHAPTER18_IO.example03_FIleterStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("/Users/MACBOHAN/Desktop/bored/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println("filed1 : " + v.field1);
		System.out.println("filed2.field1 : " + v.filed2.field1);
		System.out.println("file3 : " + v.field3);
		System.out.println("file4 : " + v.field4);
		
	}

}
