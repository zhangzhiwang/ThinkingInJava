package com.asiainfo.chapter15;

/**
 * 泛型边界
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 下午5:11:51
 */
public class Test43<T> {
	private T t;
	
	public Test43() {}
	
	public Test43(T t) {
		this.t = t;
	}
	
	public void m1() {
//		t.m2();//The method m2() is undefined for the type T   编译器不知道在使用Test43的时候泛型一定传的就是Test43_1或者其它含有m2()方法的类型，要想使用t.m2()，必须给泛型定一个边界，见Test43_2
	}
}

class Test43_1 {
	public void m2() {}
}

class Test43_1_1 extends Test43_1 {}

class Test43_2<T extends Test43_1> {
	private T t;
	
	public Test43_2() {}
	
	public Test43_2(T t) {
		this.t = t;
	}
	
	public void m3() {
		t.m2();//泛型边界<T extends Test43_1>能保证T是Test43_1类型或其子类
	}
}