package com.asiainfo.chapter7;

/**
 * 类的加载与初始化（详细过程参见p147）
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月10日
 */
public class Test100 extends SmallCar {
	public static Truck3 t1 = new Truck3(3);

	public Test100(int i) {
		super(i);
		System.out.println("Test100: " + i);
	}

	public Test100() {
	}

	public Truck3 t3 = new Truck3(2);

	public static void main(String[] args) {
		System.out.println("-----------------");
		new Test100(3);
	}

}

class Car100 {
	public static Truck3 c1 = new Truck3(1);
	public int num = (int) (Math.random() * 100);

	public Car100(int i) {
		System.out.println(this.num);
		System.out.println("Car100() " + i);
	}

	public Car100() {
	}

	public Truck3 c2 = new Truck3(2);
	public static Truck3 c3 = new Truck3(11);

	public static void func1() {// 在类初始化过程中不会执行静态方法
		System.out.println("Car100.func1()");
	}
}

class SmallCar extends Car100 {
	public static Truck3 s1 = new Truck3(2);

	public SmallCar() {
		super();
	}

	public SmallCar(int i) {
		super(i);
		System.out.println("SmallCar: " + i);
	}

	public Truck3 s2 = new Truck3(2);
}

class Truck3 {
	public Truck3(int i) {
		System.out.println("Truck3: " + i);
	}
}
