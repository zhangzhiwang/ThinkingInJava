package com.asiainfo.chapter7;

/**
 * 带参数的基类构造器
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test7 extends M {
	public static void main(String[] args) {
		new Test7();
	}

	public Test7() {
		super(1);// 调用父类构造器必须放在子类构造器最开始的部分
		System.out.println("Test7()");
		// super(1);// 不可以放在后面
	}
}

class M extends N {
	public M(int i) {
		System.out.println("M(int i)");// 默认调用N类无参构造器
	}

	public M() {
		System.out.println("M()");
	}
}

class N {
	public N(int i) {
		System.out.println("N(int i)");
	}

	public N() {
		System.out.println("N()");
	}
}
