package com.asiainfo.chapter7.exercise;

/**
 * p140练习16、17
 * 
 * @author zhangzhiwang 2015年8月9日
 */
public class Amphibian {
	public static void main(String[] args) {
		Frog f = new Frog();
		f.func1();
		f.func2();
		Amphibian a = new Frog();
		a.func1();
		a.func2();// 向上转型之后，调用的仍然是子类重写的方法
	}

	public void func1() {
		System.out.println("Amphibian.func1()");
	}

	public void func2() {
		System.out.println("Amphibian.func2()");
	}
}

class Frog extends Amphibian {
	public void func2() {
		System.out.println("Frog.func2()");
	}
}