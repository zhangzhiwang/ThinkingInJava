package com.asiainfo.chapter12.exercise;

/**
 * p275练习24
 * 
 * @author zhangzw8
 * @date 2016年2月17日 下午1:33:28
 */
public class Exercise_24 {
	public static void main(String[] args) {
		for (boolean b = false;; b = !b) {
			System.out.println("hello");
			try {
				FailingConstructor3 f = new FailingConstructor3(b);

				try {
					System.out.println("123321");
				} catch (Exception a) {
					System.out.println("oh");
				} finally {
					f.dispose();
				}
			} catch (A a) {
				System.out.println("Caught a:" + a.getMessage());
				break;
			}
		}
	}
}

class FailingConstructor3 {
	private CanErase c1;
	private CanErase c2;

	public FailingConstructor3() {
	}

	public FailingConstructor3(boolean b) throws A {
		c1 = new CanErase(1);

		try {
			if (b) {
				throw new A();
			}
		} catch (A a) {
			System.out.println("failed!");
			c1.dispose(1);
			throw a;
		}

		c2 = new CanErase(2);
	}

	public void dispose() {
		c2.dispose(2);
		c1.dispose(1);
	}
}