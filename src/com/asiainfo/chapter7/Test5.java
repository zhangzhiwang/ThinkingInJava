package com.asiainfo.chapter7;

/**
 * �̳�
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
 */
public class Test5 extends E {
	private int num = 2;
	private int i = 2;

	public static void main(String[] args) {
		Test5 t = new Test5();
		System.out.println(t.i);// �������ԡ����ǡ��˸���ͬ������
		System.out.println(t.age);// ������ø�������
		System.out.println(t.num);// �������������������

		t.func1();// ������ø��෽��������û�У�
		t.func2(1);// ������ø����˸����ͬ������
		t.func3();// ��������������з���
	}

	public void func2(int i) {
		System.out.println("Test5.func2(int i)");
	}

	public void func3() {
		System.out.println("Test5.func3()");
	}
}

class E {
	public int i = 1;
	public int age = 10;

	public void func1() {
		System.out.println("E.func1()");
	}

	public void func2(int num) {
		System.out.println("E.func2(int num)");
	}
}