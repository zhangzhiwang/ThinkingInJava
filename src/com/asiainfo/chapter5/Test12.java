package com.asiainfo.chapter5;

/**
 * ��̬������Ǿ�̬����֮��Ļ������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
 */
public class Test12 {
	private int age;
	private static String name;

	public static void main(String[] args) {
		Test12 t = new Test12();
		t.func1();// ��̬����������Ե��÷Ǿ�̬���������ǲ���ֱ�ӵ��ã���Ϊstatic����û��this
		// func1();
	}

	public void func1() {
		func2();// �Ǿ�̬����֮���Կ���ֱ�ӵ�����һ���Ǿ�̬��������Ϊ�Ǿ�̬��������this��this�б������Զ�Ĭ����ӣ�������ʾָ��this
		this.func2();// ���ڱ������Զ����this�����Բ�������ʾд��this
		System.out.println(age);// ��ͬ��
		System.out.println(this.age);// ������
	}

	public void func2() {
		func3();// ��static��������ֱ�ӵ���static��������
		System.out.println(name);
	}

	public static void func3() {
		func4();// static��������ֱ�ӵ���static��������
		System.out.println(name);
		// System.out.println(age);
	}

	public static void func4() {
	}
}
