package com.asiainfo.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Map
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年10月14日 上午9:03:24
 */
public class Test34 {
	public static void main(String[] args) {
		Random r = new Random(47);

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 1; i <= 10000; i++) {
			int j = r.nextInt(20);
			Integer v = map.get(j);
			if (v == null) {
				v = 1;
				map.put(j, v);
			}
			map.put(j, v + 1);
		}
		System.out.println(map);
	}
}
