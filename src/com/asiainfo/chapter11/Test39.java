package com.asiainfo.chapter11;

import java.util.HashSet;
import java.util.Set;

/**
 * Set是根据值来判断元素是否重复
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月3日 下午12:37:17
 */
public class Test39 {
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Set<Integer> set = new HashSet<Integer>();
		set.add(i1);
		set.add(i2);
		System.out.println(set);
	}
}
