package com.asiainfo.chapter5;

import java.util.Arrays;

/**
 * �����ʼ���ļ��ַ���
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test21 {
	public static void main(String[] args) {
		// ����1��
		int[] i1 = { 1, 2, 3 };// ֻ�������鶨�崦��ʼ��

		// ����2��
		int[] i2;
		i2 = new int[3];// �������κεط���ʼ������
		for (int i = 0; i < i2.length; i++) {
			i2[i] = i + 1;
		}

		// ����3��
		int[] i3 = new int[] { 1, 2, 3 };

		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(i2));
		System.out.println(Arrays.toString(i3));
	}
}
