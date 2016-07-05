package com.asiainfo.chapter15.exercise;

/**
 * p367练习16
 * 
 * @author zhangzw8
 * @date 2016年7月5日 上午9:38:01
 */
public class Exercise_16 {
	public static void main(String[] args) {
		Exercise_16_1<Integer> e1 = Exercise_16Util.m1(1);
		Exercise_16_2<Boolean, Double> e2 = Exercise_16Util.m2(true, 2.0);
		System.out.println(e1);
		System.out.println(e2);
	}
}

class Exercise_16_1<A> {
	private A a;

	public Exercise_16_1() {
	}

	public Exercise_16_1(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Exercise_16_1 [a=" + a + "]";
	}

}

class Exercise_16_2<A, B> extends Exercise_16_1<A> {
	private B b;

	public Exercise_16_2() {
	}

	public Exercise_16_2(A a, B b) {
		super(a);
		this.b = b;
	}

	@Override
	public String toString() {
		return super.toString() + "," + "Exercise_16_2 [b=" + b + "]";
	}

}

class Exercise_16Util {
	public static <A> Exercise_16_1<A> m1(final A a) {
		return new Generator<Exercise_16_1<A>>() {
			@Override
			public Exercise_16_1<A> next() {
				return new Exercise_16_1<A>(a);
			}
		}.next();
	}

	public static <A, B> Exercise_16_2<A, B> m2(final A a, final B b) {
		return new Generator<Exercise_16_2<A, B>>() {
			@Override
			public Exercise_16_2<A, B> next() {
				return new Exercise_16_2<A, B>(a, b);
			}
		}.next();
	}
}