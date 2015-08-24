package com.asiainfo.chapter10;

/**
 * 用匿名内部类实现工厂模式
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月24日 下午3:08:58
 */
public class Test28 {
	public static void func1(Factory f) {
		Car c = f.getCar();
		c.run();
	}
	
	public static void main(String[] args) {
		func1(Car1.f);
		func1(Car2.f);
	}
}

interface Car {
	void run();
}

class Car1 implements Car {
	public static Factory f = new Factory() {
		@Override
		public Car getCar() {
			return new Car1();
		}
	};

	@Override
	public void run() {
		System.out.println("Car1.run()");
	}
}

class Car2 implements Car {
	public static Factory f = new Factory() {
		@Override
		public Car getCar() {
			return new Car2();
		}
	};

	@Override
	public void run() {
		System.out.println("Car2.run()");
	}
}

interface Factory {
	Car getCar();
}