package com.asiainfo.chapter5;

/**
 * ��������һЩע������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
 */
public class Test11 {
	private int age;
	private String name;

	public Test11() {
	}

	public Test11(int age) {
		this("Tom");
		// this(age,"Tom");// ��һ���������ڲ�ֻ�ܵ���һ��������
	}

	public Test11(String name) {
		this.name = name;
		// this(1,"Tom");// ������������������������ڷ������ʼ��
	}

	public Test11(int age, String name) {
		this();// �вι��������Ե����޲ι���������֮���
	}

	public void func() {
//		this();// ��������ͨ������ֱ�ӵ��ù�����
	}

}
