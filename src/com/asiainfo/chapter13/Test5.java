package com.asiainfo.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * 无意识的递归
 * 
 * @author zhangzw8
 * @date 2016年2月24日 上午9:07:14
 */
public class Test5 {
	public static void main(String[] args) {
		List<A> l1 = new ArrayList<A>();
		for (int i = 0; i < 3; i++) {
			l1.add(new A(i));
		}
		System.out.println(l1);//打印容器会调用容器的toString()方法，而容器的toString()方法会调用每一个元素的toString()方法
		
		//打印容器对象的内存地址
		List<B> l2 = new ArrayList<B>();
		for (int i = 0; i < 3; i++) {
			l2.add(new B());
		}
//		System.out.println(l2);//Exception in thread "main" java.lang.StackOverflowError 在调用元素B的toString()方法的时候，第一个字符串"world"后面拼接的是一个非String类型的对象，要把this转换成String后再拼接，转换的方法就是调用this的toString()方法，这样就成了递归调用
		
		List<C> l3 = new ArrayList<C>();
		for (int i = 0; i < 3; i++) {
			l3.add(new C());
		}
		System.out.println(l3);
		Object o = new Object();
	}
}

class A {
	private int id;

	public A() {
	}

	public A(int i) {
		id = i;
	}

	@Override
	public String toString() {
		return "hello" + id;
	}
}

class B {
	@Override
	public String toString() {
		return "world" + this;
	}
}

class C {
	@Override
	public String toString() {
		return "hello world " + super.toString();//Object的toString()方法打印的是对象的内存地址，可以看一下源码
	}
}