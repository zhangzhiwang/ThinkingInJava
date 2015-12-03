package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 利用迭代器进行反向遍历
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月3日 下午1:01:17
 */
public class Test67<T> extends ArrayList<T> {
	public Test67(Collection<T> col) {
		super(col);
	}

	public Test67() {
	}

	public static <T> void iterate(Iterable<T> iterator) {
		for (T t : iterator) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}

	public Iterable<T> reverseIterator() {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					private int index = size() - 1;

					@Override
					public boolean hasNext() {
						return index >= 0;
					}

					@Override
					public T next() {
						return get(index--);
					}

					@Override
					public void remove() {
						return;
					}
				};
			}
		};
	}

	public static void main(String[] args) {
		Test67<Integer> test = new Test67<Integer>(Arrays.asList(1, 2, 3));
		iterate(test);
		iterate(test.reverseIterator());
	}
}
