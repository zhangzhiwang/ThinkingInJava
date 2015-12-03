package com.asiainfo.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 自创容器——Test68
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月3日 下午1:30:53
 */
public class Test68<T> implements Iterable<T> {
	private static Integer[] ins = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };

	/*
	 * 顺序遍历
	 */
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int index;

			@Override
			public boolean hasNext() {
				return index < ins.length;
			}

			@Override
			public T next() {
				return (T) ins[index++];
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	/**
	 * 倒序遍历
	 * 
	 * @return
	 * @author zhangzw8@asiainfo.com
	 * @date 2015年12月3日 下午2:05:11
	 */
	public Iterator<T> reverseIterator() {
		return new Iterator<T>() {
			private int index = ins.length - 1;

			@Override
			public boolean hasNext() {
				return index >= 0;
			}

			@Override
			public T next() {
				return (T) ins[index--];
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	/**
	 * 随机遍历
	 * 
	 * @return
	 * @author zhangzw8@asiainfo.com
	 * @date 2015年12月3日 下午2:05:25
	 */
	public Iterator<T> randomIterator() {
		return new Iterator<T>() {
			private List<Integer> list = Arrays.<Integer> asList(ins);
			private int index;

			@Override
			public boolean hasNext() {
				return index < list.size();
			}

			@Override
			public T next() {
				Collections.shuffle(list, new Random(3));
				return (T) ins[index++];
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	public static <T> void print(Iterator<T> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}

	public static <T> void printArray(T[] ts, String name) {
		System.out.print(name + " : ");
		for (T t : ts) {
			System.out.print(t + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Test68 test = new Test68();
		printArray(ins, "ins_1");
		Iterator<Integer> it1 = test.iterator();
		Iterator<Integer> it2 = test.reverseIterator();
		Iterator<Integer> it3 = test.randomIterator();
		print(it1);
		printArray(ins, "ins_2");
		print(it2);
		printArray(ins, "ins_3");
		print(it3);
		printArray(ins, "ins_4");
	}
}
