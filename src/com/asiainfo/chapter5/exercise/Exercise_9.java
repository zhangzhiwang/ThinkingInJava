package com.asiainfo.chapter5.exercise;

/**
 * p86Á·Ï°9
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ4ÈÕ
 */
public class Exercise_9 {
	private int age;

	public static void main(String[] args) {
		Exercise_9 e = new Exercise_9(1);
		System.out.println(e.age);
	}

	public Exercise_9() {
		System.out.println("Execise_9()");
	}

	public Exercise_9(int age) {
		this();
		this.age = age;
		System.out.println("Execise_9(int age)");
	}
}
