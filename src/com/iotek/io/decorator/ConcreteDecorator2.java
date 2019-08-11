package com.iotek.io.decorator;

/**
 * BufferedInputStream
 * 
 * @author YJP
 *
 */
public class ConcreteDecorator2 extends Decorator {
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	@Override
	public void doThingA() {
		super.doThingA();// ���ñ���װ��ķ���
		doThingC();
	}

	// ��չ�Ĺ���
	private void doThingC() {
		System.out.println("do C thing");
	}
}
