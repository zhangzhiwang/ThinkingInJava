package com.asiainfo.chapter9.exercise;

/**
 * p188练习18
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午4:17:47
 */
public class Exercise_18 {
	public static void func1(CycleFactory C) {
		Cycle cycle = C.getCycle();
		cycle.run();
	}
	
	public static void main(String[] args) {
		func1(new UnicycleFactory());
		func1(new BicycleFactory());
		func1(new TricycleFactory());
	}
}

interface Cycle {
	void run();
}

class Unicycle implements Cycle {
	@Override
	public void run() {
		System.out.println("Unicycle.run()");
	}
}

class Bicycle implements Cycle {
	@Override
	public void run() {
		System.out.println("Bicycle.run()");
	}
}

class Tricycle implements Cycle {
	@Override
	public void run() {
		System.out.println("Tricycle.run()");
	}
}

interface CycleFactory {
	Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class BicycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class TricycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
}