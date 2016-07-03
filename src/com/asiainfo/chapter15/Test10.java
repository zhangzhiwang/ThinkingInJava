package com.asiainfo.chapter15;

/**
 * 元组
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 上午9:47:39
 */
public class Test10<A, B> {
	private A a;
	private B b;
	
	public Test10() {}
	
	public Test10(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	
	@Override
	public String toString() {
		return "Test10 [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		Test10<String, Integer> t = new Test10<String, Integer>();
		t.setA("hello");
		t.setB(1);
		System.out.println(t.toString());
	}
}
