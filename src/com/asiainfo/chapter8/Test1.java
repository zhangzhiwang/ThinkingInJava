package com.asiainfo.chapter8;

/**
 * 动态绑定
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Test1 extends A {
	public void func1() {
		System.out.println("Test1.func1()");
	}

	public static void func2(A a) {
		a.func1();
	}

	public static void main(String[] args) {
		func2(new B());// upcasting
		func2(new Test1());
		func2(new A());
	}
}

class A {
	public void func1() {
		System.out.println("A.func1()");
	}
}

class B extends A {
	public void func1() {
		System.out.println("B.func1()");
	}
}