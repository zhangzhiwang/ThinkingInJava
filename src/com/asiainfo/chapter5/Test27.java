package com.asiainfo.chapter5;

/**
 * 可变参数方法的重载
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test27 {
	public static void main(String[] args) {
		func1(1);
//		func2(1, 1);
		func3(1, 1);
//		func4(1, 1);// The method func4(float, Integer[]) is ambiguous for the type Test27
	}

	public static void func1(float f) {
		System.out.println("func1(Float f)");
	}

	public static void func1(Integer i) {
		System.out.println("func1(Integer i)");
	}

	public static void func2(float f, Integer i) {
		System.out.println("func2(Float f, Integer i)");
	}

	public static void func2(Integer f, Integer i) {
		System.out.println("func2(Float f, Integer i)");
	}

	public static void func3(Float f, Integer... args) {
		System.out.println("func3(Float f,Integer... args)");
	}

	public static void func3(Integer... args) {
		System.out.println("func3(Float f,Integer... args)");
	}

	public static void func4(float f, Integer... args) {
		System.out.println("func3(Float f,Integer... args)");
	}

	public static void func4(Integer... args) {
		System.out.println("func3(Float f,Integer... args)");
	}
}
