package com.asiainfo.chapter7;

/**
 * ��ʼ�����ࡪ����ʵ������������ʱ�������ʵ�����������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
 */
public class Test6 extends F {
	public static void main(String[] args) {
		Test6 t = new Test6();
	}

	public Test6() {
		System.out.println("Test6");
	}
}

class F extends G {
	public F() {
		// super();// Ĭ��
		System.out.println("F");
	}
}

class G {
	public G() {
		System.out.println("G");
	}
}