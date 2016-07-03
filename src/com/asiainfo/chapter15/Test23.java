package com.asiainfo.chapter15;

import java.util.Iterator;

/**
 * 斐波那且数列（适配器模式）
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 下午6:55:53
 */
public class Test23 {
	public static void main(String[] args) {
		for (int i : new IterableFib(18)) {
			System.out.print(i + "\t");
		}
	}
}

class IterableFib extends Fib implements Iterable<Integer>{
	private int num = 0;
	public IterableFib(int size) {
		num = size;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			@Override
			public boolean hasNext() {
				return num > 0;
			}
			
			@Override
			public Integer next() {
				num--;
				return IterableFib.this.next();
			}
			
			@Override
			public void remove() {}
		};
	}
}