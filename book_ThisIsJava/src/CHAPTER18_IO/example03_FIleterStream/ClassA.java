package CHAPTER18_IO.example03_FIleterStream;

import java.io.Serializable;

// 직렬화가 가능한 클래스
public class ClassA implements Serializable {

	int field1;
	ClassB filed2 = new ClassB();
	static int field3;		// 직렬화에서 제외
	transient int field4;	// 직렬화에서 제외	
	
	
}
