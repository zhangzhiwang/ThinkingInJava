package com.asiainfo.chapter10;

/**
 * 内部类的继承
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月26日 上午8:21:35
 */
public class Test44 extends DD.A {
//	public Test44() {}// No enclosing instance of type DD is available due to some intermediate constructor invocation
	public Test44(DD dd) {
		dd.super(1);
		System.out.println("Test44(DD dd)");
	}
	
	public static void main(String[] args) {
		DD dd = new DD();
		Test44 t = new Test44(dd);
	}
}

class DD {
	public DD() {
		System.out.println("DD()");
	}
	
	class A {
		public A(int i) {
			System.out.println("A(int i)");
		}
		
		public A() {}
	}
}