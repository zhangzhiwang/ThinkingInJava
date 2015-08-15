package com.asiainfo.chapter8;

/**
 * 对象初始化顺序
 * 
 * @author zhangzhiwang
 * @date 2015年8月15日 下午2:47:20
 */
public class Test6 extends H {
	int age = 5;
	A a = new A();
	boolean b = true;

	public Test6() {
		System.out.println("Test6");
		System.out.println("age = " + age);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public void func1() {
		System.out.println("Test6.func1()");
		System.out.println("age = " + age);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public void func2() {
		System.out.println("Test6.func2()");
	}

//	public void func3() {// Cannot override the final method from H
//		System.out.println("H.func3()");
//	}
	
	public static void main(String[] args) {
		new Test6();
	}
}

class H {
	int num = 1;

	public H() {
		System.out.println("H begins");
		System.out.println("num = " + num);
		func1();
		func2();
		func3();
		System.out.println("H ends");
	}

	public void func1() {
		System.out.println("H.func1()");
	}

	private void func2() {
		System.out.println("H.func2()");
	}
	
	public final void func3() {
		System.out.println("H.func3()");
	}
}
/*
 * 初始化的过程：
 * 1、在new某个类的对象时，在调用父类构造方法之前，先将分配给该对象的存储空间初始化成二进制的零，所以该对象的所有属性为其默认值
 * 2、调用父类构造器
 * 3、按照一定顺序初始化成员变量
 * 4、调用本类的构造器
 * 另外，尽量不要在构造其中调用多太方法，在构造器内可以调用的唯一安全的方法是final方法   15801685
 */