package com.asiainfo.chapter5;

/**
 * �вι�����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��3��
 */
public class Test2 {
	private int age;

	public Test2(int age) {
		this.age = age;
		System.out.println(this.age);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Test2(i);
		}
	}
}
