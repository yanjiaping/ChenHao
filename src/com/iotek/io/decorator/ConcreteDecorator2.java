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
		super.doThingA();// 调用被包装类的方法
		doThingC();
	}

	// 扩展的功能
	private void doThingC() {
		System.out.println("do C thing");
	}
}
