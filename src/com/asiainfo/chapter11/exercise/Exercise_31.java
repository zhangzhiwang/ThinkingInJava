package com.asiainfo.chapter11.exercise;

import java.util.Iterator;

/**
 * p243练习31
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年12月2日 下午1:14:00
 */
public class Exercise_31 implements Iterable<GG> {
	private int num;

	public Exercise_31(int num) {
		super();
		this.num = num;
	}

	public Exercise_31() {
		super();
	}

	public GG nextGG() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return new GG1(1);
		case 1:
			return new GG2(2);
		case 2:
			return new GG3(3);
		default:
			return null;
		}
	}

	@Override
	public Iterator<GG> iterator() {

		return new Iterator<GG>() {
			private int index;

			@Override
			public boolean hasNext() {
				return index < num;
			}

			@Override
			public GG next() {
				index++;
				return nextGG();
			}

			@Override
			public void remove() {
				return;
			}
		};
	}

	public static void main(String[] args) {
		for (GG gg : new Exercise_31(10)) {
			System.out.println(gg);
		}
	}
}

interface GG {
}

class GG1 implements GG {
	private int id;

	public GG1(int id) {
		super();
		this.id = id;
	}

	public GG1() {
		super();
	}

	@Override
	public String toString() {
		return "GG1 [id=" + id + "]";
	}

}

class GG2 implements GG {
	private int id;

	public GG2(int id) {
		super();
		this.id = id;
	}

	public GG2() {
		super();
	}

	@Override
	public String toString() {
		return "GG2 [id=" + id + "]";
	}
}

class GG3 implements GG {
	private int id;

	public GG3(int id) {
		super();
		this.id = id;
	}

	public GG3() {
		super();
	}

	@Override
	public String toString() {
		return "GG3 [id=" + id + "]";
	}
}