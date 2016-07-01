package com.asiainfo.chapter15;

/**
 * 泛型与多太不冲突
 * 
 * @author zhangzw8
 * @date 2016年7月1日 上午11:27:35
 */
public class Test7<A> {
	private A a;
	
//	public Test7<A>() {}//不必这么写，去掉泛型
	public Test7() {}
	
	public Test7(A a) {
		this.a = a;
	}
	
	public void set(A a) {
		this.a = a;
	}
	
	public A get() {
		return a;
	}
	
	public static void main(String[] args) {
		Test7<C> t = new Test7<C>(new C());
		Test7<C> t2 = new Test7<C>(new C_1());
		Test7<C> t3 = new Test7<C>();
		t3.set(new C());
		C c1 = t3.get();
		t3.set(new C_1());
		C_1 c2 = (C_1)t3.get();
		
		Test7 test7 = new Test7();
		test7.set("hello");
		Object o = test7.get();
		String s = (String) test7.get();
		test7.set(123);
		Object o2 = test7.get();
		Integer i = (Integer) test7.get();
	}
}

class C {}

class C_1 extends C {}
