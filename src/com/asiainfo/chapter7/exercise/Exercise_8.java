package com.asiainfo.chapter7.exercise;

/**
 * p130Á·Ï°8
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ7ÈÕ
 */
public class Exercise_8 {
	public static void main(String[] args) {
		new T();
		new T(1);
	}
}

class S {
	public S(int i) {
		System.out.println("S(int i)");
	}
}

class T extends S {
	public T(int i) {
		super(i);
		System.out.println("T(int i)");
	}

	public T() {
		super(1);
		System.out.println("T()");
	}
}
