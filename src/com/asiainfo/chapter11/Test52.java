package com.asiainfo.chapter11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 使用场景：存在一Map，其元素是无序的，现需将其元素按键按正序排序并输出
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月27日 上午10:00:28
 */
public class Test52 {
	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new LinkedHashMap<Integer, Integer>();
		for (int i = 10; i >= 0; i--) {
			map1.put(i, i + 10);
		}
		System.out.println(map1);

		Set<Integer> keySet = new TreeSet<Integer>(map1.keySet());
		Map<Integer, Integer> map2 = new LinkedHashMap<Integer, Integer>();
		for (Integer key : keySet) {
			map2.put(key, map1.get(key));
		}
		System.out.println(map2);
	}
}
