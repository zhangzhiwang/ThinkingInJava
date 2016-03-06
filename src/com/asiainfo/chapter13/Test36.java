package com.asiainfo.chapter13;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Scanner的useDelimiter()和delimiter()方法
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午7:11:07
 */
public class Test36 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner("1,3,5");
		s1.useDelimiter(",");
		while (s1.hasNextInt()) {
			System.out.print(s1.nextInt() + "\t");
		}
		System.out.println();
		System.out.println(s1.delimiter().toString());
		s1 = new Scanner("1.2|3.4|5.6|7.8");
		s1.useDelimiter(Pattern.compile("\\|"));
		while (s1.hasNextDouble()) {
			System.out.print(s1.nextDouble() + "\t");
		}
		System.out.println();
		System.out.println(s1.delimiter().toString());
		s1 = new Scanner("123 456 789");
		Pattern p = s1.delimiter();
		System.out.println("The pattern is " + p.toString());
	}
}
