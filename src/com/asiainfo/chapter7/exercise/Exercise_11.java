package com.asiainfo.chapter7.exercise;

/**
 * p132练习11
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Exercise_11 {
	public static void main(String[] args) {
		W w = new W();
		w.func1();
		w.func3();
	}
}

class V {
	public void func1() {
		System.out.println("V.func1()");
	}

	public void func2() {
		System.out.println("V.func2()");
	}

	public void func3() {
		System.out.println("V.func3()");
	}
}

class W {
	private V v = new V();

	public void func1() {
		v.func1();
	}

	public void func3() {
		v.func3();
	}
}
