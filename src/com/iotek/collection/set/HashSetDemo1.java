package com.iotek.collection.set;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		/*
		 * HashSet<String> data = new HashSet<>(); data.add("zhangsan");
		 * data.add("lisi"); System.out.println(data.add("jay")); data.add("jack");
		 * System.out.println(data.add("jay")); System.out.println(data);
		 */

		HashSet<Student> stuSet = new HashSet<>();
		System.out.println(stuSet.add(new Student("张三", 20)));
		System.out.println(stuSet.add(new Student("李四", 30)));
		System.out.println(stuSet.add(new Student("张三", 20)));
		System.out.println(stuSet.size());
	}

}
class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}