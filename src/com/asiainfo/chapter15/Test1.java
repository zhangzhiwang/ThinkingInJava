package com.asiainfo.chapter15;

/**
 * 被final修饰的类不能继承，所有构造函数都为private的类不能继承
 *
 * @author zhiwangzhang
 * @date 2016年6月12日 下午8:33:53
 */
public final class Test1 {

}

//class Test1_1 extends Test1 {}

class A {
	private A() {}
	
	public A(int i) {}
}

class A1 extends A{
	public A1() {
		super(1);
	}
}