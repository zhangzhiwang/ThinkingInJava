package com.asiainfo.chapter15;

/**
 * 元组
 *
 * @author zhiwangzhang
 * @date 2016年6月12日 下午10:33:50
 */
public class Test3<X> {
	private X x;

	public Test3() {
	}

	public Test3(X x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Test3 [x=" + x + "]";
	}
	
	public static void main(String[] args) {
		Test3<Integer> test3 = new Test3<Integer>(1);
		System.out.println(test3);
		
		Test3_1<String, String> test3_1 = new  Test3_1<String, String>("hello", "world");
		System.out.println(test3_1);
		
		Test3_1_1<Boolean, Double, A> test3_1_1 = new Test3_1_1<Boolean, Double, A>(true, 0.01, new A(1));
		System.out.println(test3_1_1);
		
		Test3_2<Integer, Float, Boolean, A, Test2<Integer>> test3_2 = new Test3_2<Integer, Float, Boolean, A, Test2<Integer>>(1, 1.1f, false, new Test2<Integer>(1), new A(1));
		System.out.println(test3_2);
	}
}

class Test3_1<X, Y> extends Test3<X> {
	private Y y;
	
	public Test3_1() {}
	public Test3_1(X x, Y y) {
		super(x);
		this.y = y;
	}
	@Override
	public String toString() {
		return "Test3_1 [y=" + y + "]";
	}
	
	
}

class Test3_1_1<X, Y, Z> extends Test3_1<X, Y>{
	private Z z;
	
	public Test3_1_1() {}
	public Test3_1_1(X x, Y y, Z z) {
		super(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "Test3_1_1 [z=" + z + "]";
	}
	
}

class Test3_2<A, B, C, D, X> extends Test3<X>{
	private A a;
	private B b;
	private D d;
	private C c;
	
	public Test3_2() {}
	public Test3_2(A a, B b, C c,  X x,D d) {
		super(x);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Test3_2 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
}
