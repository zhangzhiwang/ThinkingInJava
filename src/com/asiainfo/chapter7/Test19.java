package com.asiainfo.chapter7;

/**
 * private方法不能被继承
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Test19 extends Car4 {
	public static void main(String[] args) {
		Test19 t = new Test19();
		t.func1();
		t.func2();
		
		Car4 t2 = new Test19();
//		t2.func1();// The method func1() from the type Car4 is not visible
		t2.func2();
	}

	private void func1() {// 不是覆盖，而是重新定义了一个方法
		System.out.println("Test19.func1()");
	}
	
	public void func2() {
		System.out.println("Test19.func2()");
	}
}

class Car4 {
	private void func1() {
		System.out.println("Car4.func1()");
	}

	public void func2() {
		System.out.println("Car4.func2()");
	}
}
