package com.asiainfo.chapter11.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 * p236练习24
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月26日 下午1:36:12
 */
public class Exercise_24 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("c", 3);
		map.put("a", 1);
		map.put("b", 2);
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		Set<Entry<String, Integer>> keySet = new TreeSet<Entry<String, Integer>>(set);
//		for (Entry<String, Integer> entry : set) {
//			keySet.add(entry.getKey());
//		}
//		map.clear();
//		for (String key : keySet) {
//			map.put(key, map.get(key));
//		}
		System.out.println(map);
	}
}
