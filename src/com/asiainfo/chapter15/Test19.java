package com.asiainfo.chapter15;

/**
 * 内部类调用外部类的同名方法
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午5:51:47
 */
public class Test19 {
	public void met1() {
		System.out.println("outter");
	}

	public void f() {
		System.out.println("outter f()");
	}

	class A {
		public void met1() {
			System.out.println("inner");
		}

		public void met2() {
			this.met1();
		}

		public void met3() {
			Test19.this.met1();
		}

		public void met4() {
			f();
		}

		public void met5() {
			Test19.this.f();
		}
	}

	public static void main(String[] args) {
		new Test19().new A().met2();
		new Test19().new A().met3();
		new Test19().new A().met4();
		new Test19().new A().met5();
	}
}
