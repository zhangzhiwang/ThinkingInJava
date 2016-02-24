package com.asiainfo.chapter13;

/**
 * 子类对象调用父类的父类的方法——父亲已经重写过爷爷的方法，那么儿子的引用是不能调用爷爷的方法的
 * 
 * @author zhangzw8
 * @date 2016年2月24日 上午9:32:57
 */
public class Test6 extends E1 {
	public static void main(String[] args) {
		Test6 t = new Test6();
		t.met1();
		t.met2();
		t.eat();
	}

	public void eat() {
		super.met1();
		System.out.println("eat");
	}

	@Override
	public void met1() {
		System.out.println("Test6");
	}
}

class E {
	public void met1() {
		System.out.println("E");
	}

	public void met2() {
		System.out.println("met2");
	}
}

class E1 extends E {
	@Override
	public void met1() {
		System.out.println("E1");
	}
}