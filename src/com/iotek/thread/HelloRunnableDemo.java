package com.iotek.thread;

public class HelloRunnableDemo {

	public static void main(String[] args) {
		HelloRunnable r = new HelloRunnable();
		Thread t1 = new Thread(r, "A");
		t1.start();
		Thread t2 = new Thread(r, "B");
		t2.start();
	}
}

class HelloRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
