package com.asiainfo.chapter13;

/**
 * String是不可变的
 * 
 * @author zhangzw8
 * @date 2016年2月23日 上午9:30:49
 */
public class Test1 {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("s = " + s1);
		String ss = met1(s1);//相当于把s1的引用copy一份传递给方法met1()，然后该方法拿着s1引用的carbon去操作，返回的是一个新的字符串
		System.out.println("ss = " + ss);
		System.out.println("s = " + s1);
	}

	public static String met1(String s) {//拿到的是实参引用的carbon并对其操作
		return s + " world";
	}
}
