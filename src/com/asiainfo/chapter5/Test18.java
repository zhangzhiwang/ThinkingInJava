package com.asiainfo.chapter5;

/**
 * �Ǿ�̬�����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test18 {
	public static void main(String[] args) {
		new Pinapple();
	}
}

class Banana {
	public Banana(int i) {
		System.out.println("Banana " + i);
	}
}

class Pinapple {
	// public Banana b1 = new Banana(1);
	// public Banana b2 = new Banana(2);
	public Banana b3;
	public Banana b4;

	{
		b4 = new Banana(4);
		b3 = new Banana(3);
	}
}
