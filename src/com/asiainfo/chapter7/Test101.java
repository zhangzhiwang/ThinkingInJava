package com.asiainfo.chapter7;

/**
 * ���þ�̬��Աʡ�����������
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015��8��10��
 */
public class Test101 extends Car102{
	static int i1 = 1;
	
	public static void main(String[] args) {
		System.out.println(i1);// ���ñ���ľ�̬��Ա����򷽷���������ʾ��д������
		func1();
		
		System.out.println(i2);// ���ø���ľ�̬��Ա����򷽷���Ҳ����Ҫ��ʾ��д������
		System.out.println(Test101.i2);
		System.out.println(Car102.i2);
		func2();
		Test101.func2();
		Car102.func2();
	}
	
	public static void func1() {}
}

class Car102 {
	public static int i2 = 2;
	
	public static void func2() {}
}