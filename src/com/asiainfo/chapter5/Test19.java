package com.asiainfo.chapter5;

import java.util.Arrays;

/**
 * ����
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��5��
 */
public class Test19 {
	public static void main(String[] args) {
		int[] i1 = { 1, 2, 3 };
		System.out.println(i1.length);
		System.out.println(Arrays.toString(i1));
		System.out.println("----------------");
		int[] i2 = new int[3];
		System.out.println(i2.length);
		System.out.println(Arrays.toString(i2));
		System.out.println("--------------------");
		Integer[] i3 = new Integer[3];
		System.out.println(Arrays.toString(i3));
	}
}
