package com.asiainfo.chapter15.exercise;

/**
 * p389练习25
 *
 * @author zhiwangzhang
 * @date 2016年7月15日 上午7:18:08
 */
public class Exercise_25 {
	public <T extends A> T m1() {
		return null;
	}
	
	public <T extends B> void m2(T t) {}
	
	public static void main(String[] args) {
		C c = new C();
		
		Exercise_25 e = new Exercise_25();
		C c1 = e.m1();
		e.m2(c);
	}
}

interface A {}

interface B {}

class C implements A ,B {}