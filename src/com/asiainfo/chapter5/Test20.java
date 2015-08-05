package com.asiainfo.chapter5;

import java.util.Arrays;

/**
 * 引用复制
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月5日
 */
public class Test20 {
	private int num = 1;

	public static void main(String[] args) {
		// int[] i1 = { 1, 2, 3 };
		// int[] i2 = i1;// 将i1赋值给i2，实质是将i1的引用复制一份给i2，所以i1和i2共同指向同一个数组
		// System.out.println(i2.length);
		// for (int i = 0; i < i2.length; i++) {
		// i2[i] += 10;
		// }
		// System.out.println(Arrays.toString(i1));
		// System.out.println(i1 == i2);

		Test20 t1 = new Test20();
		System.out.println(t1.num);
		Test20 t2;
		t2 = t1;// 对于复合数据类型，类似t2 = t1这种赋值操作实质是引用的复制，是两个应用指向同一对象
		System.out.println(t2.num);
		t2.num = 2;
		System.out.println(t2.num);
		System.out.println(t1.num);
		System.out.println(t1 == t2);
	}
}
