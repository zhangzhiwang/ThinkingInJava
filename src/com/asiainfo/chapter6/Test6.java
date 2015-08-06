package com.asiainfo.chapter6;

/**
 * 接口访问权限——public
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015年8月6日
 */
public class Test6 {
	public static int i = 1;
	public static void main(String[] args) {
		System.out.println(Test6.i);
	}
}

class Car2 {
	public void func() {
		System.out.println(Test6.i);
	}
}