package com.asiainfo.chapter5;

/**
 * 无参构造器
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月3日
 */
public class Test1 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Test1();
		}
	}

	public Test1() {
		System.out.println("test1");
	}
}
