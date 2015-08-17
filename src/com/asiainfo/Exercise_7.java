package com.asiainfo;


/**
 * p174练习7
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 下午4:08:10
 */
public class Exercise_7 {
	public static void main(String[] args) {
		Rodent2[] rodents = { new Cat2(), new Mouse2() };

		for (Rodent2 r : rodents) {
			r.eat();
		}
	}
}

interface Rodent2 {
	void eat();
}

class Cat2 implements Rodent2 {
	@Override
	public void eat() {
		System.out.println("Cat2.eat");
	}
}

class Mouse2 implements Rodent2 {
	@Override
	public void eat() {
		System.out.println("Mouse2.eat");
	}
}