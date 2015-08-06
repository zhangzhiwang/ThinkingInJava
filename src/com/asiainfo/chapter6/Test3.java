package com.asiainfo.chapter6;

/**
 * private复合类型成员变量如何让被外界访问
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月6日
 */
public class Test3 {
	public static void main(String[] args) {
		Cars car = new Cars();
//		System.out.println(car.c);
		System.out.println(Cars.getInstance());
	}
}

class Cars {
	private static Cars c = new Cars();

	public static Cars getInstance() {
		return c;
	}
}