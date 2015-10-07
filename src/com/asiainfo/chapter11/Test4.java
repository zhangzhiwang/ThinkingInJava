package com.asiainfo.chapter11;

import java.util.Arrays;
import java.util.List;

/**
 * 添加一组元素——Arrays.asList(T... args);
 * 
 * @author zhangzhiwang
 * @date 2015年10月3日 下午3:50:09
 */
public class Test4 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		// list1.add(4);// java.lang.UnsupportedOperationException
		// Arrays.asList(T... args)的返回类型是List，但是底层实现是数组，不能改变其大小，所以不能添加元素。
		for (Integer i : list1) {
			System.out.println(i);
		}
		System.out.println("----");

		Integer[] is = new Integer[] { 4, 5, 6 };
		List<Integer> list2 = Arrays.asList(is);
		list2.set(1, 10);// 用指定元素替换列表中指定位置的元素（可选操作）
		for (Integer i : list2) {
			System.out.println(i);
		}
	}
}
