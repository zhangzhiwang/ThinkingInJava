package com.asiainfo.chapter12;

/**
 * p253练习4
 * 
 * @author zhangzw8
 * @date 2016年1月20日 下午1:09:30
 */
public class Test14 extends Exception {
	private String str;

	public Test14() {
	}

	public Test14(String msg) {
		super(msg);
		str = msg;
	}

	public String getStr() {
		return str;
	}

	public static void main(String[] args) {
		try {
			throw new Test14("hello");
		} catch (Test14 t) {
			System.out.println(t.getStr());
		}
	}
}
