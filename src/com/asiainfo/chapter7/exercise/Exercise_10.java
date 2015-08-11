package com.asiainfo.chapter7.exercise;

/**
 * p130��ϰ10
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��7��
 */
public class Exercise_10 {
	public static void main(String[] args) {
		new Stem23(1);
	}
}

class Root2 {
	Component123 c1 = new Component123(1);
	Component223 c2 = new Component223(1);
	Component323 c3 = new Component323(1);

	public Root2(int i) {
		System.out.println("Root2()");
	}
}

class Stem2 extends Root2 {
	Component123 c1 = new Component123(1);
	Component223 c2 = new Component223(2);
	Component323 c3 = new Component323(3);

	public Stem2(int i) {
		super(i);
		System.out.println("Stem2()");
	}
}

class Component123 {
	public Component123(int i) {
		System.out.println("Component12()");
	}
}

class Component22 {
	public Component22(int i) {
		System.out.println("Component22()");
	}
}

class Component32 {
	public Component32(int i) {
		System.out.println("Component32()");
	}
}