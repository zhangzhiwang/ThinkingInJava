package com.asiainfo.chapter7.exercise;

/**
 * p130��ϰ7
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
 */
public class Exercise_7 {
	public static void main(String[] args) {
		new R();
	}
}

class P {
	public P(int i) {
		System.out.println("P(int i)");
	}
}

class Q {
	public Q(int i) {
		System.out.println("Q(int i)");
	}
}

class R extends P {
	Q q;

	public R() {
		super(1);
		q = new Q(1);
		System.out.println("R()");
	}
}
