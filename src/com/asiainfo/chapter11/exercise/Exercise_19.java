package com.asiainfo.chapter11.exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * p236练习19
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月25日 下午1:22:42
 */
public class Exercise_19 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 1; i <= 30; i++) {
			set1.add(i);
		}
		System.out.println(set1);

		Set<Integer> set2 = new LinkedHashSet<Integer>();
		for (int i = 1; i <= 30; i++) {
			set2.add(i);
		}
		System.out.println(set2);
	}
}
