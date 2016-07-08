package com.asiainfo.chapter15.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * p370练习18
 * 
 * @author zhangzw8
 * @date 2016年7月8日 上午9:54:51
 */
public class Exercise_18 {
	public static <T> Collection<T> fill(Collection<T> col, Generator<T> gen, int size) {
		for (int i = 0; i < size; i++) {
			col.add(gen.next());
		}
		return col;
	}

	public static void eat(BigFish b, SmallFish s) {
		System.out.println(b + " eats " + s);
	}

	public static void main(String[] args) {
		List<BigFish> l1 = (List<BigFish>) fill(new ArrayList<BigFish>(), BigFish.generator(), 5);
		Collection<SmallFish> c2 = fill(new ArrayList<SmallFish>(), SmallFish.GEN, 5);
		for (SmallFish s : c2) {
			eat(l1.get((int) (Math.random() * 4)), s);
		}
	}
}

class BigFish {
	private static int count;
	private int id = count++;

	private BigFish() {
	}

	public static Generator<BigFish> generator() {
		return new Generator<BigFish>() {
			@Override
			public BigFish next() {
				return new BigFish();
			}
		};
	}

	@Override
	public String toString() {
		return "BigFish" + id;
	}
}

class SmallFish {
	private static int count;
	private int id = count++;
	public static Generator<SmallFish> GEN = new Generator<SmallFish>() {
		@Override
		public SmallFish next() {
			return new SmallFish();
		}
	};

	private SmallFish() {
	}

	public String toString() {
		return "SmallFish" + id;
	}
}