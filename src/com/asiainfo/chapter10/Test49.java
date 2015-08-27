package com.asiainfo.chapter10;

/**
 * 在外部类没有继承的情况下，内部类继承内部类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月27日 上午9:49:42
 */
public class Test49 {
	public Test49() {
		System.out.println("Test49");
	}

	class B extends JJ.A {
		public B(JJ jj) {
			jj.super();
			System.out.println("Test49.B");
		}
	}

	public static void main(String[] args) {
		new Test49().new B(new JJ());// 注意初始化的顺序
	}
}

class JJ {
	public JJ() {
		System.out.println("JJ");
	}

	class A {
		public A() {
			System.out.println("JJ.A");
		}
	}
}