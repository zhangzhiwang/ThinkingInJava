package com.asiainfo.chapter7;

/**
 * 4�ֳ�ʼ����Ա�����ķ�ʽ
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
 */
public class Test2 {
	private B b1 = new B();// �ڶ��崦��ʼ��
	private B b2;
	private static B b3;
	private B b4;
	private static B b5;

	{
		b2 = new B();// �ô�����ʼ��
		// b3 = new B();
	}

	static {
		b3 = new B();
	}

	public Test2() {
		b4 = new B();// ���췽����ʼ��
	}

	public static void main(String[] args) {
		b5 = new B();// ���Գ�ʼ��������ʹ��ǰ��ʼ��
		System.out.println(b5.toString());
		System.out.println("---------------");
		System.out.println(new Test2().b1);
		System.out.println(new Test2().b2);
		System.out.println(b3);
		System.out.println(new Test2().b4);
		System.out.println(b5);
		// �������ֳ�ʼ�������뱣֤�ڶ���ʹ��ǰ���г�ʼ����������ܻ����쳣
	}
}

class B {
}
