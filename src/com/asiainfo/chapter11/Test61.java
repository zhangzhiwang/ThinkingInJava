package com.asiainfo.chapter11;

import java.util.Iterator;

/**
 * 不实现Collection以及不继承AbstractCollection也能创建自己的集合
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月1日 下午9:53:40
 */
public class Test61 {
	public static void main(String[] args) {
		MySequence s = new MySequence();
		iterate(s.iterator());
	}
	
	public static <T> void iterate(Iterator<T> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}
}

class CCArray {
	CC[] ccs = new CC[] { new CC(1), new CC(2) };
}

class MySequence extends CCArray {
	public <CC> Iterator<CC> iterator() {
		return new Iterator<CC>() {
			private int index;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < ccs.length;
			}

			@Override
			public CC next() {
				// TODO Auto-generated method stub
				return (CC) ccs[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				return;
			}

		};
	}
}