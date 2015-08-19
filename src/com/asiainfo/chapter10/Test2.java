package com.asiainfo.chapter10;

/**
 * 内部类分别在外部类的属性、非静态方法、静态方法处实例化的区别
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 上午11:29:55
 */
public class Test2 {
	private A a1 = new A();
//	private static A a5 = new A();// No enclosing instance of type Test2 is accessible. Must qualify the allocation with an enclosing instance of type Test2 (e.g. x.new A() where x is an instance of Test2).
	
	public class A {}
	
	public A getA() {
		A a3 = new A();
		return a3;
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		A a2 = t.getA();
		A a4 = t.new A();
		
	}
}
