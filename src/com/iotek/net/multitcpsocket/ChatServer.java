package com.iotek.net.multitcpsocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		int number = 1;
		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("�ͻ���" + number + "���ӳɹ���");
			new Thread(new ServerStream(socket, number)).start();
			number++;
		}
	}

}
