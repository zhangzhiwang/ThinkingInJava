package com.asiainfo.chapter5.exercise;

/**
 * p86��ϰ9
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��4��
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
