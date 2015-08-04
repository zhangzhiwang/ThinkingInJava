package com.asiainfo.chapter5;

/**
 * 成员变量初始值（默认值）
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test13 {
	private byte b;
	private short s;
	private char c;
	private int i;
	private long l;
	private float f;
	private double d;
	private boolean boo;
	private Test13 t;
	private Truck tr;

	public static void main(String[] args) {
		Test13 test = new Test13();
		System.out.println(test.b);
		System.out.println(test.s);
		System.out.println(test.c);
		System.out.println(test.i);
		System.out.println(test.l);
		System.out.println(test.f);
		System.out.println(test.d);
		System.out.println(test.boo);
		System.out.println(test.t == null);
		System.out.println(test.tr == null);
	}
}

class Truck {
}
