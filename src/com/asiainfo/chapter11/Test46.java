package com.asiainfo.chapter11;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Math.random()的随机性
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午8:45:07
 */
public class Test46 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			int key = (int) (Math.random() * 20);
			int value = map.get(key) == null ? 1 : map.get(key) + 1;
			map.put(key, value);
		}
		System.out.println(map);
	}
}
