package com.iotek.net.multitcpsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerStream implements Runnable {
	private Socket socket;
	private int number;

	public ServerStream(Socket socket, int number) {
		super();
		this.socket = socket;
		this.number = number;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				String line = br.readLine();
				System.out.println("�ͻ���" + number + ":" + line);
				pw.println(line.toUpperCase());
				if (line.equals("bye")) {
					System.out.println("�ͻ���" + number + "�Ѿ��Ͽ�����");
					break;
				}
			}
			br.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
