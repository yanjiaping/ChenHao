package com.iotek.io.readerwriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("e:/开发资料/陈豪JavaSE基础视频/fileReader.txt"));
		FileWriter fw = new FileWriter(new File("e:/开发资料/陈豪JavaSE基础视频/fileWriter.txt"));
		char[] buf = new char[100];
		int length;
		while ((length = fr.read(buf)) != -1) {
			fw.write(buf, 0, length);
		}
		fr.close();
		fw.close();
	}
}
