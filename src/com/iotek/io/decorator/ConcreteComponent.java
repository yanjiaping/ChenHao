package com.iotek.io.decorator;

/**
 * FileInputStream
 * 
 * @author YJP
 *
 */
public class ConcreteComponent implements Component {
	@Override
	public void doThingA() {
		System.out.println("do A thing");
	}
}
