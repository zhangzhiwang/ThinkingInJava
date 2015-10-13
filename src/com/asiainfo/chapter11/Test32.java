package com.asiainfo.chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Set的一些方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月13日 下午1:14:23
 */
public class Test32 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Collections.addAll(set1, 1, 2, 3);
		set1.add(4);
		System.out.println("set1 = " + set1);
		System.out.println(set1.contains(1));
		System.out.println(set1.contains(5));

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		System.out.println("set2 = " + set2);
		System.out.println(set1.containsAll(set2));
		set2.add(6);
		System.out.println(set1.containsAll(set2));
		set1.removeAll(set2);
		System.out.println(set1);
		System.out.println(set2);
	}
}
