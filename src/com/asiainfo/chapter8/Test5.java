package com.asiainfo.chapter8;

/**
 * 构造方法内调用多态方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月14日 下午2:05:06
 */
public class Test5 extends G {
	private int i = 5;

	@Override
	public void func1() {
		System.out.println("Test5.func1()");
		System.out.println("i = " + i);
	}

	public Test5() {
		System.out.println("Test5");
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		new Test5();
	}
}

class G {
	void func1() {
		System.out.println("G.func1()");
	}

	public G() {
		System.out.println("G() begins");
		func1();
		System.out.println("G() ends");
	}
}