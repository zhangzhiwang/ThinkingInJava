package com.asiainfo.chapter11.exercise;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * p229练习14
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月12日 下午1:46:44
 */
public class Exercise_14 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> it = list.listIterator();
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				it.add(i);
				continue;
			}
			list.add(1, i);
		}
		System.out.println(list);
	}
}
