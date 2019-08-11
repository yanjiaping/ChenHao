package com.iotek.io.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("e:/开发资料/陈豪JavaSE基础视频/abc.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("e:/开发资料/陈豪JavaSE基础视频/cba.java");
		BufferedWriter bw = new BufferedWriter(fw);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
