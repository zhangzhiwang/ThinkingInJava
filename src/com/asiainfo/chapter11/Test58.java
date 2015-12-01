package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * Collection都可以用迭代器或foreach来迭代
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月1日 下午8:41:13
 */
public class Test58 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 1; i <= 10; i++) {
			map.put(i, i + 10);
			list.add(i);
			set.add(i);
			queue.offer(i);
		}
		System.out.println("map:");
		iterate(map.entrySet());
		System.out.println("list:");
		iterate(list);
		System.out.println("set:");
		iterate(set);
		System.out.println("queue:");
		iterate(queue);
		System.out.println("--------------------");
		System.out.println("map:");
		foreach(map.entrySet());
		System.out.println("list:");
		foreach(list);
		System.out.println("set:");
		foreach(set);
		System.out.println("queue:");
		foreach(queue);
	}

	public static <T> void iterate(Collection<T> collection) {
		Iterator<T> it = collection.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}
	
	public static <T> void foreach(Collection<T> collection) {
		for (T t : collection) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}
}
