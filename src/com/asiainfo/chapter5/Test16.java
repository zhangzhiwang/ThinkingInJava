package com.asiainfo.chapter5;

/**
 * ����Ĵ��������Լ���Ա�����ĳ�ʼ��˳��
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test16 {
	public static void main(String[] args) {
//		new Bowl(1);/*
//					 * ��һ��new���󣬻ᵼ�¸ö����������౻���أ�������ص�ʱ����ȳ�ʼ����̬��Ա�������������˳��Ȼ���ʼ���Ǿ�̬��Ա������������˳�򣩣� ���ִ�й��췽��
//					 */
//		System.out.println("-----------------------");
//		new Bowl(2);/*�ڵ��÷������������췽����֮ǰ���ȶԳ�Ա�������г�ʼ����˳��Ϊ��1�����ն�����Ⱥ� 2���Ⱦ�̬��Ǿ�̬���Ǿ�̬����������ص�ʱ���ѱ���ʼ����*/
//		Bowl.c3.toString();
		Bowl.func();
	}
}

class Cup {
	public Cup(int i) {
		System.out.println("Cup " + i);
	}
}

class Bowl {
	private Cup c1 = new Cup(1);// ��Ա�����ĳ�ʼ��˳���뾲̬���ǷǾ�̬�Լ������˳���йأ���������������λ���޹أ���ϰ���ϰ����Է��ڷ���֮ǰ

	public Bowl(int i) {
		System.out.println("Bowl " + i);
	}

	public static Table t1 = new Table(1);
	private Cup c2 = new Cup(2);
	
	public static void func() {
//		static int num = 1;// static�������ξֲ�����
		System.out.println("func()");
	}
	
	public static Cup c3 = new Cup(3);
}

class Table {
	public Table(int i) {
		System.out.println("Table " + i);
	}
}