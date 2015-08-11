package com.asiainfo.chapter3;

/**
 * 静态导入——模拟工具类
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test30 {
	public static int i = 1;
	public static int num = 10;

	private Test30() {
	}

	public static void func1() {
		System.out.println("Test30.func1()");
	}

	public void func2() {
		System.out.println("Test30.func2()");
	}

	public static void func3() {
		System.out.println("Test30.func3()");
	}
}
