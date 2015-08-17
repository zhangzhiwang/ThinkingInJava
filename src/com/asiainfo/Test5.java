package com.asiainfo;

/**
 * 抽象类的继承
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 上午8:51:35
 */
public class Test5 {
	public static void main(String[] args) {
		Car[] cars = {
//				new Car(),// 抽象类不能实例化对象
				new Benz(),
				new MiniBenz()
		};
		
		for (Car c : cars) {
			c.func3();
		}
	}
}

abstract class Car {
	public abstract void func1();

	public abstract void func2();

	public void func3() {
		System.out.println("Car.func3()");
	}
}

class Benz extends Car {
	@Override
	public void func1() {
		System.out.println("Benz.func1()");
	}

	@Override
	public void func2() {
		System.out.println("Benz.func2()");
	}

	@Override
	public void func3() {
		System.out.println("Benz.func3()");
	}
}

class MiniBenz extends Benz {
	@Override
	public void func3() {
		System.out.println("MiniBenz.func3()");
	}
}

abstract class MiniBenzSmall extends MiniBenz {// 抽象类可以继承非抽象类
	@Override
	public void func3() {}
	
	public abstract void func4();
}