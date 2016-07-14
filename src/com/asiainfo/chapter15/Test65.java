package com.asiainfo.chapter15;

/**
 * 多泛型边界
 * 
 * @author zhangzw8
 * @date 2016年7月14日 上午9:26:19
 */
public class Test65<T extends Test65_3 & Test65_1 & Test65_2> {
	private T t;
	
	public void m4() {
		t.m1();
		t.m2();
		t.m3();
		int i = t.NUM;
		String s = t.name;
	}
}

interface Test65_1 {
	void m1();
}

interface Test65_2 {
	int NUM = 1;
	void m2();
}

class Test65_3 {
	public String name;
	
	public void m3() {}
}

class Test65_4 extends Test65_3 implements Test65_1, Test65_2 {
	@Override
	public void m1() {}
	
	@Override
	public void m2() {}
}