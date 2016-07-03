package com.asiainfo.chapter15;

/**
 * p191 innerclasses/Sequence
 *
 * @author zhiwangzhang
 * @date 2016年7月2日 上午11:13:09
 */
public class Test14 {
	public static void main(String[] args) {
		Selector selector = new Sequence(10).new SequenceSelector();
		for (int i = 0; i <= 10; i++) {
			selector.add(i);
		}
		selector.resetIndex();
		while(!selector.end()) {
			System.out.print(selector.current() + "\t");
			selector.next();
		}
	}
}
interface Selector {
	void next();
	void add(Object o);
	boolean end();
	void resetIndex();
	Object current();
}

class Sequence {
	private int nextIndex;
	private Object[] items;
	private Sequence() {}
	
	public Sequence(int size) {
		this.items = new Object[size];
	}
	
	class SequenceSelector implements Selector {
		@Override
		public void next() {
			nextIndex ++;
		}
		
		@Override
		public void add(Object o) {
			if(nextIndex < items.length) {
				items[nextIndex++] = o;
			}
		}
		
		@Override
		public boolean end() {
			return nextIndex == items.length;
		}
		
		@Override
		public void resetIndex() {
			nextIndex = 0;
		}
		
		@Override
		public Object current() {
			return items[nextIndex];
		}
	}
}