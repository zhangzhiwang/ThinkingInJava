package com.asiainfo.chapter7.exercise;

/**
 * p130��ϰ6
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015��8��7��
 */
public class Exercise_6 extends O{
	public static void main(String[] args) {
		
	}
	
//	public Exercise_6() {
//		// Implicit super constructor O() is undefined. Must explicitly invoke another constructor �Ҳ��������޲ι�����
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
