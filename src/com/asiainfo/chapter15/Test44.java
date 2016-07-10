package com.asiainfo.chapter15;

/**
 * 反省边界2
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 下午5:29:56
 */
public class Test44<T extends Test43_1> {
	private T t;
	
	public Test44() {}
	
	public Test44(T t) {
		this.t = t;
	}
	
	public void m1() {
		t.m2();
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Test44<Test43_1_1> t1 = new Test44<Test43_1_1>();
		t1.setT(new Test43_1_1());
		Test43_1_1 t2 = t1.getT();
		
		Test44_1 t3 = new Test44_1();
		t3.setT(new Test43_1_1());
		Test43_1_1 t4 = (Test43_1_1) t3.getT();
	}
}

class Test44_1 {
	private Test43_1 t;
	
	public Test44_1() {}
	
	public Test44_1(Test43_1 t) {
		this.t = t;
	}
	
	public void m3() {
		t.m2();
	}

	public Test43_1 getT() {
		return t;
	}

	public void setT(Test43_1 t) {
		this.t = t;
	}
	
	
}