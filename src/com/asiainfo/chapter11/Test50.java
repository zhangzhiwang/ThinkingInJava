package com.asiainfo.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * p235练习17（该练习已在exercise目录下，本次为第二次练习）
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年11月25日 下午12:34:58
 */
public class Test50 {
	public static void main(String[] args) {
		Map<String, Gerbil> map = new HashMap<String, Gerbil>();
		map.put("Fuzzy", new Gerbil(1));
		map.put("Spot", new Gerbil(2));
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":");
			map.get(key).hop();
		}
	}
}

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int num) {
		gerbilNumber = num;
	}

	public Gerbil() {
	}

	public void hop() {
		System.out.println(gerbilNumber);
	}

	@Override
	public String toString() {
		return "Gerbil [gerbilNumber=" + gerbilNumber + "]";
	}
}