package com.asiainfo.chapter9;

/**
 * 工厂方法模式
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月18日 下午4:06:31
 */
public class Test15 {
	public static void func1(Factory f) {
		Fruit fruit = f.getFruit();
		fruit.color();
	}
	
	public static void main(String[] args) {
		func1(new AppleFactory());
		func1(new OrangeFactory());
	}
}

interface Fruit {
	void color();
}

class Apple implements Fruit {
	@Override
	public void color() {
		System.out.println("Apple.color");
	}
}

class Orange implements Fruit {
	@Override
	public void color() {
		System.out.println("Orange.color");
	}
}

interface Factory {
	Fruit getFruit();
}

class AppleFactory implements Factory {
	@Override
	public Fruit getFruit() {
		return new Apple();
	}
}

class OrangeFactory implements Factory {
	@Override
	public Fruit getFruit() {
		return new Orange();
	}
}