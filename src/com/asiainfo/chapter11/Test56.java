package com.asiainfo.chapter11;

/**
 * Queue是如何窄化LinkedList方法的访问权限的？——多太
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月29日 上午11:45:33
 */
public class Test56 {
	public static void main(String[] args) {
		A11 a = new C11();
		a.func1();
	}
}

interface A11 {
	void func1();
}

interface B11 {
	void func2();
}

class C11 implements A11, B11 {
	public void func1() {
	}

	public void func2() {
	}

	public void func3() {
	}
}