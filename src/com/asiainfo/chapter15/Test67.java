package com.asiainfo.chapter15;

/**
 * 泛型复杂示例
 *
 * @author zhiwangzhang
 * @date 2016年7月14日 下午9:46:34
 */
public class Test67 {
	
}

interface SuperTest67I {}

interface Test67I extends SuperTest67I {
	void m1();

	void m2();
}

interface Test67_1 extends Test67I {
	void m3();
}

interface Test67_2 extends Test67I {
	void m4();
}

interface Test67_3 extends Test67I {
	void m5();
}

class Test67_1_1 implements Test67_1 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
}

class Test67Fa<T extends Test67I> {
	public T t;
	
	public Test67Fa() {}
	
	public Test67Fa(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
	
	public void m6() {
		t.m1();
		t.m2();
	}
}

class Test67Son1<T extends Test67I> extends Test67Fa<T>{}

class Test67Son2<T extends Test67_1> extends Test67Fa<T>{
	public Test67Son2() {}
	
	public Test67Son2(T t) {
		super(t);
	}
}

//class Test67Son3<T extends SuperTest67I> extends Test67Fa<T>{}//子类的泛型边界不能是（或包括）父类的泛型边界的父类。想想为什么，可以从多太或转型角度考虑