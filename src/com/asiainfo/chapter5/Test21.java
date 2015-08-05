package com.asiainfo.chapter5;

import java.util.Arrays;

/**
 * 数组初始化的几种方法
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月5日
 */
public class Test21 {
	public static void main(String[] args) {
		// 方法1：
		int[] i1 = { 1, 2, 3 };// 只能在数组定义处初始化

		// 方法2：
		int[] i2;
		i2 = new int[3];// 可以在任何地方初始化数组
		for (int i = 0; i < i2.length; i++) {
			i2[i] = i + 1;
		}

		// 方法3：
		int[] i3 = new int[] { 1, 2, 3 };

		System.out.println(Arrays.toString(i1));
		System.out.println(Arrays.toString(i2));
		System.out.println(Arrays.toString(i3));
	}
}
