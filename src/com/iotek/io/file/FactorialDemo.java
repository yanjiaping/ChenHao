package com.iotek.io.file;

public class FactorialDemo {

	public static void main(String[] args) {
		System.out.println(FactorialUtil.getFactorial(5));
	}
}

// ½×³Ë
class FactorialUtil {
	public static int getFactorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * getFactorial(number - 1);
		}
	}
}
