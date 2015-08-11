package com.asiainfo.chapter7.exercise;

/**
 * p144练习20
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Exercise_20 extends Car5 {

	@Override
	public void func1() {
		System.out.println("Exercise_20.func1()");
	}

	// @Override// 此方法并非覆盖父类方法，因此加上该注解会报错
	private void func2() {
		System.out.println("Exercise_20.func2()");
	}
}

class Car5 {

	public void func1() {
		System.out.println("Car5.func1");
	}

	private void func2() {
		System.out.println("Car5.func2");
	}
}
