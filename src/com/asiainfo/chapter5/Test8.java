/**
 * 
 */
package com.asiainfo.chapter5;

/**
 * �ڷ����ﷵ�ص�ǰ���������
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
 */
public class Test8 {
	private int age;

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.func().func().func();
		System.out.println(t.age);
	}

	public Test8 func() {
		age++;
		return this;
	}

}
