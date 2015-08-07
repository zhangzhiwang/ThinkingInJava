package com.asiainfo.chapter7.exercise;

/**
 * p129Á·Ï°4
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ7ÈÕ
 */
public class Exercise_4 extends I {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Exercise_4();
		}
	}

	public Exercise_4() {
		System.out.println("Exercise_4");
		System.out.println("-------------");
		System.out.println();
	}
}

class I {
	public I() {
		System.out.println("I");
	}
}