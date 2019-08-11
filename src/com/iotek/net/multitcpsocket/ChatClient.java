package com.iotek.net.multitcpsocket;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1", 8888);

		new Thread(new ClientInputStream(socket)).start();
		new Thread(new ClientOutputStream(socket)).start();
	}
}
