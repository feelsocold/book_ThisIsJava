package CHAPTER18_IO.example03_FIleterStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//직렬화 및 역직렬화
public class NonSerializableParentExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("/Users/MACBOHAN/Desktop/bored/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "조휴일";
		child.field2 = "니나시몬";
		oos.writeObject(child);
		
		oos.flush();
		oos.close();
		fos.close();
		
		////
		
		FileInputStream fis = new FileInputStream("/Users/MACBOHAN/Desktop/bored/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println("field1 : " + v.field1);
		System.out.println("field2 : " + v.field2);
		
		ois.close();
		fis.close();
		
		
		
				
		
	}

}
