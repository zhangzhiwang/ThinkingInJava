package com.asiainfo.chapter7;

/**
 * 向上转型
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test13 extends A1 {
	public static void main(String[] args) {
		A1.func1(new Test13());
	}
}

class A1 {
	public static void func1(A1 a1) {
		System.out.println("A1.func1()");
	}
}
