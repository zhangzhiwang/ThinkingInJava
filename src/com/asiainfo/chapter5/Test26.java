package com.asiainfo.chapter5;

/**
 * 可变参数方法的重载
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test26 {
	public static void main(String[] args) {
		func1();
		func2(1);
		func2('a');
		func3(1, 'a');
//		func3('a', 'b');
//		func4(1, 1);
//		func4(1);
	}

	public static void func1(long... args) {
		System.out.println(2);
	}

	public static void func1(int... args) {
		System.out.println(1);
	}

	public static void func2(float f) {
		System.out.println("func2(float f)");
	}

	public static void func2(char c) {
		System.out.println("func2(char c)");
	}

	public static void func3(float f, Character... args) {
		System.out.println("func3(float f,char... args)");
	}

	public static void func3(Character... args) {
		System.out.println("func3(char... args)");
	}
	public static void func4(float f, Integer... args) {
		System.out.println("func3(float f,char... args)");
	}
	
	public static void func4(Integer... args) {
		System.out.println("func3(char... args)");
	}
}
