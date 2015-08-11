package com.asiainfo.chapter7;

/**
 * protected继承访问权限（包访问权限）
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Test12 {
	protected static int age = 1;

	protected static void func() {
		System.out.println("Test12.func()");
	}

	public static void main(String[] args) {
		System.out.println(Y.i);// protected兼具包访问权限
		new Y().func();
	}
}

class Y {
	protected static int i = 1;

	protected void func() {
		System.out.println("Y.func()");
	}
}