package CHAPTER18_IO.example03_FIleterStream;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("/Users/MACBOHAN/Desktop/bored/file1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("조휴일");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("홈쉐이크");
		dos.writeDouble(93.5);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		dos.close();
		
		FileInputStream fis = new FileInputStream("/Users/MACBOHAN/Desktop/bored/file1.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		
		
	}

}
