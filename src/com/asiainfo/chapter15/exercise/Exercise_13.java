package com.asiainfo.chapter15.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * p364练习13
 *
 * @author zhiwangzhang
 * @date 2016年7月3日 下午2:11:43
 */
public class Exercise_13 {
	public static <T> List<T> m1(List<T> list, Generator<T> gen, int size) {
		for (int i = 0; i < size; i++) {
			list.add(gen.next());
		}
		return list;
	}

	public static <T> Queue<T> m1(Queue<T> q, Generator<T> gen, int size) {
		for (int i = 0; i < size; i++) {
			q.add(gen.next());
		}
		return q;
	}

	public static <T> Set<T> m1(Set<T> set, Generator<T> gen, int size) {
		for (int i = 0; i < size; i++) {
			set.add(gen.next());
		}
		return set;
	}

	public static void main(String[] args) {
		List<Integer> list = m1(new ArrayList<Integer>(), new Generator<Integer>() {
			@Override
			public Integer next() {
				return (int) (Math.random() * 10);
			}
		}, 10);

		Queue<String> queue = m1(new PriorityQueue<String>(), new Generator<String>() {
			private List<String> ss = Arrays.<String> asList("a", "b", "c", "d", "e");

			@Override
			public String next() {
				return ss.get((int) (Math.random() * 5));
			}
		}, 10);

		Set<Double> set = m1(new HashSet<Double>(), new Generator<Double>() {
			@Override
			public Double next() {
				return Math.random() * 10;
			}
		}, 10);

		System.out.println(list);
		System.out.println(queue);
		System.out.println(set);
	}
}
