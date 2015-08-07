package com.asiainfo.chapter7;

/**
 * 4种初始化成员变量的方式
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test2 {
	private B b1 = new B();// 在定义处初始化
	private B b2;
	private static B b3;
	private B b4;
	private static B b5;

	{
		b2 = new B();// 用代码块初始化
		// b3 = new B();
	}

	static {
		b3 = new B();
	}

	public Test2() {
		b4 = new B();// 构造方法初始化
	}

	public static void main(String[] args) {
		b5 = new B();// 惰性初始化——在使用前初始化
		System.out.println(b5.toString());
		System.out.println("---------------");
		System.out.println(new Test2().b1);
		System.out.println(new Test2().b2);
		System.out.println(b3);
		System.out.println(new Test2().b4);
		System.out.println(b5);
		// 无论哪种初始化，必须保证在对象被使用前进行初始化，否则可能会抛异常
	}
}

class B {
}
