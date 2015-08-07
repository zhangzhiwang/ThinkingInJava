package com.asiainfo.chapter7;

/**
 * 继承
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test5 extends E {
	private int num = 2;
	private int i = 2;

	public static void main(String[] args) {
		Test5 t = new Test5();
		System.out.println(t.i);// 子类属性“覆盖”了父类同名属性
		System.out.println(t.age);// 子类调用父类属性
		System.out.println(t.num);// 子类调用自身特有属性

		t.func1();// 子类调用父类方法（子类没有）
		t.func2(1);// 子类调用覆盖了父类的同名方法
		t.func3();// 子类调用自身特有方法
	}

	public void func2(int i) {
		System.out.println("Test5.func2(int i)");
	}

	public void func3() {
		System.out.println("Test5.func3()");
	}
}

class E {
	public int i = 1;
	public int age = 10;

	public void func1() {
		System.out.println("E.func1()");
	}

	public void func2(int num) {
		System.out.println("E.func2(int num)");
	}
}