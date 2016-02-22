package com.asiainfo.chapter12.exercise;

/**
 * p281练习30
 * 
 * @author zhangzw8
 * @date 2016年2月22日 下午1:35:54
 */
public class Exercise_30 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			try {
				func1(i);
			} catch (RuntimeException e) {
				try {
					throw e.getCause();
				} catch (O1 e1) {
					System.out.println("1");
				} catch (O e2) {
					System.out.println("2");
				} catch (Throwable t) {
					System.out.println("3");
				}
			}
		}
	}

	public static void func1(int i) {
		try {
			switch (i) {
			case 1:
				throw new O1();
			case 2:
				throw new O();
			default:
				throw new SomeOtherException();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}

class O extends RuntimeException {
}

class O1 extends O {
}

class SomeOtherException extends Exception {
}