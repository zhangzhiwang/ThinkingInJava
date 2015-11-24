package com.asiainfo.chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map可以取键和值的集合以及键值对的集合
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午9:17:12
 */
public class Test49 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		Set<Integer> set = map.keySet();
		System.out.println(set);
		for (Integer i : set) {
			System.out.println(i + ":" + map.get(i));
		}
		System.out.println("----------------");
		Collection<String> c = map.values();
		System.out.println(c);
		System.out.println("------------");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		for (Entry entry : entrySet) {
			Integer key = (Integer) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + "-->" + value);
		}
		
	}
}
