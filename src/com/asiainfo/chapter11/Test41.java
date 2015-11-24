package com.asiainfo.chapter11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet可以对元素排序，LinkedHashSet维护了元素的插入顺序
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午12:38:38
 */
public class Test41 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(9);
		set1.add(11);
		set1.add(13);
		set1.add(15);
		set1.add(17);
		set1.add(19);
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(10);
		set1.add(12);
		set1.add(14);
		set1.add(16);
		set1.add(18);
		set1.add(20);
		System.out.println(set1);

		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(9);
		set2.add(11);
		set2.add(13);
		set2.add(15);
		set2.add(17);
		set2.add(19);
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		set2.add(10);
		set2.add(12);
		set2.add(14);
		set2.add(16);
		set2.add(18);
		set2.add(20);
		System.out.println(set2);

		Set<Integer> set3 = new LinkedHashSet<Integer>();
		set3.add(1);
		set3.add(3);
		set3.add(5);
		set3.add(7);
		set3.add(9);
		set3.add(11);
		set3.add(13);
		set3.add(15);
		set3.add(17);
		set3.add(19);
		set3.add(2);
		set3.add(4);
		set3.add(6);
		set3.add(8);
		set3.add(10);
		set3.add(12);
		set3.add(14);
		set3.add(16);
		set3.add(18);
		set3.add(20);
		System.out.println(set3);
	}
}
