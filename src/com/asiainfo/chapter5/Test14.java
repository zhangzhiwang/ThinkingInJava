package com.asiainfo.chapter5;

/**
 * 变量的初始化
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015年8月4日
 */
public class Test14 {
	private int age = 0;// 直接赋值初始化
	
	public static void main(String[] args) {
//		int j = func2(i);// 向前引用：
		int i = func();// 通过方法初始化
	}
	
	public static int func() {
		return 1;
	}
	
	public static int func2(int age) {
		return 2;
	}
}
