package com.asiainfo.chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的一些方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月14日 下午12:42:35
 */
public class Test37 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		Collection<String> col = map.values();
		System.out.println(col);
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		//Collection有iterator()方法，Map无此方法
	}
}
