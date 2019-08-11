package com.iotek.io.inputoutputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStream {

	public static void main(String[] args) throws IOException {
		String str = "Hello Shanghai";
		ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
		int data;
		while ((data = bais.read()) != -1) {
			System.out.print((char) data);
		}

		System.out.println();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(97);
		baos.write(65);
		baos.write(str.getBytes());
		byte[] byteArray = baos.toByteArray();
		for (byte b : byteArray) {
			System.out.print((char) b);
		}
		
		baos.writeTo(new FileOutputStream("e:/开发资料/陈豪JavaSE基础视频/byteArrayInputOutputStream.txt", true));
	}
}
