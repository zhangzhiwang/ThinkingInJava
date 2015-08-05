package com.asiainfo.chapter5;

/**
 * 可变参数方法的重载
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Test30 {
	public static void main(String[] args) {
		func1(1, 'a');
		func1('a', 'b');
	}

	public static void func1(float f, Character... args) {
		System.out.println(1);
	}

	public static void func1(char c, Character... args) {
		System.out.println(2);
	}
}
