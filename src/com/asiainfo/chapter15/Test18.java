package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * RandomList
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午3:45:53
 */
public class Test18 {
	public static void main(String[] args) {
		RandomList<String> r = new RandomList<String>();
		for (String s : new String[] { "a", "b", "c", "d", "e" }) {
			r.add(s);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(r.get());
		}
	}
}

class RandomList<T> {
	private List<T> list = new ArrayList<T>();

	public void add(T t) {
		list.add(t);
	}

	public T get() {
		return list.get((int) (Math.random() * 5));
	}
}