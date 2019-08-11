package com.iotek.io.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("e:/scm");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.delete());
		File myFile = new File("e:/zhangsan");
		System.out.println(myFile.mkdir());
		File myFile2 = new File("e:/zhangsan/chenhao.txt");
		try {
			System.out.println(myFile2.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] files = file.list();
		for (String f : files) {
			System.out.println(f);
		}
	}

}
