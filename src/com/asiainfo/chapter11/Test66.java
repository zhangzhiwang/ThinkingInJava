package com.asiainfo.chapter11;

import java.util.Arrays;

/**
 * foreach可以遍历数组和Iterable，但数组不是Iterable
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月2日 下午12:58:32
 */
public class Test66 {
	public static void main(String[] args) {
		foreach(Arrays.asList(1, 2, 3));
//		foreach(new Integer[] { 1, 2, 3 });
	}

	public static <T> void foreach(Iterable<T> it) {
		for (T t : it) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}
}
