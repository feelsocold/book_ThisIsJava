package CHAPTER18_IO.example03_FIleterStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//객체 역직렬화
public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("/Users/MACBOHAN/Desktop/bored/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1 : " + classC.field1);
		
		// ClassC 클래스에 field2 필드를 추가하고 저장(컴파일)한다.
		// field2가 추가 되었기 때문에 serialVersionUID 필드값이 변경된다.
		// java.io.InvalidClassException 발생!!
		
		// 만약 불가피하게 클래스의 수정이 필요하면 클래스 작성 시 serialVersionUID를 명시적으로 선언하면 된다.
		
	}

}
