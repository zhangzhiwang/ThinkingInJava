package com.asiainfo.chapter7.exercise;

/**
 * p130Á·Ï°10
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ7ÈÕ
 */
public class Exercise_10 {
	public static void main(String[] args) {
		new Stem2(1);
	}
}

class Root2 {
	Component12 c1 = new Component12(1);
	Component22 c2 = new Component22(1);
	Component32 c3 = new Component32(1);

	public Root2(int i) {
		System.out.println("Root2()");
	}
}

class Stem2 extends Root2 {
	Component12 c1 = new Component12(1);
	Component22 c2 = new Component22(2);
	Component32 c3 = new Component32(3);

	public Stem2(int i) {
		super(i);
		System.out.println("Stem2()");
	}
}

class Component12 {
	public Component12(int i) {
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