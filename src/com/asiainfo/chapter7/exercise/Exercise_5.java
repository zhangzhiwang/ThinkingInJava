package com.asiainfo.chapter7.exercise;

/**
 * p130Á·Ï°5
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ7ÈÕ
 */
public class Exercise_5 {
	public static void main(String[] args) {
		L l = new L();
	}
}

class J {
	public J() {
		System.out.println("J");
	}
}

class K {
	public K() {
		System.out.println("K");
	}
}

class L extends J {
	K k = new K();

	public L() {
		System.out.println("L");
	}
}