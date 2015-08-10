package com.asiainfo.chapter7;

/**
 * 调用静态成员省略类名的情况
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015年8月10日
 */
public class Test101 extends Car102{
	static int i1 = 1;
	
	public static void main(String[] args) {
		System.out.println(i1);// 调用本类的静态成员（域或方法）不用显示地写出类名
		func1();
		
		System.out.println(i2);// 调用父类的静态成员（域或方法）也不需要显示地写出类名
		System.out.println(Test101.i2);
		System.out.println(Car102.i2);
		func2();
		Test101.func2();
		Car102.func2();
	}
	
	public static void func1() {}
}

class Car102 {
	public static int i2 = 2;
	
	public static void func2() {}
}