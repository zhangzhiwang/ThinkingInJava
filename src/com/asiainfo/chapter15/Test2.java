package com.asiainfo.chapter15;

/**
 * 类型参数——在类定义时，类型参数用<>括起来放在类名后面
 *
 * @author zhiwangzhang
 * @date 2016年6月12日 下午9:11:56
 */
public class Test2<T> {
	private T t;
	public Test2() {}
	
	public Test2(T t) {
		this.t = t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		Test2<A> t1 = new Test2<A>();
		A a1 = t1.get();
		
		Test2<A> t2 = new Test2<A>();
		t2.set(new A(1));
		A a2 = t2.get();
	}
}
