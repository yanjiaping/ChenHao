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
				new FileOutputStream("e:/开发资料/陈豪JavaSE基础视频/inputOutputStreamReaderWriter.txt"), "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("你好！");
		bw.close();

		InputStreamReader fis = new InputStreamReader(
				new FileInputStream("e:/开发资料/陈豪JavaSE基础视频/inputOutputStreamReaderWriter.txt"), "UTF-8");
		BufferedReader br = new BufferedReader(fis);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
