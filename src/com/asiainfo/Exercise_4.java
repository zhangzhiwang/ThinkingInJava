package com.asiainfo;

/**
 * p172练习4
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 上午11:05:16
 */
public class Exercise_4 {
	public static void main(String[] args) {
		NoMethods e1 = new Extension1();
		((Extension1)e1).func1();
		
		WithMethods e2 = new Extension2();
		e2.func1();
	}
}

abstract class NoMethods {}

class Extension1 extends NoMethods {
	public void func1() {
		System.out.println("Extension1.func1()");
	}
}

abstract class WithMethods {
	public void func1() {
		System.out.println("WithMethods.func1()");
	}
}

class Extension2 extends WithMethods {
	@Override
	public void func1() {
		System.out.println("Extension2.func1()");
	}
}