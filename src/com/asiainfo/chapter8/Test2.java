package com.asiainfo.chapter8;

/**
 * �����private�������ᱻ����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��10��
 */
public class Test2 extends D {
	// @Override
	public void func1() {// �÷������Ǹ��Ǹ����ͬ�������������¶���һ�����ڷ���ǰ�����@Override�ͻᱨ�����ԣ�Ϊ�˰�ȫ������ڸ�д����ķ���ʱ��ǰ��Ҫ����@Overrideע�⣬�Է������������
		System.out.println("Test2.public.func1()");
	}

	public void func2() {
	}// func1()��func2()��������һ���ģ������������еķ���
}

class D {
	private void func1() {
		System.out.println("D.private.func1");
	}

	public void func3() {
		System.out.println("D.func3()");
	}

	public static void main(String[] args) {
		D d = new Test2();
		d.func1();
		d.func3();
	}
}
