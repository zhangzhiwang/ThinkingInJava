package com.asiainfo.chapter6;

/**
 * 私有访问权限——private
 * 
 * @author zhangzw8@asiainfo.com\n 2015年8月6日
 */
public class Test7 {
	private static int i = 1;

	public static void main(String[] args) {
		System.out.println(Test7.i);
	}
}
 class Car3 extends Test7{
	 public static void func () {
//		 System.out.println(Test7.i);
	 }
 }