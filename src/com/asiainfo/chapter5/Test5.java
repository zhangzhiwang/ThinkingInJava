package com.asiainfo.chapter5;

/**
 * �������أ�����Ϊ�����������ͣ��βκ�ʵ�β�ƥ��
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��3��
 */
public class Test5 {
	public void func(byte b) {
		System.out.println("byte");
	}

	public void func(int i) {
		System.out.println("int");
	}

	public void func(float d) {
		System.out.println("double");
	}

	public void func(int i, long num) {
		System.out.println("int,long");
	}

	public void func(long num, int i) {
		System.out.println("long,int");
	}

	public static void main(String[] args) {
		byte b = 1;
		double num = 1.0;
		Test5 t = new Test5();
		t.func((byte)num);
		System.out.println(num);
		System.out.println((byte)num);
		t.func(1, 1L);
	}
}
