package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

/**
 * p236练习21
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月26日 下午12:42:06
 */
public class Exercise_21 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		List<String> list = new ArrayList<String>(new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+"));
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String word : list) {
			map.put(word, map.get(word) == null ? 1 : map.get(word) + 1);
		}
		System.out.println(map);
	}
}
