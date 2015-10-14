package com.asiainfo.chapter11.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * p235练习17
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月14日 下午12:54:38
 */
public class Exercise_17 {
	public static void main(String[] args) {
		Map<String,Gerbil> map = new HashMap<String,Gerbil>();
		map.put("A", new Gerbil(1));
		map.put("B", new Gerbil(2));
		System.out.println(map);
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Gerbil g = map.get(key);
			System.out.print(key + "\t");
			g.hop();
		}
	}
}