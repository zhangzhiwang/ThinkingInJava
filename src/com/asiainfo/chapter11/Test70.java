package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Arrays.asList()的底层实现是数组
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月3日 下午8:08:02
 */
public class Test70 {
	public static void main(String[] args) {
		Integer[] ins = new Integer[] { 1, 2, 3, 4, 5, 6 };
		print(ins);
		List<Integer> list = Arrays.asList(ins);
		for (Integer i : ins) {
			System.out.print(i + "\t");
		}
		System.out.println();
		Collections.shuffle(list, new Random(3));// 操纵Arrays.asList(ins)的返回结果List就相当于操纵ins
		System.out.println(list);
		print(ins);
		System.out.println("-------------");
		Integer[] ins2 = new Integer[] { 11, 12, 13, 14, 15, 16 };
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(ins2));// 要想不改变ins2，就要在Arrays.asList(ins)的返回结果List外面再包一层List，对外层List进行操作
		System.out.println(list2);
		Collections.shuffle(list2, new Random(3));
		System.out.println(list2);
		print(ins2);
	}

	public static void print(Integer[] ins) {
		for (Integer i : ins) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
