package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月14日 下午12:31:57
 */
public class Test36 {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("p1", new ArrayList<String>(Arrays.asList("a1", "b1", "c1")));
		map.put("p2", new ArrayList<String>(Arrays.asList("a2", "b2", "c2")));
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			List<String> values = map.get(key);
			System.out.print(key + " has ");
			for (String value : values) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}
