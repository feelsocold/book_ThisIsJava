package CHAPTER18_IO.example03_FIleterStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 직렬화되지 않는 부모 클래스의 필드처리
public class Child extends Parent implements Serializable {
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws Exception{
		out.writeUTF(field1);
		out.defaultWriteObject();
		
	}
	
	private void readObject(ObjectInputStream in) throws Exception{
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
