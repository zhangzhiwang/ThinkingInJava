package com.asiainfo.chapter11;

import java.util.HashSet;
import java.util.Set;

/**
 * set
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月3日 上午9:01:36
 */
public class Test38 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			set.add((int) (Math.random() * 3));
		}
		System.out.println(set);
	}
}
