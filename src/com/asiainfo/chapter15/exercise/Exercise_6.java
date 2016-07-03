package com.asiainfo.chapter15.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * p358练习6
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午3:52:32
 */
public class Exercise_6 {
	public static void main(String[] args) {
		RandomList<Integer> r1 = new RandomList<Integer>();
		for (Integer i : new Integer[] { 1, 2, 3, 4, 5 }) {
			r1.add(i);
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(r1.get() + "\t");
		}
		System.out.println();

		RandomList<Character> r2 = new RandomList<Character>();
		for (char c : new char[] { 'a', 'b', 'c', 'd', 'e' }) {
			r2.add(c);
		}
		for (int i = 1; i <= 10; i++) {
			System.out.print(r2.get() + "\t");
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