package com.asiainfo.chapter6;

/**
 * �ӿڷ���Ȩ�ޡ���public
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015��8��6��
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