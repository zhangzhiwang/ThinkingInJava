package com.asiainfo.chapter6;

/**
 * private�������ͳ�Ա��������ñ�������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��6��
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