package com.iotek.io.inputoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {

	public static void main(String[] args) throws IOException {
		String name = "zhangsan";
		int age = 10;
		boolean flag = true;
		char sex = '��';
		double money = 100.56;
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("e:/��������/�º�JavaSE������Ƶ/dataInputOutputStream.txt"));
		dos.writeUTF(name);
		dos.writeInt(age);
		dos.writeBoolean(flag);
		dos.writeChar(sex);
		dos.writeDouble(money);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("e:/��������/�º�JavaSE������Ƶ/dataInputOutputStream.txt"));
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		dis.close();
	}
}
