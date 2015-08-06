package com.asiainfo.chapter6;

import com.asiainfo.chapter6.exercise.*;

/**
 * �̳з���Ȩ�ޣ�ͬʱ���а�����Ȩ�ޣ�����protected
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��6��
 */
public class Test8 {
	protected static String name = "Test8";
	static int age = 1;

	public static void main(String[] args) {
		System.out.println(Test8.name);
		System.out.println(Test8.age);
	}
}

class Car4 {
	public void func() {
		System.out.println(Test8.name);// protected����а�����Ȩ��
	}
}

class Car5 extends Test8{
	public void func() {
		System.out.println(Test8.name);// �̳з���Ȩ��
	}
}