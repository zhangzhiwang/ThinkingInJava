package com.asiainfo.chapter10;

/**
 * 内部类可以访问外部类的方法和属性
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午2:30:54
 */
public class Test3 {
	public int i = 1;
	
	public void func1() {
		System.out.println("Test3.func1()");
	}
	
	public A getA() {
		return new A();
	}
	
	public class A {
		public void func2() {
			System.out.println(i);// 内部类访问外部类的属性
			func1();// 内部类访问外部类的方法
			System.out.println("内部类对象默认获得一个指向外部类对象的引用，因为内部类对象是由外部类对象创建的");
		}
	}
}
