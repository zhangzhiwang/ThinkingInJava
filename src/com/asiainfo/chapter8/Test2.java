package com.asiainfo.chapter8;

/**
 * 基类的private方法不会被覆盖
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Test2 extends D {
	// @Override
	public void func1() {// 该方法并非覆盖父类的同名方法，而是新定义一个，在方法前面加上@Override就会报错。所以，为了安全起见，在复写父类的方法时，前面要加上@Override注解，以防类似情况出现
		System.out.println("Test2.public.func1()");
	}

	public void func2() {
	}// func1()和func2()本质上是一样的，都是子类特有的方法
}

class D {
	private void func1() {
		System.out.println("D.private.func1");
	}

	public void func3() {
		System.out.println("D.func3()");
	}

	public static void main(String[] args) {
		D d = new Test2();
		d.func1();
		d.func3();
	}
}
