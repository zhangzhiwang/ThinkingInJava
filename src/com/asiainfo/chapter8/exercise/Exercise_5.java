package com.asiainfo.chapter8.exercise;

/**
 * p153Á·Ï°5
 *
 * @author zhangzw8@asiainfo.com\n
 *         2015Äê8ÔÂ10ÈÕ
 */
public class Exercise_5 {
	public static void main(String[] args) {
		Cycle2 c1 = new Cycle2();
		System.out.println(c1.ride(new Unicycle2()));
		System.out.println(c1.ride(new Bicycle2()));
		System.out.println(c1.ride(new Tricycle2()));
	}
}

class Cycle2 {
	public int ride(Cycle2 c) {
		System.out.println("Cycle2.ride");
		return c.wheels();
	}
	
	public int wheels() {
		return 0;
	}
}

class Unicycle2 extends Cycle2 {
	@Override
	public int ride(Cycle2 u) {
		System.out.println("Unicycle2.ride");
		return u.wheels();
	}
	
	@Override
	public int wheels() {
		return 1;
	}
}

class Bicycle2 extends Cycle2 {
	@Override
	public int ride(Cycle2 b) {
		System.out.println("Bicycle2.ride");
		return b.wheels();
	}
	
	
	@Override
	public int wheels() {
		return 2;
	}
}

class Tricycle2 extends Cycle2 {
	@Override
	public int ride(Cycle2 t) {
		System.out.println("Tricycle2.ride");
		return t.wheels();
	}
	
	@Override
	public int wheels() {
		return 3;
	}
}