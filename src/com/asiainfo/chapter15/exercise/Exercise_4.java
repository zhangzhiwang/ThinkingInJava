package com.asiainfo.chapter15.exercise;

/**
 * p356练习4
 *
 * @author zhiwangzhang
 * @date 2016年6月12日 下午11:16:48
 */
public class Exercise_4 {
	public static void main(String[] args) {
		Sequence<Integer> s = new Sequence<Integer>(new Integer[3]);
		for (int i = 0; i < 3; i++) {
			s.add(i);
		}
		Selector<Integer> se = s.selector();
		while (!se.end()) {
			System.out.println(se.current());
			se.next();
		}
	}
}

interface Selector<T> {
	boolean end();

	T current();

	void next();
}

class Sequence<T> {
	private T[] items = null;
	private int next = 0;

	public Sequence(T[] ts) {
		items = ts;
	}

	public void add(T t) {
		if (next < items.length) {
			items[next++] = t;
		}
	}

	class SequenceSelector<T> implements Selector<T> {
		private int i;

		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public T current() {
			return (T) items[i];// 这里为什么要转型？
		}

		@Override
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
	}

	public Selector<T> selector() {
		return new SequenceSelector<T>();
	}
}
