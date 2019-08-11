package com.iotek.io.decorator;

/**
 * BufferedInputStream
 * 
 * @author YJP
 *
 */
public class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	@Override
	public void doThingA() {
		super.doThingA();// ���ñ���װ��ķ���
		doThingB();
	}

	// ��չ�Ĺ���
	private void doThingB() {
		System.out.println("do B thing");
	}
}
