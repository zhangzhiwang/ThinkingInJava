package com.asiainfo.chapter8;

/**
 * �򲻴��ڶ�̬
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��10��
 */
public class Test3 extends E {
	public int num1 = 2;
	public int num3 = 4;

	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.num1);// num1û�и��ǻ����ͬ����ֻ��Ĭ�ϵ��ñ���������
		System.out.println(t.num2);

		E e = new Test3();// ��̬
		System.out.println(e.num1);// �������ڶ�̬�Ļ�����ôe.num1=2
//		e.func1();// The method func1() is undefined for the type E ��̬���ܵ����������з���
	}

	public void func1() {
	}
}

class E {
	public int num1 = 1;
	public int num2 = 3;
}