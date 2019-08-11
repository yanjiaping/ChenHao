package com.iotek.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<Person, String> pdata = new TreeMap<>(new Comparator<Person>() {
			// 先按名字排序，再按年龄排序
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				} else if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				} else {
					return o1.getAge() - o2.getAge();
				}
			}
		});
		pdata.put(new Person("zhangsan", 30), "张三");
		pdata.put(new Person("lisi", 31), "李四");
		pdata.put(new Person("rose", 32), "玫瑰");
		pdata.put(new Person("zhangsan", 33), "张三");
		System.out.println(pdata);
	}

}

class Person /* implements Comparable<Person> */ {
	private String name;
	private int age;

	public Person(String name, int age) {
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

//	@Override
//	public int compareTo(Person o) {
//		if (this.age > o.getAge()) {
//			return 1;
//		} else if (this.age < o.getAge()) {
//			return -1;
//		}
//		return 0;
//	}
}
