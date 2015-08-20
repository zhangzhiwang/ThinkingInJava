package com.asiainfo.chapter10;

/**
 * 局部内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午10:03:39
 */
public class Test11 {
	public static void main(String[] args) {
		C c = new C();
		B b = c.getB();
		System.out.println("-------------");
		b.func1();
	}
}

class B {
	private int i;
	private D d = new D();

	public B() {
	}

	public B(int i) {
		System.out.println("B(int i)");
		this.i = i;
		func1();
	}

	public void func1() {
	}
}

class C {
	private D d = new D(1, "");

	public C() {
		System.out.println("C");
	}

	public B getB() {
		class B1 extends B {
			private int num = 10;
			private D d = new D(1);

			public B1() {
				super(1);
				System.out.println("B1");
			}

			public B1(int num) {
				this.num = num;
			}

			public void func1() {
				System.out.println("num = " + num);
				System.out.println("d = " + d);
			}
		}
		return new B1();
	}
}

class D {
	public D() {
		System.out.println("D");
	}

	public D(int i) {
		System.out.println("D(int i)");
	}

	public D(int i, String s) {
		System.out.println("D(int i, String s)");
	}
}