package com.asiainfo.chapter10;

/**
 * 局部内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月20日 上午9:44:50
 */
public class Test8 {
	public A getA() {
		class A1 extends A {
			private String name;

			private A1(String name) {
				this.name = name;
			}

			public A1() {
			}

			@Override
			public String func1() {
				return name;
			}
		}
		return new A1("hello");
	}

	public static void main(String[] args) {
		Test8 t = new Test8();
		A a = t.getA();
		System.out.println(a.func1());
	}
}

class A {
	public String func1() {
		return "A";
	}

}
