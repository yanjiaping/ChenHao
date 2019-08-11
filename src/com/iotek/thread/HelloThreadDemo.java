package com.iotek.thread;

public class HelloThreadDemo {

	public static void main(String[] args) {
		HelloThread h1 = new HelloThread("A");
//		h1.setName("A");
		h1.start();
		HelloThread h2 = new HelloThread("B");
//		h2.setName("B");
		h2.start();
	}
}

class HelloThread extends Thread {
	public HelloThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}
}