package com.asiainfo.chapter8;

/**
 * ��̬���������ڸ���
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��10��
 */
public class Test4 extends F {
	public static void main(String[] args) {
		F f1 = new F();
		f1.func1();
		f1.func2();
		System.out.println("------------------");

		F f2 = new Test4();
		f2.func1();
		f2.func2();
		System.out.println("-------------");

		Test4 t = new Test4();
		t.func1();
		t.func2();
		System.out.println("Conclusion:1����̬���������ڸ��ǡ��������ľ�̬�����͸���ľ�̬����ͬ�������൱�������¶���һ���븸��ͬ���ľ�̬�������˷���Ϊ�������С� 2�����෽���ܲ��ܸ��Ǹ���ķ������ڷ�������ǰ����@Override��֪���ˣ����ԣ�Ҫ����һ��ϰ�ߣ���д����Ҫ����@Overrideע��");
	}

	public static void func1() {
		System.out.println("Test4.static.func1()");
	}

	public void func2() {
		System.out.println("Test4.func2()");
	}
}

class F {
	public static void func1() {
		System.out.println("F.static.func1()");
	}

	public void func2() {
		System.out.println("F.func2()");
	}
}