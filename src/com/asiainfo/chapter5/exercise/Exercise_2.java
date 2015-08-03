package com.asiainfo.chapter5.exercise;

/**
 * p77Á·Ï°2
 * 
 * @author zhangzw8@asiainfo.com\n 2015Äê8ÔÂ3ÈÕ
 */
public class Exercise_2 {
	private String name = "Tom";

	public Exercise_2(String name) {
		this.name = name;
	}

	public Exercise_2() {
	}

	public static void main(String[] args) {
		System.out.println(new Exercise_2().name);
		System.out.println(new Exercise_2("Jemmy").name);
	}
}
