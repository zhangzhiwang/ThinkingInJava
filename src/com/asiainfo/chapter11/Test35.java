package com.asiainfo.chapter11;

import java.util.HashMap;
import java.util.Map;

/**
 * Map——containsKey()\containsValue()，取决于key/value的equals()方法
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月14日 上午9:20:29
 */
public class Test35 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "hello");
		map.put("1", "world");
		map.put("2", "abc");
		System.out.println(map);
		System.out.println(map.containsKey("1"));
		System.out.println(map.containsValue("abc"));
		String v = map.get("2");
		System.out.println(map.containsValue(v));
		System.out.println("----------------");

		Map<String, Fruit> map2 = new HashMap<String, Fruit>();
		map2.put("1", new Fruit(1, "apple"));
		map2.put("2", new Fruit(2, "orange"));
		map2.put("3", new Fruit(3, "nut"));
		System.out.println(map2);
		System.out.println(map2.containsValue(new Fruit(1,"apple")));
		System.out.println(map2.containsValue(new Fruit(4,"nut")));
		System.out.println(map2.containsValue(map2.get("3")));
	}
}
