package com.asiainfo.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * 在匿名内部类中使用泛型
 * 
 * @author zhangzw8
 * @date 2016年7月8日 上午9:37:45
 */
public class Test40<T> {
	public static void m1(Test40_1 t1, Test40_2 t2) {
		System.out.println(t1 + " serves " + t2);
	}

	public static void main(String[] args) {
		List<Test40_1> l1 = (List<Test40_1>) Test30.fill(new ArrayList<Test40_1>(), Test40_1.generate(), 5);
		List<Test40_2> l2 = (List<Test40_2>) Test30.fill(new ArrayList<Test40_2>(), Test40_2.GEN, 5);
		for (Test40_2 t : l2) {
			m1(l1.get((int) (Math.random() * 4)), t);
		}
	}

}

class Test40_1 {
	private static int count = 0;
	private int id = count++;

	private Test40_1() {
	}

	public static Generator3<Test40_1> generate() {
		return new Generator3<Test40_1>() {
			@Override
			public Test40_1 next() {
				return new Test40_1();
			}
		};
	}

	@Override
	public String toString() {
		return "Test40_1-" + id;
	}
}

class Test40_2 {
	private static int count = 0;
	private int id = count++;
	public static final Generator3<Test40_2> GEN = new Generator3<Test40_2>() {
		@Override
		public Test40_2 next() {
			return new Test40_2();
		}
	};

	private Test40_2() {
	}

	@Override
	public String toString() {
		return "Test40_2-" + id;
	}
}