package com.asiainfo.chapter5;

/**
 * 成员变量初始化
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月7日
 */
public class Test32 {
	public static void main(String[] args) {
		new Truck2();
	}
}

class Truck2 extends Truck4 {
	Truck3 t = new Truck3();

	public Truck2() {
		System.out.println("Truck2");
	}
}

class Truck3 {
	public Truck3() {
		System.out.println("Truck3");
	}
}

class Truck4 {
	public Truck4() {
		System.out.println("Truck4");
	}
}