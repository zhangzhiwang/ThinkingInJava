package com.asiainfo.chapter7;

/**
 * �������Ļ��๹����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
 */
public class Test7 extends M {
	public static void main(String[] args) {
		new Test7();
	}

	public Test7() {
		super(1);// ���ø��๹��������������๹�����ʼ�Ĳ���
		System.out.println("Test7()");
		// super(1);// �����Է��ں���
	}
}

class M extends N {
	public M(int i) {
		System.out.println("M(int i)");// Ĭ�ϵ���N���޲ι�����
	}

	public M() {
		System.out.println("M()");
	}
}

class N {
	public N(int i) {
		System.out.println("N(int i)");
	}

	public N() {
		System.out.println("N()");
	}
}
