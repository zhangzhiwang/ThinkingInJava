package com.asiainfo.chapter3.exercices;

/**
 * 练习14
 * 
 * @author zhangzhiwang 2015年7月12日
 */
public class Excercise_14 {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "1";
		func(s1, s2);
		System.out.println("----------");
		String s3 = new String("1");
		String s4 = new String("1");
		func(s3, s4);
	}

	public static void func(String s1, String s2) {
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 != s2);
	}
}
