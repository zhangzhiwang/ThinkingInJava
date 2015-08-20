package com.asiainfo.chapter10;

/**
 * 匿名内部类调用父类的有参构造器
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 下午2:26:38
 */
public class Test18 {
	public J getJ1(int i) {
		return new J(i) {
			@Override
			public void func1() {
				System.out.println("Test18.getJ1(int i).func1()");
			}

			public void func2() {
				super.func1();
			}
		};
	}

	public static void main(String[] args) {
		Test18 t = new Test18();
		J j = t.getJ1(1);
		j.func1();
	}
}

class J {
	private int i;

	public J() {
		System.out.println("J()");
	}

	public J(int i) {
		this.i = i;
		System.out.println("J(int i)");
	}

	public void func1() {
		System.out.println("J.func1()");
	}
}