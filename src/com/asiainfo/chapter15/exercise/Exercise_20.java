package com.asiainfo.chapter15.exercise;

/**
 * p275练习20
 *
 * @author zhiwangzhang
 * @date 2016年7月9日 下午5:39:33
 */
public class Exercise_20 {
	public <T extends Exercise_20_1> void m4(T t) {
		t.m1();
		t.m2();
	}
	
	public static void main(String[] args) {
		new Exercise_20().m4(new Exercise_20_1_1());
	}
}

interface Exercise_20_1 {
	void m1();
	void m2();
}

class Exercise_20_1_1 implements Exercise_20_1 {
	@Override
	public void m1() {}
	
	@Override
	public void m2() {}
	
	public void m3() {}
}