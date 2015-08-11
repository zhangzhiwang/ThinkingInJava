package com.asiainfo.chapter8;

/**
 * 域不存在多态
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Test3 extends E {
	public int num1 = 2;
	public int num3 = 4;

	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.num1);// num1没有覆盖基类的同名域，只是默认调用本类的域而已
		System.out.println(t.num2);

		E e = new Test3();// 多态
		System.out.println(e.num1);// 如果域存在多态的话，那么e.num1=2
//		e.func1();// The method func1() is undefined for the type E 多态不能调用子类特有方法
	}

	public void func1() {
	}
}

class E {
	public int num1 = 1;
	public int num2 = 3;
}