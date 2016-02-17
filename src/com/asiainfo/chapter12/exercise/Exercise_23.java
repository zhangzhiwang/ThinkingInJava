package com.asiainfo.chapter12.exercise;

/**
 * p275练习23
 * 
 * @author zhangzw8
 * @date 2016年1月31日 下午3:00:47
 */
public class Exercise_23 {
	public static void main(String[] args) {
		for (boolean b = false;; b = !b) {
			System.out.println("hello");
			try {
				FailingConstructor2 f = new FailingConstructor2(b);
			} catch (A a) {
				System.out.println("Caught a:" + a.getMessage());
				break;
			} finally {
				System.out.println("Cleanup...");
			}
		}
	}
}

class CanErase {
	public CanErase(int i) {
		System.out.println("Creating CanErase " + i);
	}

	public CanErase() {
	}

	public void dispose(int i) {
		System.out.println("Disposing CanErase " + i);
	}
}

class FailingConstructor2 {
	private CanErase c1;
	private CanErase c2;

	public FailingConstructor2(boolean b) throws A {
		c1 = new CanErase(1);
		try {
			if (b) {
				throw new A();
			}
		} catch (A a) {
			System.out.println(a.getMessage());
			// Some other code...
			c1.dispose(1);
			throw a;
		}
		c2 = new CanErase(2);
	}

	public FailingConstructor2() {
	}
}