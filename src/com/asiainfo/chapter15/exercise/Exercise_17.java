package com.asiainfo.chapter15.exercise;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * p369练习17
 * 
 * @author zhangzw8
 * @date 2016年7月8日 上午9:01:36
 */
public class Exercise_17 {
	public static <T> Set<T> copy(Set<T> set) {
		if (set instanceof EnumSet) {
			return ((EnumSet) set).clone();
		}
		return new HashSet<T>(set);
	}

	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> set = copy(set1);
		set.addAll(set2);
		return set;
	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> set = copy(set1);
		set.retainAll(set2);
		return set;
	}

	public static <T> Set<T> different(Set<T> set1, Set<T> set2) {
		Set<T> set = copy(set1);
		set.removeAll(set2);
		return set;
	}
	
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(3);
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		
		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));
		System.out.println(different(set1, set2));
	}
}
