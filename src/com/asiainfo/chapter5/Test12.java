package com.asiainfo.chapter5;

/**
 * 静态方法与非静态方法之间的互相调用
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test12 {
	private int age;
	private static String name;

	public static void main(String[] args) {
		Test12 t = new Test12();
		t.func1();// 静态方法里面可以调用非静态方法，但是不能直接调用，因为static方法没有this
		// func1();
	}

	public void func1() {
		func2();// 非静态方法之所以可以直接调用另一个非静态方法是因为非静态方法中有this，this有编译器自动默认添加，无需显示指明this
		this.func2();// 由于编译器自动添加this，所以不建议显示写出this
		System.out.println(age);// 域同理
		System.out.println(this.age);// 不建议
	}

	public void func2() {
		func3();// 非static方法可以直接调用static方法和域
		System.out.println(name);
	}

	public static void func3() {
		func4();// static方法可以直接调用static方法和域
		System.out.println(name);
		// System.out.println(age);
	}

	public static void func4() {
	}
}
