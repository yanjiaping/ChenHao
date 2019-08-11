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
		super.doThingA();// 调用被包装类的方法
		doThingB();
	}

	// 扩展的功能
	private void doThingB() {
		System.out.println("do B thing");
	}
}
