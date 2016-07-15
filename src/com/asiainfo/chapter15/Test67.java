package com.asiainfo.chapter15;

/**
 * 泛型复杂示例
 *
 * @author zhiwangzhang
 * @date 2016年7月14日 下午9:46:34
 */
public class Test67 {
	public <T extends Test67_2> void f1(Test67Fa<T> test67Fa) {
		test67Fa.getT().m4();
		test67Fa.getT().m1();
		test67Fa.getT().m2();
	}
	
	public <T extends Test67_2 & Test67_3> void f2(Test67Fa<T> test67Fa) {
		test67Fa.getT().m4();
		test67Fa.getT().m5();
		test67Fa.getT().m1();
		test67Fa.getT().m2();
	}
	
	public static void main(String[] args) {
		Test67 test67 = new Test67();
		DogBoy d = new DogBoy();
		test67.f1(d);
		test67.f2(d);
	}
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
	
	public void m7() {
		t.m3();
	}
}

class Test67Son3<T extends Test67_2 & Test67_3> extends Test67Fa<T> {
	public Test67Son3() {}
	
	public Test67Son3(T t) {
		super(t);
	}
	
	public void m8() {
		t.m4();
		t.m5();
	}
}

class Test67_2_3 implements Test67_2, Test67_3 {
	public void m4() {}
	
	public void m5() {}
	
	public void m1() {}
	
	public void m2() {}
}

class DogBoy extends Test67Son3<Test67_2_3> {
	public DogBoy() {
		super(new Test67_2_3());
	}
}

//class Test67Son3<T extends SuperTest67I> extends Test67Fa<T>{}//子类的泛型边界不能是（或包括）父类的泛型边界的父类。想想为什么，可以从多太或转型角度考虑