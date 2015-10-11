package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * p228练习12
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午5:41:01
 */
public class Exercise_12 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));

		ListIterator<Integer> it = list1.listIterator();
		for (int i = 0; i < list1.size(); i++) {
			it.next();
		}
		while (it.hasPrevious()) {
			Integer i = it.previous();
			list2.add(i);
		}
		System.out.println(list2);
	}
}
