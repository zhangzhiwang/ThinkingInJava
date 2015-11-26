package com.asiainfo.chapter11.exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * p236练习23
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月26日 下午1:27:34
 */
public class Exercise_23 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 1; i <= 100000; i++) {
			int num = (int) (Math.random() * 30);
			map.put(num, map.get(num) == null ? 1 : map.get(num) + 1);
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}
}
