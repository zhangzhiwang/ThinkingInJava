package com.asiainfo;

/**
 * p171练习3
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 上午9:14:09
 */
public abstract class Exercise_3 {
	
	public Exercise_3() {
		print();
	}
	
	public abstract void print();
	
	public static void main(String[] args) {
		Car1 c = new Car1();
		c.print();
	}
}

class Car1 extends Exercise_3 {
	private int age = 1;
	
	@Override
	public void print() {
		System.out.println("age = " + age);
	}
}