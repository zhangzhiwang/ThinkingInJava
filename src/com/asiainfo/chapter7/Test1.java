package com.asiainfo.chapter7;

/**
 * 组合
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test1 {
	private int i;
	private A a1;
	private A a2 = new A();

	@Override
	public String toString() {
		return "Test1 [i=" + i + ", a1=" + a1 + ", a2=" + a2 + "]";
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println(t.toString());
	}
}

class A {
	public A() {
		System.out.println("build A");
	}

	public String toString() {
		return "123";
	}
}