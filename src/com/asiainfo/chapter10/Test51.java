package com.asiainfo.chapter10;

/**
 * 局部内部类or匿名内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月28日 上午9:11:00
 */
public class Test51 {
	private int count = 0;

	public LL get1() {
		class A implements LL {// 局部内部类相对于匿名内部类的优点：1、局部内部类可以有构造器的重载，内匿名内部类只能有一个“构造器” 2、局部内部类可以实例化多个对象，而匿名内部类由于只能使用一次，故只能实例化一个对象
			@Override
			public int next() {
				return ++Test51.this.count;// Test51.this可以省略
			}
		}
		return new A();
	}

	public LL get2() {
		return new LL() {
			@Override
			public int next() {
				return ++Test51.this.count;
			}
		};
	}

	public static void main(String[] args) {
		Test51 t = new Test51();
		LL ll1 = t.get1();
		LL ll2 = t.get2();

		for (int i = 0; i < 10; i++) {
			System.out.println(ll1.next());
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(ll2.next());
		}
	}
}

interface LL {
	int next();
}