package com.asiainfo.chapter8.exercise;

/**
 * p155Á·Ï°9
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ10ÈÕ
 */
public class Exercise_9 {
	public static void main(String[] args) {
		Rodent[] rodents = { new Cat(), new Mouse() };

		for (Rodent r : rodents) {
			r.eat();
		}
	}
}

class Rodent {
	public void eat() {
		System.out.println("Rodent.eat");
	}
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