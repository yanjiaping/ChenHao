package com.iotek.net.tcpsocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 1.����ServerSocket����
		ServerSocket serverSocket = new ServerSocket(8888);
		// 2.���ܿͻ�������
		Socket socket = serverSocket.accept();
		System.out.println(socket.getInetAddress().getHostAddress() + "has connected");
		// 3.��ȡSocket��������������
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		String line;
		while ((line = br.readLine()) != null) {
			if (line.equals("over")) {
				break;
			}
			System.out.println(line);
//			bw.write(line.toUpperCase());
//			bw.newLine();
//			bw.flush();
			pw.println(line.toUpperCase());
		}
		br.close();
//		bw.close();
		pw.close();
		socket.close();
		System.out.println(socket.getInetAddress().getHostAddress() + "has disconnected");
	}

}
