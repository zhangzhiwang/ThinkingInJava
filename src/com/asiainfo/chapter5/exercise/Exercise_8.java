package com.asiainfo.chapter5.exercise;

/**
 * p85��ϰ8
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
 */
public class Exercise_8 {
	public static void main(String[] args) {
		new Exercise_8().func1();
	}

	public void func1() {
		func2();
		this.func2();// ����ֻ����֤this�ؼ����������õģ�ʵ��Ӧ��ʱ��Ӧ��ʾ�����������this�ؼ��֣���Ϊ���������Զ����
	}

	public void func2() {
		System.out.println(1);
	}
}
