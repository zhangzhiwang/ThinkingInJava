package com.asiainfo.chapter7;

/**
 * final方法——使用final方法只有一个目的，即防止被覆盖
 * @author zhangzhiwang
 * 2015年8月9日
 */
public class Test17 extends Car3{
	public static void main(String[] args) {
		Test17 t = new Test17();
		t.func1();
		t.func2();
	}
	
	public void func1() {
		System.out.println("Test17.func1()");
	}
	
//	public final void func2() {// Cannot override the final method from Car3
//		System.out.println("Test17.func2()");
//	}
}

class Car3 {
	public void func1() {
		System.out.println("Car3.func1()");
	}
	
	public final void func2() {
		System.out.println("Car3.func2()");
	}
}