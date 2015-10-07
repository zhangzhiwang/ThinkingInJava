package com.asiainfo.chapter11.exercise;

import java.util.Collection;
import java.util.HashSet;

/**
 * p220练习2
 * 
 * @author zhangzhiwang
 * @date 2015年10月3日 下午3:12:38
 */
public class Exercise_2 {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		c.add(1);
		c.add(2);
		c.add(2);

		for (Integer i : c) {
			System.out.println(i);
		}
	}
}
