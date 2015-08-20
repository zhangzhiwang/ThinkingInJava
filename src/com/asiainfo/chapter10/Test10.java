package com.asiainfo.chapter10;

/**
 * 局部内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午9:56:29
 */
public class Test10 {
	interface A {
		int i = 1;
		
		void func1();
	}
	
	public A getA() {
		class A1 implements A {
			@Override
			public void func1() {
				System.out.println("Test10.getA().A1.func1()");
			}
		}
		return new A1();
	}
	
	public static void main(String[] args) {
		Test10 t = new Test10();
		A a = t.getA();
		a.func1();
		System.out.println(a.i);
	}
}
