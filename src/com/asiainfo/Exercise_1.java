package com.asiainfo;

/**
 * p171练习1
 * 
 * @author zhangzw8@asiainfo.com
 * @date 2015年8月17日 上午9:09:57
 */
public class Exercise_1 {
	public static void main(String[] args) {
		Rodent[] rodents = { new Cat(), new Mouse() };

		for (Rodent r : rodents) {
			r.eat();
		}
	}
}

abstract class Rodent {
	abstract public void eat();
}

class Cat extends Rodent {
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}
}

class Mouse extends Rodent {
	@Override
	public void eat() {
		System.out.println("Mouse.eat");
	}
}