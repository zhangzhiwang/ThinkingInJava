package com.asiainfo.chapter10;

/**
 * 内部类和外围类方法重名
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午4:05:48
 */
public class Test30 {
	
	public void func1() {
		System.out.println("Test30.func1()");
	}
	
	public void func2() {
		System.out.println("Test30.func2()");
	}
	
	class A {
		public void func1() {
			System.out.println("A.func1()");
			Test30.this.func1();// 如果去掉Test30.this.编译不会报错，但运行时会出问题（无限递归，默认调用的是方法本身），所以尽量避免外围类和内部类出现同名的现象
			func2();
		}
	}
	
	public static void main(String[] args) {
		new Test30().new A().func1();
	}
}
