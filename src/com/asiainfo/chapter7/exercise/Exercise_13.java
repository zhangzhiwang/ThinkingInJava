package com.asiainfo.chapter7.exercise;

import com.asiainfo.chapter7.Test12;

/**
 * p136练习13
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Exercise_13 extends Y {
	public static void main(String[] args) {
		new Exercise_13().func1();
		new Exercise_13().func1((byte) 1);
		new Exercise_13().func1(1);
		new Exercise_13().func1(1f);
	}

	public void func1(byte b) {
		System.out.println("Exercise_13.func1(byte b)");
	}
}

class Y {
	public void func1() {
		System.out.println("Y.func1()");
	}

	public void func1(int i) {
		System.out.println("Y.func1(int i)");
	}

	public void func1(float f) {
		System.out.println("Y.func1(float f)");
	}
}