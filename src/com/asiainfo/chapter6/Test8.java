package com.asiainfo.chapter6;

import com.asiainfo.chapter6.exercise.*;

/**
 * 锟教承凤拷锟斤拷权锟睫ｏ拷同时锟斤拷锟叫帮拷锟斤拷锟斤拷权锟睫ｏ拷锟斤拷锟斤拷protected
 * 
 * @author zhangzw8@asiainfo.com\n 2015锟斤拷8锟斤拷6锟斤拷
 */
public class Test8 {
	protected static String name = "Test8";
	static int age = 1;

	public static void main(String[] args) {
		System.out.println(Test8.name);
		System.out.println(Test8.age);
	}
}

class Car4 {
	public void func() {
		System.out.println(Test8.name);// protected锟斤拷锟斤拷邪锟斤拷锟斤拷锟饺拷锟�
	}
}

class Car5 extends Test8{
	public void func() {
		System.out.println(Test8.name);// 锟教承凤拷锟斤拷权锟斤拷
	}
}