package com.asiainfo.chapter5;

/**
 * this作为参数
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test9 {
	private int age;

	public static void main(String[] args) {
		Test9 t = new Test9();
		t.func1();
		System.out.println(t.age);
	}

	public void func1() {
		func2(this);
		System.out.println("func1");
	}

	public void func2(Test9 t) {
		age++;
		System.out.println("func2");
	}
}
