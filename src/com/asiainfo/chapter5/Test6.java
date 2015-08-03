package com.asiainfo.chapter5;

/**
 * 有关默认构造器
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月3日
 */
public class Test6 {
	public static void main(String[] args) {
		Bird b = new Bird();// 调用默认构造器
		// Plane p = new Plane();// 定义了构造器后，就没有默认（无参）构造器了
		Plane p = new Plane(1);
	}
}

class Bird {
}

class Plane {
	public Plane(int i) {
	}
}
