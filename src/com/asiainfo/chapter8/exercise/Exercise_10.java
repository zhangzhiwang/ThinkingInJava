package com.asiainfo.chapter8.exercise;

/**
 * p155Á·Ï°10
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015Äê8ÔÂ10ÈÕ
 */
public class Exercise_10 extends D{
	@Override
	public void func2() {
		System.out.println("Exercise_10.func2()");
	}
	
	public static void main(String[] args) {
		D d = new Exercise_10();
		d.func1();
	}
}

class D {
	public void func1() {
		func2();
	}
	
	public void func2() {
		System.out.println("D.func2()");
	}
}