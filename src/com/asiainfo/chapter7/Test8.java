package com.asiainfo.chapter7;

/**
 * 代理
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Test8 {
	private U u = new U();

	public void func1() {
		u.func1();
	}

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.func1();
	}
}

class U {
	public void func1() {
		System.out.println("U.func1()");
	}

	public void func2() {
		System.out.println("U.func2()");
	}
}
