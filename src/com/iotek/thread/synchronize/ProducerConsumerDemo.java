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

	// 生产苹果
	public synchronized void pushApple() {
		for (int i = 0; i < 20; i++) {
			Apple apple = new Apple(i);
			push(apple);
		}
	}

	// 消费苹果
	public synchronized void popApple() {
		for (int i = 0; i < 20; i++) {
			pop();
		}
	}

	// 向篮子放苹果
	private void push(Apple apple) {
		// 当篮子中存放了5个苹果，等待并通知消费者
		if (basket.size() == 5) {
			try {
				wait();// 等待并释放当前对象的锁
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
		System.out.println("存放：" + apple.toString());
		notify();// 通知消费者
	}

	// 从篮子取苹果
	private void pop() {
		// 当篮子中没有苹果，等待并通知消生产者
		if (basket.size() == 0) {
			try {
				wait();// 等待并释放当前对象的锁
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
		System.out.println("吃掉：" + apple.toString());
		notify();// 通知生产者
	}
}

class Apple {
	private int id;

	public Apple(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "苹果：" + (id + 1);
	}
}