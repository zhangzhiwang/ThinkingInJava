package com.asiainfo.chapter6;

/**
 * 包访问权限（没有关键字）——同包可以访问
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月6日
 */
public class Test5 {
	static int age = 1;

	public static void main(String[] args) {
		System.out.println(Trucks.height);
	}
}

class Trucks {
	static int height = 1;// 具有包访问权限
}
