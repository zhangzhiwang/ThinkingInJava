package com.asiainfo.chapter6.exercise;

/**
 * p120Á·Ï°5
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ6ÈÕ
 */
public class Exercise_5 {
	private int i1 = 1;
	protected int i2 = 2;
	int i3 = 3;
	public int i4 = 4;
}

class Car6 {
	public void func() {
		Exercise_5 e= new Exercise_5();
//		System.out.println(e.i1);
		System.out.println(e.i2);
		System.out.println(e.i3);
		System.out.println(e.i4);
	}
}