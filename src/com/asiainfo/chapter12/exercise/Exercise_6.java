package com.asiainfo.chapter12.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * p255练习6
 * 
 * @author zhangzw8
 * @date 2016年1月21日 上午9:15:42
 */
public class Exercise_6 {
	public static void main(String[] args) throws A, B {
		// throw new A();
		throw new B();
	}
}

class A extends Exception {
	private static final Logger LOGGER = Logger.getLogger("A");

	public A() {
		StringWriter sw = new StringWriter();
		this.printStackTrace(new PrintWriter(sw));
		LOGGER.severe("hello world:" + sw.toString());
	}
}

class B extends Exception {
	private static final Logger LOGGER = Logger.getLogger("B");

	public B() {
		StringWriter sw = new StringWriter();
		this.printStackTrace(new PrintWriter(sw));
		LOGGER.severe(sw.toString() + " 13579");
	}
}