package com.asiainfo.chapter5;

/**
 * ��̬�����ͷǾ�̬�����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test17 {
	public static void main(String[] args) {
		new Tree();
	}
}

class Tree {
	public static Orange o4;
	public static Orange o3;
	public Orange o1;
	public Orange o2;

	{
		o2 = new Orange(2);
		o1 = new Orange(1);
	}

	static {
		o3 = new Orange(3);
		o4 = new Orange(4);
	}
}

class Orange {
	public Orange(int i) {
		System.out.println("Orange " + i);
	}

	public Orange() {
	}
}