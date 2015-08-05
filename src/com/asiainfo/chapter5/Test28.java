package com.asiainfo.chapter5;

/**
 * 基本数据类型（包括包装类）作为参数的方法重载
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test28 {
	public static void main(String[] args) {
		func1(1);
		func1(new Float(1));
	}

	public static void func1(float f) {
		System.out.println("func1(float f)");
	}

	public static void func1(Float f) {
		System.out.println("func1(Float f)");
	}
}
