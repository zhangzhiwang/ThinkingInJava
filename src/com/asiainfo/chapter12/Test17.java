package com.asiainfo.chapter12;

/**
 * 给异常类添加额外的成员和构造器，但在实际应用中，额外添加的成员变量、构造器或方法可能用处不大
 *
 * @author Zhiwang Zhang
 * @date 2016年1月20日 下午9:40:39
 */
public class Test17 extends Exception {
	private int i;

	public Test17() {
	}

	public Test17(String msg) {
		super(msg);
	}

	public Test17(String msg, int i) {
		super(msg);
		this.i = i;
	}

	public static void func1() throws Test17 {
		System.out.println(1);
		throw new Test17();
	}

	public static void func2() throws Test17 {
		System.out.println(2);
		throw new Test17("hello");
	}

	public static void func3() throws Test17 {
		System.out.println(3);
		throw new Test17("world", 123);
	}

	@Override
	public String getMessage() {
		return "abc";
	}

	public static void main(String[] args) {
		try {
			func1();
		} catch (Test17 t) {
			t.printStackTrace();
		}

		try {
			func2();
		} catch (Test17 t) {
			t.printStackTrace();
		}

		try {
			func3();
		} catch (Test17 t) {
			t.printStackTrace();
		}
	}
}
