package com.asiainfo.chapter7.exercise;

/**
 * p135练习12
 * 
 * @author zhangzhiwang 2015年8月8日
 */
public class Exercise_12 {
	public static void main(String[] args) {
		new Stem23(1).dispose();
	}
}

class Root23 {
	Component1234 c1 = new Component1234(1);
	Component223 c2 = new Component223(2);
	Component323 c3 = new Component323(3);

	public Root23(int i) {
		System.out.println("Root23()");
	}

	public void dispose() {
		System.out.println("Root23.dispose()");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}

class Stem23 extends Root23 {
	Component1234 c1 = new Component1234(1);
	Component223 c2 = new Component223(2);
	Component323 c3 = new Component323(3);

	public Stem23(int i) {
		super(i);
		System.out.println("Stem23()");
	}

	public void dispose() {
		System.out.println("Stem23.dispose()");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
	}
}

class Component1234 {
	public Component1234(int i) {
		System.out.println("Component1234()");
	}

	public void dispose() {
		System.out.println("Component1234.dispose()");
	}
}

class Component223 {
	public Component223(int i) {
		System.out.println("Component223()");
	}

	public void dispose() {
		System.out.println("Component223.dispose()");
	}
}

class Component323 {
	public Component323(int i) {
		System.out.println("Component323()");
	}

	public void dispose() {
		System.out.println("Component323.dispose()");
	}
}