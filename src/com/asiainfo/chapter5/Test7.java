package com.asiainfo.chapter5;

/**
 * this关键字——表示当前对象的引用
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月4日
 */
public class Test7 {
	public static void main(String[] args) {
		new Test7().func1();
	}

	public void func1() {
		this.func2();// this关键字只能在方法中使用
		func2();// 在方法内部调用同一个类的其他方法时，不必显示地加上this关键字，编译器会自动添加，直接调用该方法即可。在需要使用this关键字的时候才显示地加上它。
	}

	public void func2() {
		System.out.println(1);
	}
}
