package com.asiainfo.chapter11.exercise;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * p227练习9
 * 
 * @author zhangzhiwang
 * @date 2015年10月11日 下午3:29:19
 */
public class Exercise_9 {

	private class Sequence implements Iterator {
		private Object[] arr;
		private int index;

		public Sequence(int size) {
			arr = new Object[size];
		}

		public Sequence() {
		}

		public boolean add(Object o) {
			if (hasNext()) {
				arr[index] = o;
				index++;
				return true;
			}
			return false;
		}

		@Override
		public boolean hasNext() {
			return index < arr.length;
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return arr[index++];
			}
			throw new NoSuchElementException();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Iterator iterator() {
			index = 0;
			return this;
		}
	}

	public static void main(String[] args) {
		Sequence s = new Exercise_9().new Sequence(10);
		for (int i = 0; i < 10; i++) {
			s.add(i);
		}
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
