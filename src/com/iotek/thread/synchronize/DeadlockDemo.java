package com.iotek.thread.synchronize;

public class DeadlockDemo {

	public static void main(String[] args) {
		Example example = new Example();
		DeadThread1 d1 = new DeadThread1(example);
		d1.start();
		DeadThread2 d2 = new DeadThread2(example);
		d2.start();
	}
}

class DeadThread1 extends Thread {
	private Example example;

	public DeadThread1(Example example) {
		this.example = example;
	}

	@Override
	public void run() {
		example.method1();
	}
}

class DeadThread2 extends Thread {
	private Example example;

	public DeadThread2(Example example) {
		this.example = example;
	}

	@Override
	public void run() {
		example.method2();
	}
}

class Example {
	private Object obj1 = new Object();
	private Object obj2 = new Object();

	public void method1() {
		synchronized (obj1) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj2) {
				System.out.println("method1");
			}
		}
	}

	public void method2() {
		synchronized (obj2) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj1) {
				System.out.println("method2");
			}
		}
	}
}
