package com.asiainfo.chapter10;

/**
 * 内部类对象对外部类对象的引用——.this
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月19日 下午3:01:50
 */
public class Test4 {
	public void func1() {
		System.out.println("Exercise_3.func1()");
	}
	
	public A get() {
		return new A();
	}
	
	public class A {
		public Test4 getOuter() {
			return Test4.this;
		}
		
		public void func2() {
			func1();// 相当于Test4.this.func1();
//			this.func1();// The method func1() is undefined for the type Test4.A
			Test4.this.func1();
		}
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		A a = t.get();
		a.getOuter().func1();
		System.out.println(t == a.getOuter());// 这个测试有助于理解：内部类对象默认持有一个外部类对象的引用
	}
}
