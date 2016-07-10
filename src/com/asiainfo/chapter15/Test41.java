package com.asiainfo.chapter15;

import java.util.LinkedList;

/**
 * 利用泛型构建复杂模型
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 上午9:06:37
 */
public class Test41<A, B, C> extends LinkedList<Test41_1<A, B, C>> {
	public static void main(String[] args) {
		Test41<Integer, String, Boolean> t = new Test41<Integer, String, Boolean>();
		t.add(new Test41_1<Integer, String, Boolean>(1, "hello", true));
		t.add(new Test41_1<Integer, String, Boolean>());
		for (Test41_1<Integer, String, Boolean> test : t) {
			System.out.println(test);
		}
	}
}

class Test41_1<A, B, C> {
	private A a;
	private B b;
	private C c;

	public Test41_1(A a, B b, C c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Test41_1() {
		super();
	}

	@Override
	public String toString() {
		return "Test41_1 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}