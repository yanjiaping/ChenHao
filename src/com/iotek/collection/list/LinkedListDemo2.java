package com.iotek.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

	}

}

class MyStack<T> {
	private LinkedList<T> data;

	public MyStack() {
		data = new LinkedList<>();
	}

	// ѹջ
	public void push(T obj) {
		data.addFirst(obj);
	}

	public T pop() {
		return data.removeFirst();
	}

	public Iterator<T> iterator() {
		return data.iterator();
	}
}