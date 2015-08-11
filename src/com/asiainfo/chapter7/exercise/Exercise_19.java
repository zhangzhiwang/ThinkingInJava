package com.asiainfo.chapter7.exercise;

/**
 * p142练习19
 * @author zhangzhiwang
 * 2015年8月9日
 */
public class Exercise_19 {
	private final D2 d;
	
	public Exercise_19(int i) {
		d = new D2();
	}
	
	public Exercise_19(long l) {
		d = new D2();
	}
	
	public Exercise_19() {
		d = new D2();
	}
	
	public static void main(String[] args) {
		Exercise_19 e = new Exercise_19();
		System.out.println(e.d);
//		e.d = new D2();// The final field Exercise_19.d cannot be assigned
	}
}

class D2 {}
