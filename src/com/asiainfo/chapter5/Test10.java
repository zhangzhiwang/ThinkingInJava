package com.asiainfo.chapter5;

/**
 * ���������ù�����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
 */
public class Test10 {
	private int age;
	private String name;

	public Test10() {
		this(1);
		System.out.println("Test10()");
	}

	public Test10(int age) {
		this(age, "Tom");
		this.age = age;
		System.out.println("Test10(int age)");
	}

	public Test10(String name) {
		this.name = name;
		System.out.println("Test10(String name)");
	}

	public Test10(int age, String name) {
		this(name);
		this.age = age;
		this.name = name;
		System.out.println("Test10(int age, String name)");
	}

	public Test10(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Test10 t = new Test10();
		System.out.println(t.age);
		System.out.println(t.name);
	}
}
