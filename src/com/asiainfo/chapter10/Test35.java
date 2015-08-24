package com.asiainfo.chapter10;

/**
 * 内部类的多层嵌套
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午5:42:40
 */
public class Test35 {
	private void func1() {
		System.out.println("Test35.func1()");
	}
	class A {
		public void func2() {
			System.out.println("Test35.A.func2()");
		}
		
		class B {
			public void func3() {
				func2();
				func1();
			}
		}
	}
	
	public static void main(String[] args) {
		new Test35().new A().new B().func3();
	}
}
