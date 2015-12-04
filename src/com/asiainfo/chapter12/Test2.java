package com.asiainfo.chapter12;

/**
 * 创建自己的异常类——MyException
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月4日 下午1:15:40
 */
public class Test2 {// 注：异常层次结构中的Throwable和Exception都是普通的类而非接口
	public static void fun1() throws MyException {
		System.out.println("Throw exception from fun1().");
		throw new MyException();
	}

	public static void main(String[] args) {
		try {
			fun1();
		} catch (MyException e) {
			System.out.println("Caught MyException!");
		}
	}
}

class MyException extends Exception {
}