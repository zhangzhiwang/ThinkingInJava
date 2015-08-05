package com.asiainfo.chapter5.exercise;

/**
 * p105练习19
 * @author zhangzhiwang
 * 2015年8月5日
 */
public class Exercise_19 {
	public static void main(String[] args) {
		func("a","1","abc");
		func(new String[1]);
		func(new String[]{});
	}
	
	public static void func(String... args) {
		System.out.println(args.length);
	}
}
