package com.asiainfo.chapter15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 集合常用操作
 * 
 * @author zhangzw8
 * @date 2016年7月6日 上午9:11:35
 */
public class Test35 {
	/**
	 * 并集
	 * 
	 * @param set1
	 * @param set2
	 * @return
	 * @author zhangzw8
	 * @date 2016年7月6日 上午9:14:25
	 */
	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> set = new HashSet<T>(set1);// 新建一个Set的目的是防止改变set1，值传递和引用传递
		set.addAll(set2);
		return set;
	}

	/**
	 * 交集
	 * 
	 * @param set1
	 * @param set2
	 * @return
	 * @author zhangzw8
	 * @date 2016年7月6日 上午9:22:37
	 */
	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> set = new HashSet<T>(set1);
		set.retainAll(set2);
		return set;
	}

	/**
	 * 不对称差集
	 * 
	 * @param set1
	 * @param set2
	 * @return
	 * @author zhangzw8
	 * @date 2016年7月6日 上午9:25:39
	 */
	public static <T> Set<T> different(Set<T> set1, Set<T> set2) {
		Set<T> set = new HashSet<T>(set1);
		set.removeAll(set2);
		return set;
	}

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>(Arrays.asList("a", "b", "c"));
		Set<String> set2 = new HashSet<String>(Arrays.asList("c", "d", "e"));
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		System.out.println("union = " + union(set1, set2));
		System.out.println("intersect = " + intersect(set1, set2));
		System.out.println("different = " + different(set1, set2));
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
	}
}
