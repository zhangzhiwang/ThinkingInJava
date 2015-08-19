package com.asiainfo.chapter9;

/**
 * 协变返回类型——子类复写父类的方法，返回值类型不能比父类的大
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午2:03:15
 */
public class Test7 {
 
}

class Car2 {
	public Car2 func1() {
		return new Car2();
	}
}

class MiniCar extends Car2 {
	@Override
	public MiniCar func1() {
		return new MiniCar();
	}
}

class MiniCarSmall extends MiniCar {
//	@Override
//	public Car2 func1() {
//		return new Car2();
//	}
}