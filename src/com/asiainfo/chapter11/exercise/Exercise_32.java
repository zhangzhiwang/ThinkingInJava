package com.asiainfo.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * p245练习32
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月3日 下午8:24:48
 */
public class Exercise_32 implements Iterable<Integer> {
	private Integer[] ins = new Integer[] { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		Exercise_32 e = new Exercise_32();
		print(e.iterator());
		print(e.reverseIterator());
		print(e.randomIterator());
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index;

			@Override
			public boolean hasNext() {
				return index < ins.length;
			}

			@Override
			public Integer next() {
				return ins[index++];
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	public Iterator<Integer> reverseIterator() {
		return new Iterator<Integer>() {
			private int index = ins.length - 1;

			@Override
			public boolean hasNext() {
				return index >= 0;
			}

			@Override
			public Integer next() {
				return ins[index--];
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	public Iterator<Integer> randomIterator() {
		return new Iterator<Integer>() {
			private List<Integer> list = new ArrayList<Integer>(Arrays.asList(ins));
			private int index;

			@Override
			public boolean hasNext() {
				return index < list.size();
			}

			@Override
			public Integer next() {
				if (index == 0) {
					Collections.shuffle(list, new Random(3));
				}
				return list.get(index++);
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	public static void print(Iterator<Integer> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}
}
