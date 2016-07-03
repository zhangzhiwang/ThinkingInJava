package com.asiainfo.chapter15;

/**
 * p356练习3
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 上午11:01:14
 */
public class Test13<A, B, C, D, E, F> {
	private A a;
	private B b;
	private C c;
	private D d;
	private E e;
	private F f;

	public Test13() {
	}

	public Test13(A a, B b, C c, D d, E e, F f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	@Override
	public String toString() {
		return "Test13 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + "]";
	}

	public static void main(String[] args) {
		Test13<Integer, String, Boolean, String, Double, String> t = new Test13<Integer, String, Boolean, String, Double, String>(1, "hello", true, "world", 2.0, "abc");
		System.out.println(t);
	}
}
