package com.asiainfo.chapter11.exercise;

import java.util.Collection;
import java.util.Iterator;

/**
 * p241练习30
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月1日 下午10:03:42
 */
public class Exercise_30 {
	public static void main(String[] args) {
		DDSequence dds = new DDSequence();
		iterate(dds.iterator());
	}
	
	public static <T> void iterate(Iterator<T> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}
}

class DD {
	private int id;

	public DD(int id) {
		super();
		this.id = id;
	}

	public DD() {
		super();
	}

	@Override
	public String toString() {
		return "DD [id=" + id + "]";
	}

}

class DDSequence implements Collection<DD> {
	private DD[] dds = new DD[] { new DD(1), new DD(2) };

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return dds.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object paramObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<DD> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<DD>() {
			private int index;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < dds.length;
			}

			@Override
			public DD next() {
				// TODO Auto-generated method stub
				return dds[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				return;
			}

		};
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] paramArrayOfT) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(DD paramE) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object paramObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends DD> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> paramCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}
}