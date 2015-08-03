package com.asiainfo.chapter5.exercise;

/**
 * p83Á·Ï°5¡¢6
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ3ÈÕ
 */
public class Exercise_5_6 {
	public static void main(String[] args) {
		byte b = 1;
		float f = 1f;
		Dog d = new Dog();
		d.bark();
		d.bark(b);
		d.bark(f);
		d.bark(b, f);
		d.bark(f, b);
	}
}

class Dog {
	public void bark() {
		System.out.println("sleeping");
	}

	public void bark(byte b) {
		System.out.println("barking");
	}

	public void bark(float f) {
		System.out.println("howling");
	}

	public void bark(byte b, float f) {
		System.out.println("byte,float");
	}

	public void bark(float f, byte b) {
		System.out.println("float,byte");
	}
}
