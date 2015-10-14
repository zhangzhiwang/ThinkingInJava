package com.asiainfo.chapter11.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * p235练习18
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月14日 下午1:35:49
 */
public class Exercise_18 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "apple");
		map.put("b", "before");
		map.put("c", "cut");
		map.put("d", "delibery");
		System.out.println(map);
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		Set<String> set = new TreeSet<String>(keySet);
		System.out.println(set);
		Iterator<String> it = set.iterator();
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			map2.put(key, value);
		}
		System.out.println(map2);
	}
}
