package com.iotek.io.decorator;

/**
 * FilterInputStream
 * 
 * @author YJP
 *
 */
public class Decorator implements Component {
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void doThingA() {
		component.doThingA();// 调用被装饰对象的方法
	}
}
