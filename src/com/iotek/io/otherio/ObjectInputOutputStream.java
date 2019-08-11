package com.iotek.io.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputOutputStream {

	public static void main(String[] args) throws IOException {
//		Student stu = new Student("zhangsan", 30);
//		FileOutputStream fos = new FileOutputStream("e:\\开发资料\\陈豪JavaSE基础视频\\objectInputOutputStream.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(stu);
//		oos.close();
		
		FileInputStream fis = new FileInputStream("e:\\开发资料\\陈豪JavaSE基础视频\\objectInputOutputStream.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Student stu = (Student)ois.readObject();
			System.out.println(stu);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Student implements Serializable {
	private static final long serialVersionUID = 8175282179234546323L;
	private String name;
	private int age;
	private String address;

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
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}