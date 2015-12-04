package com.asiainfo.chapter12;

/**
 * 创建自己的异常类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月4日 下午1:29:06
 */
public class Test3 {
	public static void func1() throws HungryException {
		System.out.println("Throw exception from fun1().");
		throw new HungryException();
	}

	public static void func2() throws HungryException {
		System.out.println("Throw exception from fun2().");
		throw new HungryException("I'm hungry");
	}

	public static void main(String[] args) {
//		try {
//			func1();
//		} catch (HungryException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			func2();
//		} catch (HungryException e) {
//			e.printStackTrace();
//		}
		System.out.println(new HungryException().toString());
	}
}

class HungryException extends Exception {
	public HungryException() {
	}

	public HungryException(String msg) {
		super(msg);
	}
}