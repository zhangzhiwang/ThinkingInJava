package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set的一些常用方法
 * 
 * @author zhangzw8
 * @date 2016年7月6日 上午8:42:22
 */
public class Test34 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		
		System.out.println("set1" + set1);
//		set1.retainAll(set2);
//		System.out.println("set1" + set1);
//		System.out.println("set2" + set2);
//		set1.retainAll(list);
//		System.out.println("set1" + set1);
		//retainAll(Collection<?> c)，仅保留 set 中那些包含在指定 collection 中的元素（可选操作）。换句话说，移除此 set 中所有未包含在指定 collection 中的元素。如果指定的 collection 也是一个 set，则此操作会实际修改此 set，这样其值是两个 set 的一个交集。
		set1.removeAll(list);
		System.out.println("set1" + set1);
		System.out.println("list" + list);
	}
}
