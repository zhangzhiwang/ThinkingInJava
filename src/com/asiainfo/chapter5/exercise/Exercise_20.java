package com.asiainfo.chapter5.exercise;

/**
 * p105练习20
 * 
 * @author zhangzhiwang 2015年8月5日
 */
public class Exercise_20 {
	public static void main(String[] args) {
		Others.main("1", "abc");
		Others.main("1", "abc", "hello");
	}
}

class Others {
	public static void main(String... args) {
		for (String s : args) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
}