package com.asiainfo.chapter5;

/**
 * 构造方法重载
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月3日
 */
public class Test3 {
	private int age;
	private String name;

	public Test3(int age) {
		this.age = age;
	}

	public Test3(String name) {
		this.name = name;
	}

	public Test3(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Test3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Test3() {
	}

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		System.out.println(t1.age);
		System.out.println(t1.name);

		Test3 t2 = new Test3(1);
		System.out.println(t2.age);
		System.out.println(t2.name);

		Test3 t3 = new Test3("Tom");
		System.out.println(t3.age);
		System.out.println(t3.name);

		Test3 t4 = new Test3(2, "Jemmy");
		System.out.println(t4.age);
		System.out.println(t4.name);

		Test3 t5 = new Test3("Bill", 3);
		System.out.println(t5.age);
		System.out.println(t5.name);
	}
}
