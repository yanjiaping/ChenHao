package com.iotek.io.decorator;

public class Test {

	public static void main(String[] args) {
		ConcreteComponent cC = new ConcreteComponent();
		cC.doThingA();
		ConcreteDecorator1 cD1 = new ConcreteDecorator1(cC);
		cD1.doThingA();
		ConcreteDecorator2 cD2 = new ConcreteDecorator2(cC);
		cD2.doThingA();
	}
}
