package com.asiainfo.chapter7.exercise;

/**
 * p147��ϰ24
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��10��
 */
public class Exercise_24 extends Son {
	public static Radio r1 = new Radio(3);
	public Radio r2 = new Radio(31);

	public static void main(String[] args) {
		System.out.println("-------------");
		new Exercise_24(333);
	}

	public Exercise_24() {
	}

	public Exercise_24(int i) {
		super(i);
		System.out.println("Exercise_24: " + i);
	}
}

class Father {
	public static Radio r1 = new Radio(1);
	public Radio r2 = new Radio(11);

	public Father() {
	}

	public Father(int i) {
		System.out.println("Father: " + i);
	}
}

class Son extends Father {
	public static Radio r1 = new Radio(2);
	public static Radio r3 = new Radio(22);
	public Radio r2 = new Radio(21);

	public Son() {
	}

	public Son(int i) {
		super(i);
		System.out.println("Son: " + i);
	}
}

class Radio {
	public Radio() {
	}

	public Radio(int i) {
		System.out.println("Radio: " + i);
	}
}
/*
 * ����ؼ���ʼ����ϸ���̣�
 * 1��Ҫִ��Exercise_24��main()������Ҫ������Exercise_24��
 * 2���ڼ���Exercise_24ʱ����������Exercise_24�̳���Son�����Ǿ��ȼ���Son����Ϊ������ܻ��õ������һЩ����������Ҫ�ȼ��ظ��ಢ��ʼ���侲̬��Ա������
 * 3���ڼ���Sonʱ����Son�̳���Father�������ȼ���Father
 * 4��������Father�ͳ�ʼ��Father�ľ�̬��Ա������Ȼ�����Son�������ʼ������������Exercise_24����ع���
 * 5��������������겢��ɳ�ʼ������֮��Ϳ�ʼִ��Exercise_24��main()
 * 6����main()��ʵ������һ������Ķ��󣨼�����public Exercise_24(int i)��
 * 7���ù��췽��������Son���вι��췽������Son�ĸ÷���������Father���вι��췽��
 * 8���ڵ���Father���вι�����֮ǰ���ȳ�ʼ��Father��ĳ�Ա��������̬���ѳ�ʼ����ɣ���ʼ���Ǿ�̬�������ɣ�����ʼ�����֮���ִ�й���������Ĵ���
 * 9����ʼ��Fatherʵ��֮�󣬾Ϳ�ʼ����Son���вι�������ͬ�����ȳ�ʼ���Ǿ�̬��Ա�������ڵ��ù�������super(i)����Ĵ���
 * 10����Sonʵ����֮��Exercise_24������صĹ��������ˣ�����ִ�н���
 */