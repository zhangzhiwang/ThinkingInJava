package com.asiainfo.chapter8;

/**
 * 静态方法不存在覆盖
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Test4 extends F {
	public static void main(String[] args) {
		F f1 = new F();
		f1.func1();
		f1.func2();
		System.out.println("------------------");

		F f2 = new Test4();
		f2.func1();
		f2.func2();
		System.out.println("-------------");

		Test4 t = new Test4();
		t.func1();
		t.func2();
		System.out.println("Conclusion:1、静态方法不存在覆盖。如果子类的静态方法和父类的静态方法同名，就相当于子类新定义一个与父类同名的静态方法，此方法为子类特有。 2、子类方法能不能覆盖父类的方法，在方法定义前加上@Override就知道了，所以，要养成一个习惯：复写方法要加上@Override注解");
	}

	public static void func1() {
		System.out.println("Test4.static.func1()");
	}

	public void func2() {
		System.out.println("Test4.func2()");
	}
}

class F {
	public static void func1() {
		System.out.println("F.static.func1()");
	}

	public void func2() {
		System.out.println("F.func2()");
	}
}