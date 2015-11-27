package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.mindview.util.TextFile;

/**
 * p236练习25
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月27日 下午12:38:31
 */
public class Exercise_25 {
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		int count = 0;
		for (String word : new TextFile("src\\com\\asiainfo\\chapter11\\Test42.java", "\\W+")) {
			ArrayList<Integer> list = map.get(word);
			if (list == null) {
				list = new ArrayList<Integer>();
				map.put(word, list);
			}
			list.add(++count);
		}
		System.out.println(map);
	}
}
