package com.asiainfo.chapter15;

/**
 * 元组继承
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 上午9:54:32
 */
public class Test11<A, B, C> extends Test10<A, B> {
	private C c;

	public Test11() {
	}

	public Test11(A a, B b, C c) {
		super(a, b);
		this.c = c;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public A getA() {
		return super.getA();
	}

	public B getB() {
		return super.getB();
	}

	@Override
	public String toString() {
		return "Test11 [c=" + c + "]" + "super:" + super.toString();
	}

	public static void main(String[] args) {
		Test11<Integer, String, String> t = new Test11<Integer, String, String>(1, "hello", "world");
		System.out.println(t);
	}
}

class Test11_1<A, B, C, D, E> extends Test11<A, C, E> {
	private B b;
	private D d;
	
	public Test11_1() {}
	
	public Test11_1(A a, B b, C c,D d,E e) {
		super(a, c, e);
		this.b = b;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Test11_1 [b=" + b + ", d=" + d + "]" + "---super:" + super.toString();
	}
	
	public static void main(String[] args) {
		Test11_1<Integer, Boolean, Double, String, String> t = new Test11_1<Integer, Boolean, Double, String, String> (1, true, 2.0, "hello", "world");
		System.out.println(t.toString());
	}
}
