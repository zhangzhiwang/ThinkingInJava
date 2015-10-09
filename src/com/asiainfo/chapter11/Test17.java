package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List的交集操作
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月9日 下午1:34:39
 */
public class Test17 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(list);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		System.out.println(list2);
		list.retainAll(list2);// 取交集，取决于元素的equals()方法，详见Test18
		System.out.println(list);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(4);
		list.retainAll(list3);
		System.out.println(list);
	}
}
