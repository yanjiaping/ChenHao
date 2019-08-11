package com.iotek.io.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("e:/��������/�º�JavaSE������Ƶ/abc.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("e:/��������/�º�JavaSE������Ƶ/cba.java");
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
