package com.iotek.io.otherio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputOutputStreamReaderWriter {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("e:/��������/�º�JavaSE������Ƶ/inputOutputStreamReaderWriter.txt"), "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("��ã�");
		bw.close();

		InputStreamReader fis = new InputStreamReader(
				new FileInputStream("e:/��������/�º�JavaSE������Ƶ/inputOutputStreamReaderWriter.txt"), "UTF-8");
		BufferedReader br = new BufferedReader(fis);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
