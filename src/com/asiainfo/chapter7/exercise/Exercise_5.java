package com.asiainfo.chapter7.exercise;

/**
 * p130��ϰ5
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
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