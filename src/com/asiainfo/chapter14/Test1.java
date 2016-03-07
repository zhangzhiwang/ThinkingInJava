package com.asiainfo.chapter14;

/**
 * 获取Class对象
 * 
 * @author zhangzw8
 * @date 2016年3月7日 上午9:46:40
 */
public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.asiainfo.chapter14.A");// 获取Class对象方法一：通过类名来获取该类的Class对象，如果该类还没有被加载则导致该类的加载
		B b = new B();
		Class c2 = b.getClass();// 获取Class对象方法二：对于一个已实例化（已加载）的某一类型的对象，获取其Class对象可用Object的getClass()方法
	}
}

class A {
	static {
		System.out.println("A");
	}
}

class B {
}