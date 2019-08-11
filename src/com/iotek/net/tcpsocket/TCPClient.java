package com.iotek.net.tcpsocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 8888);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		while (true) {
			String line = br.readLine();
//			bw.write(line);
//			bw.newLine();
//			bw.flush();
			pw.println(line);
			if (line.equals("over")) {
				break;
			}
			System.out.println(reader.readLine());
		}
		socket.close();
		br.close();
//		bw.close();
		pw.close();
		reader.close();
	}
}
