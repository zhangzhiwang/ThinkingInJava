package com.asiainfo.chapter5;

import java.util.Arrays;

/**
 * ���ø���
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test20 {
	private int num = 1;

	public static void main(String[] args) {
		// int[] i1 = { 1, 2, 3 };
		// int[] i2 = i1;// ��i1��ֵ��i2��ʵ���ǽ�i1�����ø���һ�ݸ�i2������i1��i2��ָͬ��ͬһ������
		// System.out.println(i2.length);
		// for (int i = 0; i < i2.length; i++) {
		// i2[i] += 10;
		// }
		// System.out.println(Arrays.toString(i1));
		// System.out.println(i1 == i2);

		Test20 t1 = new Test20();
		System.out.println(t1.num);
		Test20 t2;
		t2 = t1;// ���ڸ����������ͣ�����t2 = t1���ָ�ֵ����ʵ�������õĸ��ƣ�������Ӧ��ָ��ͬһ����
		System.out.println(t2.num);
		t2.num = 2;
		System.out.println(t2.num);
		System.out.println(t1.num);
		System.out.println(t1 == t2);
	}
}
