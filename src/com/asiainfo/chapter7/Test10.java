package com.asiainfo.chapter7;

/**
 * 父类存在重载方法时，子类对其进行覆盖和“重载”
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Test10 extends X {
	public static void main(String[] args) {
		Test10 t = new Test10();
		t.func1();// 子类覆盖父类的同名方法
		t.func1(1L);// 子类“重载”了父类的同名方法（相当于新定义一个方法）
		t.func1(1);// 子类调用父类的方法（子类没有）
		t.func2();
		t.func3();
	}

	@Override
	public void func1() {
		System.out.println("Test10.func1()");
	}

//	@Override // 此处不能加@Override，因为func1(long l)是对父类同名方法的“重载”
	public void func1(long l) {
		System.out.println("Test10.fun1(long l)");
	}

	public void func2() {
		System.out.println("Test10.func2()");
	}
}

class X {
	public void func1() {
		System.out.println("X.func1()");
	}

	public void func1(int i) {
		System.out.println("X.func1(int i)");
	}

	public void func2() {
		System.out.println("X.func2()");
	}

	public void func3() {
		System.out.println("X.func3()");
	}
}