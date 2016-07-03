package com.asiainfo.chapter15.exercise;

import java.util.Iterator;

/**
 * p361练习7
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午7:08:34
 */
public class Exercise_7 {
	public static void main(String[] args) {
		for (int i : new IterableFib(18)) {
			System.out.print(i + "\t");
		}
	}
}

interface Generator<T> {
	T next();
}

class Fib implements Generator<Integer> {
	public int num = 1;
	public int size;
	
	public Fib() {}
	
	public Fib(int size) {
		this.size = size;
	}
	
	@Override
	public Integer next() {
		return fib(num ++);
	}
	
	public int fib(int i) {
		if (i <= 2) {
			return 1;
		}
		return fib(i - 2) + fib(i - 1);
	}
}

class IterableFib implements Iterable<Integer> {
	private Fib fib;
	
	public IterableFib() {}
	
	public IterableFib(int size) {
		fib = new Fib(size);
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			@Override
			public boolean hasNext() {
				return fib.num <= fib.size;
			}
			
			@Override
			public Integer next() {
				return fib.next();
			}
			
			@Override
			public void remove() {}
		};
	}
}