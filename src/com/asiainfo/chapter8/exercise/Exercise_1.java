package com.asiainfo.chapter8.exercise;

/**
 * p150Á·Ï°1
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ10ÈÕ
 */
public class Exercise_1 {
	public static void main(String[] args) {
		Cycle c1 = new Cycle();
		c1.ride(c1);
		c1.ride(new Unicycle());// upcasting
		c1.ride(new Tricycle());

		Cycle c2 = new Unicycle();
		c2.ride(new Tricycle());

		Cycle c3 = new Tricycle();
		c3.ride(new Cycle());
	}
}

class Cycle {
	public void ride(Cycle c) {
		System.out.println("Cycle.ride");
	}
}

class Unicycle extends Cycle {
	@Override
	public void ride(Cycle u) {
		System.out.println("Unicycle.ride");
	}
}

class Bicycle extends Cycle {
	@Override
	public void ride(Cycle b) {
		System.out.println("Bicycle.ride");
	}
}

class Tricycle extends Cycle {
	@Override
	public void ride(Cycle t) {
		System.out.println("Tricycle.ride");
	}
}
