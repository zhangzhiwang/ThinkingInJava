package com.asiainfo.chapter6;

import com.asiainfo.chapter6.exercise.Exercise_4;

/**
 * 继承访问权限（同时具有包访问权限）——protected
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月6日
 */
public class Test8 {
	protected static String name = "Test8";
	static int age = 1;

	public static void main(String[] args) {
		System.out.println(Test8.name);
		System.out.println(Test8.age);
	}
}

class Car4 {
	public void func() {
		System.out.println(Test8.name);// protected兼具有包访问权限
	}
}

class Car5 extends Test8{
	public void func() {
		System.out.println(Test8.name);// 继承访问权限
	}
}