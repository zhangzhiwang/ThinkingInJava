package com.asiainfo.chapter10.exercise;

import com.asiainfo.chapter10.*;

/**
 * p199练习12
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 上午11:26:44
 */
public class Exercise_12 {
	private int i = 1;

	private void func1() {
		System.out.println("Exercise_12.func1()");
	}

	public void func2() {
		new L() {
			public void func3() {
				System.out.println("i = " + i);
				Exercise_12.this.i = 2;
				Exercise_12.this.func1();
				System.out.println("i = " + i);
				
			}
		}.func3();
	}
	
	public static void main(String[] args) {
		Exercise_12 e = new Exercise_12();
		e.func2();
	}
}

class L {
	public L() {
		System.out.println("L");
	}

	public void func1() {
		System.out.println("L.func1()");
	}
}