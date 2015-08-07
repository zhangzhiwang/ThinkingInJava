package com.asiainfo.chapter7.exercise;

/**
 * p130练习6
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015年8月7日
 */
public class Exercise_6 extends O{
	public static void main(String[] args) {
		
	}
	
//	public Exercise_6() {
//		// Implicit super constructor O() is undefined. Must explicitly invoke another constructor 找不到父类无参构造器
//	}
	
//	public Exercise_6() {
//		System.out.println("Exercise_6");
//		super(1);// Constructor call must be the first statement in a constructor
//	}
	
	public Exercise_6() {
		super(1);
		System.out.println("Exercise_6");
	}
}

class O {
	public O(int i) {}
}
