package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.mindview.util.TextFile;

/**
 * p236练习26
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月27日 下午1:16:11
 */
public class Exercise_26 {
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		int count = 0;
		List<String> words = new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+");
		for (String word : words) {
			ArrayList<Integer> list = map.get(word);
			if (list == null) {
				list = new ArrayList<Integer>();
				map.put(word, list);
			}
			list.add(++count);
		}
		System.out.println(map);
		System.out.println("original:" + words);

		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		for (String word : map.keySet()) {
			for (Integer num : map.get(word)) {
				map2.put(num, word);
			}
		}
		System.out.println(map2.values());
	}
}
