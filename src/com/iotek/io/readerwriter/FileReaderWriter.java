package com.iotek.io.readerwriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("e:/��������/�º�JavaSE������Ƶ/fileReader.txt"));
		FileWriter fw = new FileWriter(new File("e:/��������/�º�JavaSE������Ƶ/fileWriter.txt"));
		char[] buf = new char[100];
		int length;
		while ((length = fr.read(buf)) != -1) {
			fw.write(buf, 0, length);
		}
		fr.close();
		fw.close();
	}
}
