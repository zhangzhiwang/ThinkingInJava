package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组与List互相转换
 * 
 * @author zhangzhiwang
 * @date 2015年10月8日 下午10:07:01
 */
public class Test10 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.<Integer> asList(1, 2, 3);// Array to List
		// list1.add(4);// java.lang.UnsupportedOperationException
		String[] s = new String[] { "a", "b" };
		List<String> list2 = Arrays.<String> asList(s);
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println("s = " + s);

		List<String> list3 = new ArrayList<String>();
		list3.add("abc");
		list3.add("abc");
		Object[] s1 = list3.toArray();
		for (Object str : s1) {
			System.out.println(str);
		}
	}
}
