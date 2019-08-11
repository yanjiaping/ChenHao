package com.iotek.reflection;

public class ClassDemo {

	public static void main(String[] args) {
		// 对象名.getClass()
		Employee e = new Employee("zhangsan", 30);
		Class<? extends Employee> classType1 = e.getClass();
		System.out.println(classType1.getName());
		System.out.println(classType1.getSuperclass().getName());

		// 类型.class
		Class<? extends Employee> classType2 = Employee.class;
		System.out.println(classType2.getName());
		System.out.println(classType2.getSuperclass().getName());

		// Class.forName()
		try {
			Class<?> classType3 = Class.forName("com.iotek.classtype.Employee");
			System.out.println(classType3.getName());
			System.out.println(classType3.getSuperclass().getName());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		// 基本数据类型
		Class<?> classType4 = int.class;
	}

}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}