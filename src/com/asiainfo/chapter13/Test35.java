package com.asiainfo.chapter13;

import java.util.Scanner;

/**
 * Scanner的next()和nextLine()的区别
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月6日 下午7:02:24
 */
public class Test35 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner("123 zzw 1.2");
		Scanner s2 = new Scanner("123 zzw 1.2");
		System.out.println(s1.next());
		System.out.println(s2.nextLine());
		System.out.println("-------------------");
		
		s1 = new Scanner("123 zzw 1.2\nabc 456");
		s2 = new Scanner("123 zzw 1.2\nabc 456");
		while (s1.hasNext()) {
			System.out.println(s1.next());
		}
		System.out.println("========================");
		while (s2.hasNext()) {
			System.out.println(s2.nextLine());
		}
	}
}
