package com.asiainfo.chapter7.exercise;

/**
 * p130Á·Ï°9
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ7ÈÕ
 */
public class Exercise_9 {
	public static void main(String[] args) {
		new Stem();
	}
}

class Root {
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();

	public Root() {
		System.out.println("Root()");
	}
}

class Stem extends Root {
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();

	public Stem() {
		System.out.println("Stem()");
	}
}

class Component1 {
	public Component1() {
		System.out.println("Component1()");
	}
}

class Component2 {
	public Component2() {
		System.out.println("Component2()");
	}
}

class Component3 {
	public Component3() {
		System.out.println("Component3()");
	}
}
