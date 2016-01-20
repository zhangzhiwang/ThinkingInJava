package com.asiainfo.chapter12;

/**
 * 自定义异常
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午12:45:36
 */
public class Test10 extends Exception {

	public Test10() {
	}

	public Test10(String msg) {
		super(msg);
	}

	public void func1() throws Test10 {
		System.out.println("1");
		throw new Test10();
	}

	public void func2() throws Test10 {
		System.out.println("2");
		throw new Test10("Exception message.");
	}

	public static void main(String[] args) {
		Test10 t = new Test10();
		try {
			t.func1();
		} catch (Test10 test) {
			test.printStackTrace();
		}

		try {
			t.func2();
		} catch (Test10 test) {
			test.printStackTrace();
		}
	}
}
