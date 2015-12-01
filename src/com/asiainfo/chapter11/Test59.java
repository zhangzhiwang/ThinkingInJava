package com.asiainfo.chapter11;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * 通过继承AbstractCollection来创建自己的集合类
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月1日 下午9:35:53
 */
public class Test59 {
	public static void main(String[] args) {
		CCCollection ccc = new CCCollection();
		iterate(ccc.iterator());
	}

	public static <T> void iterate(Iterator<T> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}
}

class CCCollection extends AbstractCollection<CC> {
	private CC[] ccs = new CC[] { new CC(1), new CC(2) };

	@Override
	public Iterator<CC> iterator() {

		return new Iterator<CC>() {
			private int index;

			@Override
			public boolean hasNext() {
				return index < ccs.length;
			}

			@Override
			public CC next() {
				// TODO Auto-generated method stub
				return ccs[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				return;
			}

		};
	}

	@Override
	public int size() {
		return ccs.length;
	}
}

class CC {
	private int id;

	public CC(int id) {
		super();
		this.id = id;
	}

	public CC() {
		super();
	}

	@Override
	public String toString() {
		return "CC [id=" + id + "]";
	}

}