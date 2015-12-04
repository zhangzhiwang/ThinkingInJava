package com.asiainfo.chapter12.exercise;

/**
 * p253练习4
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月5日 上午1:10:15
 */
public class Exercise_4 extends Exception {
	private String msg;

	public Exercise_4(String msg) {
		super();
		this.msg = msg;
	}

	public Exercise_4() {
		super();
	}

	public String print() {
		return msg;
	}

	public static void main(String[] args) {
		try {
			throw new Exercise_4("test");
		} catch (Exercise_4 e) {
			System.out.println(e.print());
		}
	}
}
