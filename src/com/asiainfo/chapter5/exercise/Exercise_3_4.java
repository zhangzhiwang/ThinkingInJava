package com.asiainfo.chapter5.exercise;

/**
 * p83��ϰ3��4
 * 
 * @author zhangzw8@asiainfo.com\n 2015��8��3��
 */
public class Exercise_3_4 {
	public Exercise_3_4() {
		System.out.println("Hello world!");
	}

	public Exercise_3_4(String name) {
		this();
		System.out.println(name);
	}

	public static void main(String[] args) {
		Exercise_3_4 e = new Exercise_3_4();
		Exercise_3_4 e1 = new Exercise_3_4("Tom");
	}
}
