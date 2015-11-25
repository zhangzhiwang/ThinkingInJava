package com.asiainfo.chapter11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * p235练习18（该练习已在exercise目录下，本次为第二次练习）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月25日 下午1:11:56
 */
public class Test51 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 1; i <= 30; i++) {
			map.put(i, String.valueOf(i + 10));
		}
		System.out.println(map);

		Set<Integer> keySet = new TreeSet<Integer>(map.keySet());
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		for (Integer key : keySet) {
			map2.put(key, map.get(key));
		}
		System.out.println(map2);
	}
}
