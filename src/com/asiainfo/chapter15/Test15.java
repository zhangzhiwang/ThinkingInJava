package com.asiainfo.chapter15;

/**
 * p356练习4
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 上午11:31:12
 */
public class Test15 {
	public static void main(String[] args) {
		Selector2<String> selector = new Sequence2<String>(new String[3]).new SequenceSelector();
		for (int i = 0; i <= 3; i++) {
			selector.add(String.valueOf(i));
		}
		selector.resetIndex();
		while (!selector.end()) {
			System.out.print(selector.current() + "\t");
			selector.next();
		}
	}
}

interface Selector2<T> {
	void add(T t);

	T current();

	boolean end();

	void next();

	void resetIndex();
}

class Sequence2<T> {
	private int nextIndex;
	private T[] items;

	private Sequence2() {
	}

	public Sequence2(T[] items) {
		this.items = items;
	}

	class SequenceSelector implements Selector2<T> {
		@Override
		public void add(T t) {
			if (nextIndex < items.length) {
				items[nextIndex++] = t;
			}
		}

		@Override
		public T current() {
			return items[nextIndex];
		}

		@Override
		public boolean end() {
			return nextIndex == items.length;
		}

		@Override
		public void next() {
			nextIndex++;
		}

		@Override
		public void resetIndex() {
			nextIndex = 0;
		}
	}
}