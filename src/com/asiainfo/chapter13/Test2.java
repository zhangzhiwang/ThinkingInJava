package com.asiainfo.chapter13;

/**
 * 这该如何解释？
 * 
 * @author zhangzw8
 * @date 2016年2月2日 下午12:40:13
 */
public class Test2 {
	public static void main(String[] args) {
		String a;
		String b;
		String c;
		a = b = c = "hello";
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a == c);
		System.out.println("--------------------");

		String a1 = "hello";
		String b1 = "hello";
		String c1 = "hello";
		System.out.println(a1 == b1);
		System.out.println(b1 == c1);
		System.out.println(a1 == c1);
		System.out.println("---------------");

		System.out.println("123" == "123");
		System.out.println("--------------");

		String d1 = new String("world");
		String d2 = "world";
		String d3 = "world";
		System.out.println(d1 == d2);
		System.out.println(d2 == d3);
		System.out.println(d2.equals(d3));
	}
}
