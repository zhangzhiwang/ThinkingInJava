package com.asiainfo.chapter7.exercise;

/**
 * p147��ϰ23
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��10��
 */
public class Exercise_23 {
	public static void main(String[] args) {
		System.out.println("Exercise_23.main(String[] args)");
		System.out.println(Car103.i);// ���ڵ�һ���õ���ʱ�򱻼���
		System.out.println("do somthing else...");
		System.out.println(Car103.f);// ��ֻ����һ��
	}
}

class Car103 {
	public static int i = 1;
	public static float f = 12;
	public static Rain r = new Rain(103);
}

class Rain {
	public Rain(int i) {
		System.out.println("Rain: " + i);
	}

	public Rain() {
	}
}