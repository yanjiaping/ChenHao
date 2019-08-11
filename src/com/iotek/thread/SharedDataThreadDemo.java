package com.iotek.thread;

public class SharedDataThreadDemo {

	public static void main(String[] args) {
		TicketRunnable r = new TicketRunnable();
		Thread t1 = new Thread(r, "һ�Ŵ���");
		t1.start();

		Thread t2 = new Thread(r, "���Ŵ���");
		t2.start();
	}
}

class TicketRunnable implements Runnable {
	private int ticket = 5;

	@Override
	public void run() {
		while (ticket != 0) {
			System.out.println(Thread.currentThread().getName() + "" + ticket--);
		}
	}
}
