package com.iotek.thread.synchronize;

import java.util.LinkedList;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Basket basket = new Basket();
		Producter pThread = new Producter(basket);
		pThread.start();
		Consumer cThread = new Consumer(basket);
		cThread.start();
	}
}

class Producter extends Thread {
	private Basket basket;

	public Producter(Basket basket) {
		super();
		this.basket = basket;
	}

	@Override
	public void run() {
		basket.pushApple();
	}
}

class Consumer extends Thread {
	private Basket basket;

	public Consumer(Basket basket) {
		super();
		this.basket = basket;
	}

	@Override
	public void run() {
		basket.popApple();
	}
}

class Basket {
	private LinkedList<Apple> basket = new LinkedList<>();

	// ����ƻ��
	public synchronized void pushApple() {
		for (int i = 0; i < 20; i++) {
			Apple apple = new Apple(i);
			push(apple);
		}
	}

	// ����ƻ��
	public synchronized void popApple() {
		for (int i = 0; i < 20; i++) {
			pop();
		}
	}

	// �����ӷ�ƻ��
	private void push(Apple apple) {
		// �������д����5��ƻ�����ȴ���֪ͨ������
		if (basket.size() == 5) {
			try {
				wait();// �ȴ����ͷŵ�ǰ�������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		basket.addFirst(apple);
		System.out.println("��ţ�" + apple.toString());
		notify();// ֪ͨ������
	}

	// ������ȡƻ��
	private void pop() {
		// ��������û��ƻ�����ȴ���֪ͨ��������
		if (basket.size() == 0) {
			try {
				wait();// �ȴ����ͷŵ�ǰ�������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Apple apple = basket.removeFirst();
		System.out.println("�Ե���" + apple.toString());
		notify();// ֪ͨ������
	}
}

class Apple {
	private int id;

	public Apple(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ƻ����" + (id + 1);
	}
}