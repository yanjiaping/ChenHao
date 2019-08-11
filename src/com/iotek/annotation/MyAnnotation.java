package com.iotek.annotation;

public class MyAnnotation {
	@MyAnnotation1
	public MyAnnotation() {
	}

	// @MyAnnotation2(value = "zhangsan", age = 10)
	// @MyAnnotation2(value = {"zhangsan", "lisi"})
	@MyAnnotation2(color = Color.RED)
	public static void main(String[] args) {
		@MyAnnotation1
		int number = 10;
	}

}

// 标记注解
@interface MyAnnotation1 {

}

enum Color {
	RED, BLUE, YELLOW;
}

@interface MyAnnotation2 {
	// String value() default "lisi";
	//
	// int age();

	// String[] value();

	Color color();
}