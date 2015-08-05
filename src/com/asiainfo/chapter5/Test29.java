package com.asiainfo.chapter5;

/**
 * 基本数据类型（包括包装类）作为参数的方法重载
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test29 {
	public static void main(String[] args) {
		func1(1, 1);
//		func2(1, 1);// The method func2(float, Integer) is ambiguous for the type Test29
	}

	public static void func1(Float f, Integer i) {
	}

	public static void func1(Integer f, Integer i) {
	}

	public static void func2(float f, Integer i) {
	}

	public static void func2(Integer f, Integer i) {
	}

}
