package com.asiainfo.chapter10;

/**
 * 子类的内部类显示地继承父类的内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月27日 上午9:38:42
 */
public class Test48 extends II {
	class A extends II.A {
		public A() {
			System.out.println("Test48.A");
		}
		
		@Override
		public void func1() {
			System.out.println("Test48.A.func1()");
		}
	}
	
	public static void main(String[] args) {
		II.A a1 = new II().new A();
		a1.func1();
		
		II.A a2 = new Test48().new A();// 多态
		a2.func1();
	}
}

class II {
	class A {
		public A() {
			System.out.println("II.A");
		}
		public void func1() {
			System.out.println("II.A.func1()");
		}
	}
}