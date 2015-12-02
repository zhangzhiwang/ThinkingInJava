package com.asiainfo.chapter11;

import java.util.Iterator;

/**
 * 实现了Iterable的类可以用foreach迭代
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月2日 下午12:43:56
 */
public class Test64 implements Iterable<Integer> {
	private Integer[] array = new Integer[] { 1, 2, 3 };

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			private int index;

			@Override
			public boolean hasNext() {
				return index < array.length;
			}

			@Override
			public Integer next() {
				return array[index++];
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	public static void main(String[] args) {
		Test64 test = new Test64();

		for (Integer i : test) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
