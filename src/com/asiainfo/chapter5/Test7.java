package com.asiainfo.chapter5;

/**
 * this�ؼ��֡�����ʾ��ǰ���������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
 */
public class Test7 {
	public static void main(String[] args) {
		new Test7().func1();
	}

	public void func1() {
		this.func2();// this�ؼ���ֻ���ڷ�����ʹ��
		func2();// �ڷ����ڲ�����ͬһ�������������ʱ��������ʾ�ؼ���this�ؼ��֣����������Զ���ӣ�ֱ�ӵ��ø÷������ɡ�����Ҫʹ��this�ؼ��ֵ�ʱ�����ʾ�ؼ�������
	}

	public void func2() {
		System.out.println(1);
	}
}
