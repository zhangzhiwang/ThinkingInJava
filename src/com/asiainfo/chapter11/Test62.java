package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * foreach既可以遍历数组又可以遍历集合（准确地说是Iterable），但不能直接遍历Map
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月2日 下午12:24:47
 */
public class Test62 {
	public static void main(String[] args) {
		Integer[] is = new Integer[] { 1, 2, 3 };
		for (Integer i : is) {
			System.out.print(i + "\t");
		}
		System.out.println();

		Collection<Integer> collection = new ArrayList<Integer>();
		Collections.addAll(collection, 1, 2, 3);
		for (Integer i : collection) {
			System.out.print(i + "\t");
		}
		System.out.println();
		Queue q = new LinkedList();
	}
}
