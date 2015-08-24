package com.asiainfo.chapter10.exercise;

/**
 * p201练习16
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午3:29:12
 */
public class Exercise_16 {
	public static void func1(CycleFactory factory) {
		Cycle cycle = factory.getCycle();
		cycle.run();
	}
	
	public static void main(String[] args) {
		func1(Unicycle.c);
		func1(Bicycle.c);
		func1(Tricycle.c);
	}
}

interface Cycle {
	void run();
}

class Unicycle implements Cycle {
	public static CycleFactory c = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};

	@Override
	public void run() {
		System.out.println("Unicycle.run()");
	}
}

class Bicycle implements Cycle {
	public static CycleFactory c = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};

	@Override
	public void run() {
		System.out.println("Bicycle.run()");
	}
}

class Tricycle implements Cycle {
	public static CycleFactory c = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};

	@Override
	public void run() {
		System.out.println("Tricycle.run()");
	}
}

interface CycleFactory {
	Cycle getCycle();
}