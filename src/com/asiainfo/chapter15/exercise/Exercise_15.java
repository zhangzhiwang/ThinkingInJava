package com.asiainfo.chapter15.exercise;

/**
 * p367练习15
 * 
 * @author zhangzw8
 * @date 2016年7月5日 上午8:55:06
 */
public class Exercise_15 {
	public static Exercise_15_1<Integer> f1() {
		return Exercise_15Util.m1(1);
	}
	
	public static Exercise_15_1 f2() {
		return Exercise_15Util.m1(1);
	}
	
	public static Exercise_15_2<String, Boolean> f3() {
		return Exercise_15Util.m2("hello", true);
	}
	
	public static void main(String[] args) {
		Exercise_15_1<Integer> e1 = Exercise_15.f1();
		Exercise_15_1<Integer> e2 = Exercise_15.f2();//Type safety: The expression of type Exercise_15_1 needs unchecked conversion to conform to Exercise_15_1<Integer>   存在类型安全问题
		Exercise_15_1 e3 = Exercise_15.f2();//这样不会有类型安全问题
	}
}

class Exercise_15_1<A> {
	private A a;

	public Exercise_15_1() {
	}

	public Exercise_15_1(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "A";
	}
}

class Exercise_15_2<A, B> extends Exercise_15_1<A> {
	private B b;

	public Exercise_15_2() {
	}

	public Exercise_15_2(A a, B b) {
		super(a);
		this.b = b;
	}

	@Override
	public String toString() {
		return "B";
	}
}

class Exercise_15Util {
	public static <A> Exercise_15_1<A> m1(A a) {
		return new Exercise_15_1<A>(a);
	}

	public static <A, B> Exercise_15_2<A, B> m2(A a, B b) {
		return new Exercise_15_2<A, B>(a, b);
	}
}