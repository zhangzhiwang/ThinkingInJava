package com.asiainfo.chapter11;

import java.util.HashMap;
import java.util.Map;

/**
 * Map的containsKey()和containsValue()方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月24日 下午8:51:31
 */
public class Test47 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("c"));
		System.out.println(map.containsValue("d"));
	}
}
